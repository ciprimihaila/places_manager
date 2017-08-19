package com.placesmanager.server.database;

import java.util.List;

import com.placesmanager.shared.PhotoReference;

public interface PhotoReferenceDAO {
	public List<PhotoReference> getPhotosForPlaces(String placeID);
}
