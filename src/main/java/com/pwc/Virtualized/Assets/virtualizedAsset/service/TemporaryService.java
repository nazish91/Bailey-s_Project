
package com.pwc.Virtualized.Assets.virtualizedAsset.service;

import org.json.JSONException;
import org.json.JSONObject;

import com.pwc.Virtualized.Assets.virtualizedAsset.model.TemporaryModel;

public interface TemporaryService {

	String getxmlDetails(Long id,JSONObject response) throws JSONException;

}
