package com.example.loki.mvp_demo.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.loki.mvp_demo.R;

/**
 * Created by loki on 16-11-28.
 */

public class LoginFragment extends Fragment {

    public static LoginFragment newInstance(String id) {
        Bundle args = new Bundle();
        args.putString("fragment_id", id);
        LoginFragment fragment = new LoginFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_login,container,false);
        return root;
    }
}
