package com.aires.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aires.model.Chemicals;
import com.aires.model.DeviceTypes;
import com.aires.model.Ppe;
import com.aires.model.SampleTypes;
import com.aires.services.data.DataService;

@Controller
public class DataServiceController {

	@Autowired
	private DataService dataService;
	
	@RequestMapping(value = "/chemicals", method = RequestMethod.GET)
	public @ResponseBody List<Chemicals> getChemicals(){	
		return dataService.listChemicals();
	}
	
	@RequestMapping(value = "/devicetypes", method = RequestMethod.GET)
	public @ResponseBody List<DeviceTypes> getDeviceTypes(){	
		return dataService.listDeviceTypes();
	}
	
	@RequestMapping(value = "/ppe", method = RequestMethod.GET)
	public @ResponseBody List<Ppe> getPpe(){	
		return dataService.listPpe();
	}
	
	@RequestMapping(value = "/sampletypes", method = RequestMethod.GET)
	public @ResponseBody List<SampleTypes> getSampleTypes(){	
		return dataService.listSampleTypes();
	}
}
