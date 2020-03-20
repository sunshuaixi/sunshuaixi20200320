package com.bawei.sunshuaixi20200320.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bawei.sunshuaixi20200320.R;
import com.uuzuche.lib_zxing.activity.CodeUtils;

/**
 * TIme:2020/3/20
 * Author:孙帅喜
 * Descriotion:
 */
public class HomeFragment extends Fragment {

    private ImageView iv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = View.inflate(getContext(), R.layout.homefragmetn, null);
        iv = inflate.findViewById(R.id.iv);
        initData();
        return inflate;
    }

    private void initData() {
        final String str="小姐姐";
        Bitmap image = CodeUtils.createImage(str, 400, 400, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        iv.setImageBitmap(image);

        iv.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getContext(), ""+str, Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
