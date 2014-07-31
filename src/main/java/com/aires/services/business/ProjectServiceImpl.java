package com.aires.services.business;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.aires.dao.ProjectDetailsDAO;
import com.aires.dao.UserProjectDAO;
import com.aires.db.model.Clients;
import com.aires.db.model.Contacts;
import com.aires.db.model.LabReportRecipients;
import com.aires.db.model.Labs;
import com.aires.db.model.Project;
import com.aires.db.model.Projects;
import com.aires.db.model.SampleChemicals;
import com.aires.db.model.SamplePpe;
import com.aires.db.model.Samples;
import com.aires.db.model.TurnaroundTimes;
import com.aires.db.model.Users;
import com.aires.exceptions.ProjectNotFoundException;
import com.aires.view.model.ClientsViewModel;
import com.aires.view.model.ContactsViewModel;
import com.aires.view.model.LabReportRecipientsViewModel;
import com.aires.view.model.LabsViewModel;
import com.aires.view.model.ProjectDetails;
import com.aires.view.model.SampleChemicalsViewModel;
import com.aires.view.model.SamplePpeViewModel;
import com.aires.view.model.SamplesViewModel;

@Service("projectService")
@Transactional(propagation = Propagation.SUPPORTS)
public class ProjectServiceImpl implements ProjectService {

	 @Autowired
	 private ProjectDetailsDAO projectDao;
	 
	 @Autowired
	 private UserProjectDAO userProjectDAO;
	 
	@Override
	public void addProject(Projects project) {
		projectDao.addProject(project);
		
	}

	@Override
	public List<Projects> listProjects() {
		
		return projectDao.listProjects();
	}

	@Override
	public Projects getProject(int projectId) {
		return projectDao.getProject(projectId);
	}

	@Override
	public void deleteProject(int projectId) {
		projectDao.deleteProject(projectId);
		
	}

	@Override
	public List<Projects> getProjectsForUser(int userId) {
		return userProjectDAO.getProjectsForUser(userId);
	}

	public List<ProjectDetails> getProjectDetailsForUser(int userId){
		List<Projects> projects = getProjectsForUser(userId);
		
		List<ProjectDetails> projectDetails = new LinkedList<ProjectDetails>();
		for( Projects project : projects ){
			int projectId = project.getProjectId();
			ProjectDetails projViewModel = new ProjectDetails();
			mapProjectPropertiesForProjectDetails(project , projViewModel );
			
			Contacts contacts = projectDao.getContactsForProject(projectId);
			mapContactPropertiesForProjectDetails(contacts , projViewModel);
			
			Clients clients = projectDao.getClientsForProject(projectId);
			mapClientPropertiesForProjectDetails( clients, projViewModel);
			
			Users users = projectDao.getUsersForProject(projectId);
			projViewModel.setConsultant(users.getFirstName() +" "+users.getLastName());
			
			TurnaroundTimes turnaroundTimes = projectDao.getTurnaroundTimesForProject(projectId);
			projViewModel.setTurnaroundTime(turnaroundTimes.getTurnaroundTime());
			
			Labs labs = projectDao.getLabsForProject(projectId);
			mapLabPropertiesForProjectDetails(labs, projViewModel);
			
			
			List<LabReportRecipients> labReportRecipients = projectDao.getLabReportRecipients(project.getLabs().getLabId());
			mapLabExtraProperties(labReportRecipients,projViewModel);
			

			List<Samples> samples = projectDao.getSamplesForProject(projectId);
			mapSamplesForProjectDetails(samples , projViewModel);
			
			
			projectDetails.add(projViewModel);
			
		
		}
		
		return projectDetails;
	}


