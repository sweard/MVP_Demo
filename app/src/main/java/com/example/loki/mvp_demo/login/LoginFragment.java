package com.example.loki.mvp_demo.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;

import com.example.loki.mvp_demo.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by loki on 16-11-28.
 */

public class LoginFragment extends Fragment {


    @Bind(R.id.login_progress)
    ProgressBar loginProgress;

    @Bind(R.id.email)
    AutoCompleteTextView email;

    @Bind(R.id.password)
    EditText password;

    @Bind(R.id.email_sign_in_button)
    Button emailSignInButton;


    @Bind(R.id.login_form)
    ScrollView loginForm;

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
        View root = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, root);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
