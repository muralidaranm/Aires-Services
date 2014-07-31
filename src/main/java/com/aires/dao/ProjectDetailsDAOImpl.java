package com.aires.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

@Repository("projectDao")
public class ProjectDetailsDAOImpl implements ProjectDetailsDAO {

	
	 @Autowired
	 private SessionFactory sessionFactory;
	 
	@Override
	public void addProject(Projects project) {
		
		Transaction tx = sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().saveOrUpdate(project);
		tx.commit();
		System.out.println("Commited");
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
	public Contacts getContactsForProject(int projectId) {
		Query q = sessionFactory.getCurrentSession().createQuery("Select p.contacts from Projects p where p.projectId="+projectId);
		Contacts contacts = (Contacts) q.uniqueResult();
		return contacts;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Clients getClientsForProject(int projectId) {
		Query q = sessionFactory.getCurrentSession().createQuery("Select p.clients from Projects p where p.projectId="+projectId);
		return (Clients)q.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Users getUsersForProject(int projectId) {
		Query q = sessionFactory.getCurrentSession().createQuery("Select p.users from Projects p where p.projectId="+projectId);
		return (Users)q.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Labs getLabsForProject(int projectId) {
		Query q = sessionFactory.getCurrentSession().createQuery("Select p.labs from Projects p where p.projectId="+projectId);
		return (Labs)q.uniqueResult();
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public TurnaroundTimes getTurnaroundTimesForProject(int projectId) {
		Query q = sessionFactory.getCurrentSession().createQuery("Select p.turnaroundTimes from Projects p where p.projectId="+projectId);
		return (TurnaroundTimes)q.uniqueResult();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<LabReportRecipients> getLabReportRecipients(int labId) {
	
		List<LabReportRecipients> labReportRecipients = sessionFactory.getCurrentSession().createQuery("select l.labReportRecipientses from Labs l where l.labId="+labId ).list();
		return labReportRecipients;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Samples> getSamplesForProject(int projectId) {
		List<Samples> samples = sessionFactory.getCurrentSession().createQuery("select p.sampleses from Projects p where p.projectId="+projectId).list();
		return samples;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SampleChemicals> getSampleChemicalsForProject(int sampleId) {
		List<SampleChemicals> sampleChemicals = sessionFactory.getCurrentSession().createQuery("select s.sampleChemicalses from Samples s where s.sampleId="+sampleId).list();
		return sampleChemicals;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SamplePpe> getSamplePpeForProject(int sampleId) {
		List<SamplePpe> samplePpes = sessionFactory.getCurrentSession().createQuery("select s.samplePpes from Samples s where s.sampleId="+sampleId).list();
		return samplePpes;
	}

}
