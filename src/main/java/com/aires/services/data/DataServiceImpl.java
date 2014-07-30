package com.aires.services.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.aires.dao.DataServiceDAO;
import com.aires.model.Chemicals;
import com.aires.model.DeviceTypes;
import com.aires.model.Ppe;
import com.aires.model.SampleTypes;

@Service("dataService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DataServiceImpl implements DataService{

	@Autowired
	private DataServiceDAO dataDao;

	@Override
	public List<Chemicals> listChemicals() {
		return dataDao.listChemicals();
	}

	@Override
	public List<DeviceTypes> listDeviceTypes() {
		return dataDao.listDeviceTypes();
	}

	@Override
	public List<Ppe> listPpe() {

		return dataDao.listPpe();
	}

	@Override
	public List<SampleTypes> listSampleTypes() {
		return dataDao.listSampleTypes();
	}

}
