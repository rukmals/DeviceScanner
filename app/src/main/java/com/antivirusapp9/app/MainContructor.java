package com.antivirusapp9.app;

import android.app.ActionBar;

public interface MainContructor {


    interface ResultView{
        public String getText(String text);
        public void getPagerAdapter(ActionBar actionBar,int i);
    }

    interface ResultPresenter{

    }


    interface ListAppActivityView{

    }

    interface ListAppActivityPresenter{

    }
}
