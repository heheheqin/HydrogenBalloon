package com.dream.will.hydrogenballoon.apimanage;

import android.util.SparseArray;


import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Karlo on 2016/12/20.
 */

public class RetrofitManager {
    private static SparseArray<Retrofit> retrofitList = new SparseArray<>();

    public  static Retrofit getInstance(int type) {
        Retrofit retrofit = retrofitList.get(type);
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiConstant.getHostByType(type))
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
            retrofitList.put(type, retrofit);
        }
        return retrofit;
    }
}
