package com.dream.will.hydrogenballoon.fragment.personalhomepage_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dream.will.hydrogenballoon.R;

/**
 * Created by shisjin on 2016/12/20.
 */

public class PersonalHomepage_GroupedFragment  extends Fragment {


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Log.d("TAG", "PersonalHomepage_GroupedFragment--onCreateView~~~~");
        return inflater.inflate(R.layout.fragment_personalhomepage_grouped, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}