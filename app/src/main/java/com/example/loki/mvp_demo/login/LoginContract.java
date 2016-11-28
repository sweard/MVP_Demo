package com.example.loki.mvp_demo.login;

import com.example.loki.mvp_demo.BasePresenter;
import com.example.loki.mvp_demo.BaseView;

/**
 * Created by loki on 16-11-28.
 */

public interface LoginContract {
    interface Presenter extends BasePresenter {
        void login();
        void reset();
    }

    interface View extends BaseView<Presenter> {
        String getUserEmail();
        String getPassword();

        boolean isEmailValid(String email);
        boolean isPasswordValid(String password);

        boolean setEmailError(String error);
        boolean setPasswordError(String error);

        void showLoginProgress(boolean show);
        void resetEditView();
        void toMainAct();
        void showFailedError();
    }
}
