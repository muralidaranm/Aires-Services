package com.aires.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aires.services.business.ProjectService;
import com.aires.view.model.ProjectDetails;

@Controller
public class BusinessController {
	private static final Logger logger = LoggerFactory.getLogger(BusinessController.class);

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public @ResponseBody List<ProjectDetails> getProjects(){
		
		List<ProjectDetails> projectIds = projectService.getProjectDetailsForUser(7);
		
		/*if(true)
			throw new InvalidRequestException("Invalid Request");*/

		return projectIds;
	}
	
	@RequestMapping(value = "/projects/{projectId}", method = RequestMethod.POST)
	@ResponseBody
	public String updateProject(@RequestBody ProjectDetails project ,
			@PathVariable int projectId){
		System.out.println("Contents::"+project.getProjectId());
		projectService.updateProject(project);
		return "Success";
	}
}
