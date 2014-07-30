package com.aires.dao;

import java.util.List;

import com.aires.model.Clients;
import com.aires.model.Contacts;
import com.aires.model.LabReportRecipients;
import com.aires.model.Labs;
import com.aires.model.Projects;
import com.aires.model.TurnaroundTimes;
import com.aires.model.Users;

public interface ProjectDetailsDAO {

	public void addProject(Projects project);
	
	public List<Projects> listProjects();
	
	public Projects getProject(int projectId);
	
	public void deleteProject(int projectId);
	
	public Projects getProjectDetails(int projectId);
	
	public List<Contacts> getContactsForProject(int projectId);
	
	public List<Clients> getClientsForProject(int projectId);
	
	public List<Users> getUsersForProject(int projectId);
	
	public List<Labs> getLabsForProject(int projectId);
	
	public List<TurnaroundTimes> getTurnaroundTimesForProject(int projectId);
	
	public List<LabReportRecipients> getLabReportRecipients(int labId);
	
}
