package com.aires.dao;

import java.util.List;

import com.aires.db.model.Clients;
import com.aires.db.model.Contacts;
import com.aires.db.model.LabReportRecipients;
import com.aires.db.model.Labs;
import com.aires.db.model.Projects;
import com.aires.db.model.SampleChemicals;
import com.aires.db.model.SamplePpe;
import com.aires.db.model.Samples;
import com.aires.db.model.TurnaroundTimes;
import com.aires.db.model.Users;

public interface ProjectDetailsDAO {

	public void addProject(Projects project);
	
	public List<Projects> listProjects();
	
	public Projects getProject(int projectId);
	
	public void deleteProject(int projectId);
	
	public Projects getProjectDetails(int projectId);
	
	public Contacts getContactsForProject(int projectId);
	
	public Clients getClientsForProject(int projectId);
	
	public Users getUsersForProject(int projectId);
	
	public Labs getLabsForProject(int projectId);
	
	public TurnaroundTimes getTurnaroundTimesForProject(int projectId);
	
	public List<LabReportRecipients> getLabReportRecipients(int labId);
	
	public List<Samples> getSamplesForProject(int projectId);
	
	public List<SampleChemicals> getSampleChemicalsForProject(int sampleId);
	
	public List<SamplePpe> getSamplePpeForProject(int sampleId);
	
}
