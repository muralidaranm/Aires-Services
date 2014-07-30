package com.aires.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aires.json.ResponseWrapper;
import com.aires.json.ResponseWrapper.Status;
import com.aires.model.Projects;
import com.aires.services.business.ProjectService;

@Controller
public class BusinessController {
	private static final Logger logger = LoggerFactory.getLogger(BusinessController.class);

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public @ResponseBody List<Projects> getProjects(){
		
		List<Projects> projectIds = projectService.getProjectDetailsForUser(7);
		ResponseWrapper responseWrapper = new ResponseWrapper();
		responseWrapper.setResponseContent(projectIds);
		responseWrapper.setMessage(Status.SUCCESS);
		
/*		Projects project  = projectService.getProject(1);
		project.getClients();
		project.getContacts();
		project.getUsers();
		project.getLabs();
		System.out.println(project.getProjectDescription());*/
		return projectIds;
	}
}