	private void mapSamplesForProjectDetails(List<Samples> samples,
			ProjectDetails projViewModel) {
		
		Set<SamplesViewModel> samplesViewModelSet = new HashSet<SamplesViewModel>();
		for(Samples sample : samples){
			SamplesViewModel sampleViewModel = new SamplesViewModel();
			
			sampleViewModel.setArea(sample.getArea());
			sampleViewModel.setComments(sample.getComments());
			sampleViewModel.setCreatedOn(sample.getCreatedOn());
//			sampleViewModel.setDeviceTypes(sample.getDeviceTypes());
			sampleViewModel.setEmployeeJob(sample.getEmployeeJob());
			sampleViewModel.setEmployeeName(sample.getEmployeeName());
			sampleViewModel.setMinutes(sample.getMinutes());
			sampleViewModel.setNotes(sample.getNotes());
			sampleViewModel.setOperationArea(sample.getOperationArea());
			sampleViewModel.setPpeid(sample.getPpeid());
//			sampleViewModel.setProjectId(sample.getProjects());
			sampleViewModel.setSampleId(sample.getSampleId());
			sampleViewModel.setSampleNumber(sample.getSampleNumber());
			
			
			//Add sampleChemicals to samples	
			List<SampleChemicals> sampleChemicals = projectDao.getSampleChemicalsForProject(sample.getSampleId());
			mapSampleChemicalsForProjectDetails(sampleChemicals, sampleViewModel);
			
			//Add samplePpe to samples
			List<SamplePpe> samplePpe = projectDao.getSamplePpeForProject(sample.getSampleId());
			mapSamplePpeForProjectDetails(samplePpe, sampleViewModel);
			
			samplesViewModelSet.add(sampleViewModel);
		}
		
		projViewModel.setSampleses(samplesViewModelSet);
		
	}

	private void mapSampleChemicalsForProjectDetails(
			List<SampleChemicals> sampleChemicals, SamplesViewModel sampleViewModel) {
		Set<SampleChemicalsViewModel> sampleChemicalViewModel = new HashSet<SampleChemicalsViewModel>();
		
		for(SampleChemicals sampleChem : sampleChemicals){
			SampleChemicalsViewModel sampleChemicalsVM = new SampleChemicalsViewModel();
			sampleChemicalsVM.setChemicalId(sampleChem.getSampleChemicalId());
			sampleChemicalsVM.setDeleted(sampleChem.getDeleted());
			sampleChemicalsVM.setPelcflag(sampleChem.getPelcflag());
			sampleChemicalsVM.setPelstelflag(sampleChem.getPelstelflag());
			sampleChemicalsVM.setPeltwaflag(sampleChem.getPeltwaflag());
			sampleChemicalsVM.setSampleChemicalId(sampleChem.getSampleChemicalId());
			sampleChemicalsVM.setSampleId(sampleChem.getSamples().getSampleId());
			sampleChemicalsVM.setTlvcflag(sampleChem.getTlvcflag());
			sampleChemicalsVM.setTlvstelflag(sampleChem.getTlvstelflag());
			sampleChemicalsVM.setTlvtwaflag(sampleChem.getTlvtwaflag());
			
			sampleChemicalViewModel.add(sampleChemicalsVM);
		}
		
		sampleViewModel.setSampleChemicals(sampleChemicalViewModel);
	}

	
	private void mapSamplePpeForProjectDetails(List<SamplePpe> samplePpes,
			SamplesViewModel sampleViewModel) {
		Set<SamplePpeViewModel> samplePpeViewModelSet = new HashSet<SamplePpeViewModel>();
		
		for(SamplePpe samplePpe : samplePpes){
			SamplePpeViewModel samplePpeVM = new SamplePpeViewModel();
			samplePpeVM.setDeleted(samplePpe.getDeleted());
			samplePpeVM.setPpe(samplePpe.getPpe().getProtectionEquipmentName());
			samplePpeVM.setSamplePpeid(samplePpe.getSamplePpeid());
			//TODO
			//samplePpeVM.setSamples(samplePpe.getSamples());
			
			samplePpeViewModelSet.add(samplePpeVM);
		}
		sampleViewModel.setSamplePpes(samplePpeViewModelSet);
	}

	private void mapLabExtraProperties(
			List<LabReportRecipients> labReportRecipients,
			ProjectDetails projViewModel) {

		Set<LabReportRecipientsViewModel> labRRSet = new HashSet<LabReportRecipientsViewModel>();
		for(LabReportRecipients labRR : labReportRecipients){
			LabReportRecipientsViewModel labRRViewModel = new LabReportRecipientsViewModel();
			labRRViewModel.setLabReportRecipientId(labRR.getLabReportRecipientId());
//			labRRViewModel.setLabId(labRR.getLabs().getLabId());
			labRRViewModel.setFirstName(labRR.getFirstName());
			labRRViewModel.setLastName(labRR.getLastName());
			labRRViewModel.setEmail(labRR.getEmail());
			
			labRRSet.add(labRRViewModel);
		}
		
		projViewModel.getLab().setLabReportRecipientses(labRRSet);
		
	}

