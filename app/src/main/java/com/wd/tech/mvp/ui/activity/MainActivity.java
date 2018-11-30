package com.wd.tech.mvp.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.wd.tech.R;
import com.wd.tech.mvp.base.BaseActivity;
import com.wd.tech.mvp.base.BaseResponse;
import com.wd.tech.mvp.contract.MainContract;
import com.wd.tech.mvp.model.bean.MainBean;
import com.wd.tech.mvp.presenter.MainPresenterImpl;

import java.util.List;

public class MainActivity extends BaseActivity<MainPresenterImpl> implements MainContract.IMainView {


    @Override
    protected int initView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {

        mpresenter.getBanner(this);
    }

    @Override
    protected MainPresenterImpl getPresenter() {
        return new MainPresenterImpl();
    }

    @Override
    public void bannerShow(BaseResponse<List<MainBean>> mainBean) {
       Logger.e(mainBean.result.get(0).getImageUrl());
    }

    @Override
    public void onFault(String errorMsg) {
        Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show();
    }
}
