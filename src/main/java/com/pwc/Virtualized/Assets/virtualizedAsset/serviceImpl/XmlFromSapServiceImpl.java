package com.pwc.Virtualized.Assets.virtualizedAsset.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwc.Virtualized.Assets.virtualizedAsset.model.TemporaryModel;
import com.pwc.Virtualized.Assets.virtualizedAsset.repository.XmlFromSAP;
import com.pwc.Virtualized.Assets.virtualizedAsset.service.XmlFromSAPService;

@Service
public class XmlFromSapServiceImpl implements XmlFromSAPService {

	@Autowired
	private XmlFromSAP xmlFromSAP;

	@Override
	public String addXML(TemporaryModel student) {

		xmlFromSAP.save(student);
		return "your Xml is successfully persisted";
	}

}
