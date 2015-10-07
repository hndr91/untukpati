package org.untukpati.services;

import org.untukpati.Constant;
import org.untukpati.interfeces.servicesAPI;

import java.io.IOException;

import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;


public class TypeService {
    private servicesAPI servicesAPI;

    public TypeService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        servicesAPI = retrofit.create(servicesAPI.class);
    }

    public void getAllTypes(Callback callback) throws IOException {
        servicesAPI.getAllTypes().enqueue(callback);
    }
}