	private void mapLabPropertiesForProjectDetails(Labs labs,
			ProjectDetails projViewModel) {
		
		LabsViewModel labsViewModel = new LabsViewModel();
		labsViewModel.setLabId(labs.getLabId());
		labsViewModel.setLabName(labs.getLabName());
		labsViewModel.setLabEmail(labs.getLabEmail());
		labsViewModel.setCreatedOn(labs.getCreatedOn());
		
		projViewModel.setLab(labsViewModel);
		
	}

	private void mapClientPropertiesForProjectDetails(Clients clients,
			ProjectDetails projViewModel) {
	
		ClientsViewModel clientViewModel = new ClientsViewModel();
		clientViewModel.setClientId(clients.getClientId());
		clientViewModel.setClientName(clients.getClientName());
		clientViewModel.setClientCity(clients.getClientCity());
		clientViewModel.setClientState(clients.getClientState());
		clientViewModel.setCreatedOn(clients.getCreatedOn());
		
		projViewModel.setClients(clientViewModel);
		
	}

	private void mapContactPropertiesForProjectDetails(Contacts contacts,
			ProjectDetails projViewModel) {
		
		ContactsViewModel contactsViewModel = new ContactsViewModel();
		
		contactsViewModel.setContactId(contacts.getContactId());
		contactsViewModel.setFirstName(contacts.getFirstName());
		contactsViewModel.setLastName(contacts.getLastName());
		contactsViewModel.setPhoneNumber(contacts.getPhoneNumber());
		contactsViewModel.setMobileNumber(contacts.getMobileNumber());
		contactsViewModel.setEmail(contacts.getEmail());
		contactsViewModel.setCreatedOn(contacts.getCreatedOn());
		
		projViewModel.setContact(contactsViewModel);
				
	}

	private void mapProjectPropertiesForProjectDetails(Projects project,
			ProjectDetails projViewModel) {

		projViewModel.setProjectId(project.getProjectId());
		projViewModel.setProjectDescription(project.getProjectDescription());
		projViewModel.setProjectNumber(project.getProjectNumber());
		
		projViewModel.setLocationAddress(project.getLocationAddress());
		projViewModel.setLocationAddress2(project.getLocationAddress2());
		projViewModel.setLocationCity(project.getLocationCity());
		projViewModel.setLocationState(project.getLocationState());
		projViewModel.setLocationPostalCode(project.getLocationPostalCode());
		
		projViewModel.setCompletedFlag(project.isCompletedFlag());
		
		projViewModel.setCreatedBy(project.getCreatedBy());
		projViewModel.setCreatedOn(project.getCreatedOn());
		
		projViewModel.setDateOnsite(project.getDateOnsite());
		
		projViewModel.setQcperson(project.getQcperson());
	}

	@Override
	public void updateProject(ProjectDetails project) {
		Projects projects = projectDao.getProject(project.getProjectId());
		
		if(null == projects)
			throw new ProjectNotFoundException("No project Found");
		
		//update the projects object with the new values 
		projects.setProjectDescription(project.getProjectDescription());
		projects.setProjectNumber(project.getProjectNumber());
		
		projects.setLocationAddress(project.getLocationAddress());
		projects.setLocationAddress2(project.getLocationAddress2());
		projects.setLocationCity(project.getLocationCity());
		projects.setLocationPostalCode(project.getLocationPostalCode());
		projects.setLocationState(project.getLocationState());
		
		projects.setCreatedBy(project.getCreatedBy());
		projects.setCreatedOn(project.getCreatedOn());
		
		projects.setDateOnsite(project.getDateOnsite());
		projects.setQcperson(project.getQcperson());
		projects.setCompletedFlag(project.isCompletedFlag());
		
		//update in db
		projectDao.addProject(projects);
	}
}
