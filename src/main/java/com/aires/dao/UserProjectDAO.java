package com.aires.dao;

import java.util.List;

import com.aires.model.Projects;

public interface UserProjectDAO {

	public List<Projects> getProjectsForUser(int userId);
}
