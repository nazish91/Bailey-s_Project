
package com.pwc.Virtualized.Assets.virtualizedAsset.serviceImpl;

import java.util.Optional;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import com.pwc.Virtualized.Assets.virtualizedAsset.model.TemporaryModel;
import com.pwc.Virtualized.Assets.virtualizedAsset.repository.Temporary;
import com.pwc.Virtualized.Assets.virtualizedAsset.service.TemporaryService;

@Service
public class TemporaryServiceImpl implements TemporaryService {

	@Autowired
	private Temporary temporary;

	@Override
	public String getxmlDetails(Long id, JSONObject response) throws JSONException {
		System.out.println(id);
		Optional<TemporaryModel> tempObjectDetails = temporary.findById(id);
		// System.out.println(tempObjectDetails.stream().iterator().toString());
		TemporaryModel temporaryModel = tempObjectDetails.orElse(null);
		JSONObject jsonObj = new JSONObject(temporaryModel.getSapxml());

		DocumentContext doc = JsonPath.parse(response.toString());

		for (int i = 0; i < 8; i++) {
			try {
				doc.read("Orders[0].ItemList[" + i + "].EndUserList[0]");

				doc.set("Orders[0].ItemList[" + i + "].EndUserList[0].Email",
						jsonObj.getJSONObject("Body").getJSONObject("Document").getJSONObject("BusinessDocument")
								.getJSONObject("LineItem").getJSONObject("ShipToAddress").getString("CompanyName1"));
				doc.set("Orders[0].ItemList[" + i + "].EndUserList[0].Name",
						jsonObj.getJSONObject("Body").getJSONObject("Document").getJSONObject("BusinessDocument")
								.getJSONObject("LineItem").getJSONObject("ShipToAddress").getString("CompanyName1"));
				doc.set("Orders[0].ItemList[" + i + "].EndUserList[0].Phone",
						jsonObj.getJSONObject("Body").getJSONObject("Document").getJSONObject("BusinessDocument")
								.getJSONObject("LineItem").getJSONObject("ShipToAddress").getString("TelephoneNumber"));
			} catch (PathNotFoundException e) {

				System.out.println("Bypassing this path for index " + i + "  As no Object found on this path");
			}

		}

		return doc.jsonString();
	}

}
