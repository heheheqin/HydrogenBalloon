package com.dream.will.hydrogenballoon.apimanage;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Karlo on 2016/12/20.
 */

public interface IDestinationApi {
    /**
     * "api/v2/search.json?q={name}"
     *
     * @return
     */
    @GET(ApiConstant.SEARCH_BY_NAME)
    Call<String> requestDestionation(@Query("q") String name);

    /**
     * api/v3/destinations/{id}.json
     *
     * @param id
     * @return
     */
    @GET(ApiConstant.SEARCH_BY_ID)
    Call<String> requestDestionationById(@Path("id") int id);

}
