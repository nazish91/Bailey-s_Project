
package com.pwc.Virtualized.Assets.virtualizedAsset.serviceImpl;

	import java.util.Optional;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwc.Virtualized.Assets.virtualizedAsset.model.TemporaryModel;
import com.pwc.Virtualized.Assets.virtualizedAsset.repository.Temporary;
import com.pwc.Virtualized.Assets.virtualizedAsset.service.TemporaryService;

	@Service
	public class TemporaryServiceImpl implements TemporaryService {

		
		@Autowired
		private Temporary temporary;

		@Override
		public TemporaryModel getxmlDetails(Long id) throws JSONException {
			System.out.println(id);
			Optional<TemporaryModel> tempObjectDetails = temporary.findById(id);
			System.out.println(tempObjectDetails.stream().iterator().toString());
			TemporaryModel temporaryModel = tempObjectDetails.orElse(null);
			//System.out.println(temporaryModel.toString());
			//System.out.println(temporaryModel.getSapxml());
			JSONObject jsonObj = new JSONObject(temporaryModel.getSapxml());
			System.out.println(jsonObj.getJSONObject("Body").getJSONObject("Document").getJSONObject("BusinessDocument"));
			return temporaryModel;
		}
		
		

}
