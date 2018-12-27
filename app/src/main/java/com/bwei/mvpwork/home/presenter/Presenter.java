package com.bwei.mvpwork.home.presenter;

import android.util.Log;

import com.bwei.mvpwork.MainActivity;
import com.bwei.mvpwork.api.Api;
import com.bwei.mvpwork.home.model.Modelnter;

public class Presenter implements IPresenter,Modelnter.ModuleInterface {
    private final Modelnter modelnter;
    MainActivity mview;
    private String modeInterDate;

    public Presenter(MainActivity mview) {
        this.mview = mview;
        modelnter = new Modelnter(this);
    }

    @Override
    public void LoadSuccess(String data) {
        mview.getViewData(data);
    }

    @Override
    public void LoadFailed() {
        mview.getViewData("加载失败");
    }

    @Override
    public void getModelDate() {
        //回调model
        modelnter.getDate(Api.SHOPLIST);
        Log.i("bbb", "getModelDate: "+modeInterDate);
    }
}
