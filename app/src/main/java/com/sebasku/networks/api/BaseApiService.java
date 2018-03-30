package com.sebasku.networks.api;

import com.sebasku.networks.apimodel.ResponseLogin;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by fadil on 3/30/18.
 */

public interface BaseApiService {
    @FormUrlEncoded
    @POST("api/auth/login")
    Call<ResponseLogin> addLogin(@Field("email") String email,
                                 @Field("password") String password);
}
