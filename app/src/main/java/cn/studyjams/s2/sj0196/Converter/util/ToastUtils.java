package cn.studyjams.s2.sj0196.Converter.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Yuan on 2018/2/8.
 */

public class ToastUtils {
    private static Toast toast;

    public static void showToast(Context context, String message) {
        if (toast == null) {
            toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        } else {
            toast.setText(message);
        }
        toast.show();
    }

}
