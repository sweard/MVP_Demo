package com.example.loki.mvp_demo;

/**
 * Created by loki on 16-11-28.
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
}
