package com.wd.tech.mvp.base;

import android.content.Context;

import com.wd.tech.mvp.model.api.Api;
import com.wd.tech.mvp.model.api.ApiService;
import com.wd.tech.mvp.model.net.NetManager;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import okhttp3.ResponseBody;

/**
 * @author Administrator QQ:1228717266
 * @name DimensionTech
 * @class name：com.wd.tech.mvp.base
 * @time 2018/11/29 21:13
 */
public class BaseModel<T> {

    public void subscribe(Context context, Observable observable, ObservableTransformer<T,T> transformer,boolean isDialog, boolean cancelable){
        ApiService apiService = NetManager.getInstance().apiService;


    }


}
