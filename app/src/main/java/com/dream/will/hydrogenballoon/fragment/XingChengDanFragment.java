package com.dream.will.hydrogenballoon.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dream.will.hydrogenballoon.R;

/**
 * Author：Will on 2016/12/19 10:08
 * Mail：heheheqin.will@gmail.com
 */

public class XingChengDanFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("TAG", "onCreateView: ---------");
        return inflater.inflate(R.layout.fragment,container,false);
    }
}
