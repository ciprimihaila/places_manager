package com.placesmanager.server.guice;

import com.google.inject.AbstractModule;
import com.placesmanager.server.database.CityDAO;
import com.placesmanager.server.database.CityDAOImpl;
import com.placesmanager.server.database.PhotoReferenceDAO;
import com.placesmanager.server.database.PhotoReferenceDAOImpl;
import com.placesmanager.server.database.PlaceDetailsDAO;
import com.placesmanager.server.database.PlaceDetailsDAOImpl;
import com.placesmanager.server.database.PlacesDAO;
import com.placesmanager.server.database.PlacesDAOImpl;

public class AppGuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(CityDAO.class).to(CityDAOImpl.class);
		bind(PlaceDetailsDAO.class).to(PlaceDetailsDAOImpl.class);
		bind(PlacesDAO.class).to(PlacesDAOImpl.class);
		bind(PhotoReferenceDAO.class).to(PhotoReferenceDAOImpl.class);
	}

}
