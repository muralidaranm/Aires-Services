package com.aires.dao;

import java.util.List;

import com.aires.db.model.Projects;

public interface UserProjectDAO {

	public List<Projects> getProjectsForUser(int userId);
}
