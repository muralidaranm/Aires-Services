package com.aires.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aires.db.model.Chemicals;
import com.aires.db.model.DeviceTypes;
import com.aires.db.model.Ppe;
import com.aires.db.model.SampleTypes;

@Repository("dataDao")
public class DataServiceDAOImpl implements DataServiceDAO{

	@Autowired
	private SessionFactory sessionFactory;


	@Override
	@SuppressWarnings("unchecked")
	public List<Chemicals> listChemicals() {
		return (List<Chemicals>)sessionFactory.getCurrentSession().createCriteria(Chemicals.class).list();
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<DeviceTypes> listDeviceTypes() {
		return (List<DeviceTypes>)sessionFactory.getCurrentSession().createCriteria(DeviceTypes.class).list();
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<Ppe> listPpe() {
		return (List<Ppe>)sessionFactory.getCurrentSession().createCriteria(Ppe.class).list();
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<SampleTypes> listSampleTypes() {
		return (List<SampleTypes>)sessionFactory.getCurrentSession().createCriteria(SampleTypes.class).list();
	}



}
