package com.placesmanager.server.database;

import com.placesmanager.shared.City;

public interface CityDAO {
	public void saveCity(City city);

	public City findCity(String cityName);
}
