package com.wolf.jutil.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

 /**
  * Created by Wolf on 2017/2/28
  */
 
public class JNetworkUtils {

    /**
     * 检查网络是否连接
     */
    public static Boolean checkNetworkConnect(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            if (mNetworkInfo != null) {
                return mNetworkInfo.isAvailable();
            }
        }

        return false;
    }
}
