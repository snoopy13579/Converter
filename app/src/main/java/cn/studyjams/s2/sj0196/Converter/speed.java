package cn.studyjams.s2.sj0196.Converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import cn.studyjams.s2.sj0196.Converter.util.ToastUtils;

/**
 * Created by lenovo on 2017/4/17.
 */

public class speed extends AppCompatActivity {
    EditText Edit_c;
    EditText Edit_km;
    EditText Edit_m;
    String i_1, i_2, i_3;
    double i1, i2;
    double i3, i4;
    double i5, i6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speed_layout);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        Edit_c = (EditText) findViewById(R.id.speed_c);
        Edit_km = (EditText) findViewById(R.id.speed_km);
        Edit_m = (EditText) findViewById(R.id.speed_m);
    }

    public void convertcc(View view) {
        try {
            double guangsu = Double.parseDouble(Edit_c.getText().toString());
            i1 = guangsu * 300000000.0 * 3.6;
            i2 = guangsu * 300000000.0;
            i_1 = String.valueOf(guangsu);
            Edit_km.setText("" + i1);
            Edit_m.setText("" + i2);
        } catch (Exception e) {
            ToastUtils.showToast(speed.this, "请正确输入！");
        }
    }

    public void convertkmh(View view) {
        try {
            double qianmishi = Double.parseDouble(Edit_km.getText().toString());
            i3 = (qianmishi / 3.6) / 300000000.0;
            i4 = qianmishi / 3.6;
            i_2 = String.valueOf(qianmishi);
            Edit_c.setText("" + i3);
            Edit_m.setText("" + i4);
        } catch (Exception e) {
            ToastUtils.showToast(speed.this, "请正确输入！");
        }
    }

    public void convertms(View view) {
        try {
            double mimiao = Double.parseDouble(Edit_m.getText().toString());
            i5 = mimiao / 300000000.0;
            i6 = mimiao * 3.6;
            i_3 = String.valueOf(mimiao);
            Edit_c.setText("" + i5);
            Edit_km.setText("" + i6);
        } catch (Exception e) {
            ToastUtils.showToast(speed.this, "请正确输入！");
        }
    }

    public void reset(View view) {
        Edit_c.setText("");
        Edit_km.setText("");
        Edit_m.setText("");
        ToastUtils.showToast(speed.this, "清空完成");
    }

    public void back_speed(View v) {
        finish();
    }
}