package com.aires.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aires.model.Clients;
import com.aires.model.Contacts;
import com.aires.model.LabReportRecipients;
import com.aires.model.Labs;
import com.aires.model.Projects;
import com.aires.model.TurnaroundTimes;
import com.aires.model.Users;

@Repository("projectDao")
public class ProjectDetailsDAOImpl implements ProjectDetailsDAO {

	
	 @Autowired
	 private SessionFactory sessionFactory;
	 
	@Override
	public void addProject(Projects project) {
		sessionFactory.getCurrentSession().saveOrUpdate(project);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Projects> listProjects() {
		return (List<Projects>) sessionFactory.getCurrentSession().createCriteria(Projects.class).list();
	}

	@Override
	public Projects getProject(int projectId) {
		
		return (Projects) sessionFactory.getCurrentSession().get(Projects.class, projectId);
	}

	@Override
	public void deleteProject(int projectId) {
		
		 sessionFactory.getCurrentSession().createQuery("DELETE FROM Projects WHERE ProjectId = "+projectId).executeUpdate();
	}

	@Override
	public Projects getProjectDetails(int projectId) {
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        
		Projects projectDetail = (Projects) session.get(Projects.class, projectId);
		
		Clients clients = projectDetail.getClients();
		Contacts contacts = projectDetail.getContacts();
		TurnaroundTimes turnaroundTimes = projectDetail.getTurnaroundTimes();
		
		session.getTransaction().commit();
		
		projectDetail.setClients(clients);
		projectDetail.setContacts(contacts);
		projectDetail.setTurnaroundTimes(turnaroundTimes);
		
		return projectDetail;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contacts> getContactsForProject(int projectId) {
		Query q = sessionFactory.getCurrentSession().createQuery("Select p.contacts from Projects p where p.projectId="+projectId);
		List<Contacts> contacts = q.list();
		return contacts;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Clients> getClientsForProject(int projectId) {
		Query q = sessionFactory.getCurrentSession().createQuery("Select p.clients from Projects p where p.projectId="+projectId);
		return q.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getUsersForProject(int projectId) {
		Query q = sessionFactory.getCurrentSession().createQuery("Select p.users from Projects p where p.projectId="+projectId);
		return q.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Labs> getLabsForProject(int projectId) {
		Query q = sessionFactory.getCurrentSession().createQuery("Select p.labs from Projects p where p.projectId="+projectId);
		return q.list();
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<TurnaroundTimes> getTurnaroundTimesForProject(int projectId) {
		Query q = sessionFactory.getCurrentSession().createQuery("Select p.turnaroundTimes from Projects p where p.projectId="+projectId);
		return q.list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<LabReportRecipients> getLabReportRecipients(int labId) {
	
		List<LabReportRecipients> labReportRecipients = sessionFactory.getCurrentSession().createQuery("select l.labReportRecipientses from Labs l where l.labId="+labId ).list();
		return labReportRecipients;
	}

}
