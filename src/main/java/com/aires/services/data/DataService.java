package com.aires.services.data;

import java.util.List;

import com.aires.db.model.Chemicals;
import com.aires.db.model.DeviceTypes;
import com.aires.db.model.Ppe;
import com.aires.db.model.SampleTypes;

public interface DataService {
	
	public List<Chemicals> listChemicals();
	
	public List<DeviceTypes> listDeviceTypes();
	
	public List<Ppe> listPpe();
	
	public List<SampleTypes> listSampleTypes();
}
