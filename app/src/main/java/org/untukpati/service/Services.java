package org.untukpati.service;

import org.untukpati.model.UserModel;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by L on 21/09/2015.
 */
public interface Services {
    @GET("/student/{id}")
    public void getUser(@Path("id") String id, Callback<UserModel> response);
}
