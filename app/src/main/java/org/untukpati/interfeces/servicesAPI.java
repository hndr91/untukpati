package org.untukpati.interfeces;


import org.untukpati.Constant;
import org.untukpati.models.DistrictModel;
import org.untukpati.models.TypeModel;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

public interface servicesAPI {
    @GET(Constant.GET_TYPE)
    Call<List<TypeModel>> getAllTypes();

    @GET(Constant.GET_DISTRICT)
    Call<List<DistrictModel>> getAllDisctricts();
}
