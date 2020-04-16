package com.antivirusapp9.app;

public class MainResultPresenter implements MainContructor.ResultPresenter {

    MainContructor.ResultView view;

    public MainResultPresenter(MainContructor.ResultView view) {

        this.view = view;
    }
}
