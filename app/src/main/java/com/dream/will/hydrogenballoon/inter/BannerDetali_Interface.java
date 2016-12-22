package com.dream.will.hydrogenballoon.inter;

import com.dream.will.hydrogenballoon.apimanage.ApiConstant;
import com.dream.will.hydrogenballoon.bean.BannerDetaliBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2016/12/20.
 */

public interface BannerDetali_Interface {

    @GET(ApiConstant.BANNERDETAIL)
    Call<BannerDetaliBean> getBannerDetailBean(@Path("id")int id);
}
