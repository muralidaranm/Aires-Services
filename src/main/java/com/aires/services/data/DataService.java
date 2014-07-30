package com.aires.services.data;

import java.util.List;

import com.aires.model.Chemicals;
import com.aires.model.DeviceTypes;
import com.aires.model.Ppe;
import com.aires.model.SampleTypes;

public interface DataService {
	
	public List<Chemicals> listChemicals();
	
	public List<DeviceTypes> listDeviceTypes();
	
	public List<Ppe> listPpe();
	
	public List<SampleTypes> listSampleTypes();
}
