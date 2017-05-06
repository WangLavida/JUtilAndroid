package com.wolf.jutil.Utils;

import android.widget.EditText;

/**
 * 字符串相关方法
 * Created by tsy on 16/8/15.
 */
public class JStringUtils {

    /**
     * 是否为空
     */
    public static Boolean isEmpty(String str) {
        if(str == null || str.equals("")) {
            return true;
        }

        return false;
    }

    /**
     * 是否为空
     */
    public static Boolean isEditEmpty(EditText editText) {
        if (editText.getText().toString() == null || editText.getText().toString().equals("")) {
            return true;
        }
        return false;
    }
}
