package com.aires.services.business;

import java.util.List;

import com.aires.model.Projects;

public interface ProjectService {

	public void addProject(Projects project);
	
	public List<Projects> listProjects();
	
	public Projects getProject(int projectId);
	
	public void deleteProject(int projectId);
	
	public List<Projects> getProjectsForUser(int userId);
	
	public List<Projects> getProjectDetailsForUser(int userId);
}
