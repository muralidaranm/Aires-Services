package com.aires.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aires.db.model.Projects;

@Repository("UserProjectDao")
public class UserProjectDAOImpl implements UserProjectDAO {

	 @Autowired
	 private SessionFactory sessionFactory;
	 
	@SuppressWarnings("unchecked")
	@Override
	public List<Projects> getProjectsForUser(int userId) {
//		Users user = (Users)sessionFactory.getCurrentSession().get(Users.class, userId);
		Query q = sessionFactory.getCurrentSession().createQuery("Select up.projects from UserProjects up where up.users.userId="+userId);
		List<Projects> projects = q.list();
		
		return projects;
	}

}
