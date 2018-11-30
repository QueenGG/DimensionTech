package com.wd.tech.mvp.contract;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.wd.tech.mvp.base.BasePresenter;
import com.wd.tech.mvp.base.BaseResponse;
import com.wd.tech.mvp.base.BaseView;
import com.wd.tech.mvp.model.bean.MainBean;

import java.util.List;

/**
 * 契约类
 *
 * @author Administrator QQ:1228717266
 * @name DimensionTech
 * @class name：com.wd.tech.mvp.contract
 * @time 2018/11/30 8:34
 */
public interface MainContract {


    public interface IMainView extends BaseView {
        void bannerShow(BaseResponse<List<MainBean>> mainBean);

        void onFault(String errorMsg);
    }

    public abstract class IMainPresenetr extends BasePresenter<IMainView> {
        public abstract void getBanner(LifecycleProvider lifecycleProvider);
    }
}
