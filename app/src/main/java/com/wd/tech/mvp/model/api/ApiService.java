package com.wd.tech.mvp.model.api;

import com.wd.tech.mvp.model.bean.MainBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * api数据
 *
 * @author Administrator QQ:1228717266
 * @name DimensionTech
 * @class name：com.wd.tech.mvp.model.api
 * @time 2018/11/29 22:41
 */
public interface ApiService {

    @GET("techApi/information/v1/bannerShow")
    Observable<MainBean> bannerShow();


}
