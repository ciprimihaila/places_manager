package com.placesmanager.server.database;

import com.placesmanager.shared.PlaceDetails;

public interface PlaceDetailsDAO {
	public PlaceDetails savePlaceDetails(PlaceDetails placeDetails);

	public PlaceDetails getPlaceDetails(String placeId);

	public void upadtePlaceDetails(PlaceDetails newPlaceDetails);

	public void deletePlaceDetails(String placeId);
}
