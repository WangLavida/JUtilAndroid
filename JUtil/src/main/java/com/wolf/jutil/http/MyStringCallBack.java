package com.wolf.jutil.http;

import android.util.Log;

import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.request.BaseRequest;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Wolf on 2017/5/6.
 */

public class MyStringCallBack extends StringCallback {
    private String TAG;

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    @Override
    public void onBefore(BaseRequest request) {
        super.onBefore(request);
        Log.i(TAG, "onBefore");
    }

    @Override
    public void onSuccess(String s, Call call, Response response) {
        Log.i(TAG, "onSuccess");
        Log.i(TAG, "s");
    }

    @Override
    public void onCacheSuccess(String s, Call call) {
        super.onCacheSuccess(s, call);
        Log.i(TAG, "onCacheSuccess");
    }

    @Override
    public void onError(Call call, Response response, Exception e) {
        super.onError(call, response, e);
        Log.i(TAG, "onCacheSuccess");
    }

    @Override
    public void onCacheError(Call call, Exception e) {
        super.onCacheError(call, e);
        Log.i(TAG, "onCacheError");
    }

    @Override
    public void parseError(Call call, Exception e) {
        super.parseError(call, e);
        Log.i(TAG, "parseError");
    }

    @Override
    public void onAfter(String s, Exception e) {
        super.onAfter(s, e);
        Log.i(TAG, "onAfter");
    }

    @Override
    public void upProgress(long currentSize, long totalSize, float progress, long networkSpeed) {
        super.upProgress(currentSize, totalSize, progress, networkSpeed);
    }
}
