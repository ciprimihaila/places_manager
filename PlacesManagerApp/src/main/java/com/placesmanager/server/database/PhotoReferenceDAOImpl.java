package com.placesmanager.server.database;

import java.util.List;

import javax.persistence.Query;

import com.placesmanager.shared.PhotoReference;
import com.placesmanager.shared.PlaceDetails;

public class PhotoReferenceDAOImpl extends GenericCRUDManagerImpl<PlaceDetails, String> implements PhotoReferenceDAO {

	@Override
	public List<PhotoReference> getPhotosForPlaces(String placeID) {
		Query query = entityManager.createNativeQuery(
				"SELECT * FROM photo_reference WHERE place_details_id = '" + placeID + "'", PhotoReference.class);

		List<PhotoReference> resultList = query.getResultList();
		return resultList;
	}

}
