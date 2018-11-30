package com.wd.tech.mvp.presenter;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.wd.tech.mvp.base.BaseResponse;
import com.wd.tech.mvp.contract.MainContract;
import com.wd.tech.mvp.model.api.ApiService;
import com.wd.tech.mvp.model.bean.MainBean;
import com.wd.tech.mvp.model.net.NetManager;
import com.wd.tech.mvp.model.net.ObjectLoader;
import com.wd.tech.mvp.model.net.OnSuccessAndFaultListener;
import com.wd.tech.mvp.model.net.OnSuccessAndFaultSub;
import com.wd.tech.mvp.ui.activity.MainActivity;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

/**
 * @author Administrator QQ:1228717266
 * @name DimensionTech
 * @class name：com.wd.tech.mvp.presenter
 * @time 2018/11/30 8:35
 */
public class MainPresenterImpl extends MainContract.IMainPresenetr {


    @Override
    public void getBanner(LifecycleProvider lifecycleProvider) {

        Observable observable1 = new ObjectLoader().activityObserve(NetManager.getInstance().apiService
                .bannerShow(), lifecycleProvider);



        observable1.subscribe(new OnSuccessAndFaultSub<BaseResponse<List<MainBean>>>(new OnSuccessAndFaultListener<BaseResponse<List<MainBean>>>() {
            @Override
            public void onSuccess(BaseResponse<List<MainBean>> result) {
                getView().bannerShow(result);
            }

            @Override
            public void onFault(String errorMsg) {
                getView().onFault(errorMsg);
            }
        }));

    }
}
