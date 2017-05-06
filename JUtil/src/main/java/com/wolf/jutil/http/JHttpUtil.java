package com.wolf.jutil.http;

import android.content.Context;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.HttpParams;

/**
 * Created by Wolf on 2017/5/6.
 */

public class JHttpUtil {
    private static OkGo okGo;
    private static JHttpUtil jHttpUtil;

    public static JHttpUtil getInstance() {
        if (jHttpUtil == null) {
            jHttpUtil = new JHttpUtil();
            okGo = OkGo.getInstance();
        }
        return jHttpUtil;
    }

    public void post(String TAG, String url, HttpParams httpParams, Context mContext, MyStringCallBack myStringCallBack) {
        myStringCallBack.setTAG(TAG);
        okGo.post(url).params(httpParams).execute(myStringCallBack);
    }
}
