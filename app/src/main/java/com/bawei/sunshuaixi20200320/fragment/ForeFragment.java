package com.bawei.sunshuaixi20200320.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bawei.sunshuaixi20200320.R;

/**
 * TIme:2020/3/20
 * Author:孙帅喜
 * Descriotion:
 */
public class ForeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = View.inflate(getContext(), R.layout.twofragmetn, null);
        return inflate;
    }
}
