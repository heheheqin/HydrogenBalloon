package com.dream.will.hydrogenballoon.inter;

import com.dream.will.hydrogenballoon.apimanage.ApiConstant;
import com.dream.will.hydrogenballoon.bean.PersonalHomePageHeadBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by shisjin on 2016/12/21.
 */

public interface IPersonalHomepage {

@GET(ApiConstant.PERSONAL_HOMEPAGE_HEADINFO)
Call<PersonalHomePageHeadBean> getPerHomeHeadBean(@Path("id") String id);




}
