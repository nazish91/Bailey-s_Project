
package com.pwc.Virtualized.Assets.virtualizedAsset.service;

import org.json.JSONException;

import com.pwc.Virtualized.Assets.virtualizedAsset.model.TemporaryModel;

public interface TemporaryService {

	TemporaryModel getxmlDetails(Long id) throws JSONException;

}
