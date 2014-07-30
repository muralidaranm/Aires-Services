package com.aires.services.business;

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
import com.aires.model.Clients;
import com.aires.model.Contacts;
import com.aires.model.LabReportRecipients;
import com.aires.model.Labs;
import com.aires.model.Projects;
import com.aires.model.TurnaroundTimes;
import com.aires.model.Users;

@Service("projectService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
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

	public List<Projects> getProjectDetailsForUser(int userId){
		List<Projects> projects = getProjectsForUser(userId);
		
		List<Projects> projectDetails = new LinkedList<Projects>();
		for( Projects project : projects ){
			int projectId = project.getProjectId();
			List<Contacts> contacts =projectDao.getContactsForProject(projectId);
			if(contacts.size() == 1) project.setContacts(contacts.get(0));
			
			List<Clients> clients = projectDao.getClientsForProject(projectId);
			if(clients.size() == 1) project.setClients(clients.get(0));
			
			List<Users> users = projectDao.getUsersForProject(projectId);
			if(users.size() == 1) project.setUsers(users.get(0));
			
			List<TurnaroundTimes> turnaroundTimes = projectDao.getTurnaroundTimesForProject(projectId);
			if(turnaroundTimes.size() == 1) project.setTurnaroundTimes(turnaroundTimes.get(0));
			
			List<Labs> labs = projectDao.getLabsForProject(projectId);
			if(labs.size() == 1) project.setLabs(labs.get(0));
			
			List<LabReportRecipients> labReportRecipients = projectDao.getLabReportRecipients(project.getLabs().getLabId());
			Set<LabReportRecipients> labReportRecipientsSet = new HashSet<LabReportRecipients>();
		    labReportRecipientsSet.addAll(labReportRecipients);
		    project.getLabs().setLabReportRecipientses(labReportRecipientsSet);
			//projectDetails.add(projectDao.getProjectDetails(project.getProjectId()));
		}
		
		return projects;
	}
}
