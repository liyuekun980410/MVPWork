package com.bwei.mvpwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bwei.mvpwork.home.presenter.Presenter;
import com.bwei.mvpwork.home.view.IView;

public class MainActivity extends AppCompatActivity implements IView {

    private TextView tv;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        //初始化presenter
        presenter = new Presenter(this);
        presenter.getModelDate();
    }

    @Override
    public void getViewData(String mViewData) {
        tv.setText(mViewData);
    }
}
