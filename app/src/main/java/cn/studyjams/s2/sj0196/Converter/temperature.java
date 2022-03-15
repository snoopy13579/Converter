package cn.studyjams.s2.sj0196.Converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import cn.studyjams.s2.sj0196.Converter.util.ToastUtils;


public class temperature extends AppCompatActivity {
    EditText Edit_c;
    EditText Edit_f;
    EditText Edit_k;
    String i_1, i_2, i_3;
    double i1, i2;
    double i3, i4;
    double i5, i6;

    String tip_warning = "请正确输入！";
    String tip_clear="清空完成！";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperture_layout);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        Edit_c = (EditText) findViewById(R.id.temper_c);
        Edit_f = (EditText) findViewById(R.id.temper_f);
        Edit_k = (EditText) findViewById(R.id.temper_k);
    }

    /*提醒输入有误*/
    public void toast_tip(String tip) {
        ToastUtils.showToast(temperature.this, tip);
    }

    public void convertc(View view) {
        try {
            double sheshi = Double.parseDouble(Edit_c.getText().toString());
            i_1 = String.valueOf(sheshi);
            i1 = sheshi * 1.8 + 32;
            i2 = sheshi + 273.15;
            Edit_f.setText("" + i1);
            Edit_k.setText("" + i2);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void convertf(View view) {
        try {
            double huashi = Double.parseDouble(Edit_f.getText().toString());
            i3 = (huashi - 32) / 1.8;
            i4 = (huashi + 459.67) / 1.8;
            i_2 = String.valueOf(huashi);
            Edit_c.setText("" + i3);
            Edit_k.setText("" + i4);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void convertk(View view) {
        try {
            double kaier = Double.parseDouble(Edit_k.getText().toString());
            i5 = kaier - 273.15;
            i6 = kaier * 1.8 - 459.67;
            i_3 = String.valueOf(kaier);
            Edit_c.setText("" + i5);
            Edit_f.setText("" + i6);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void reset(View view) {
        Edit_c.setText("");
        Edit_f.setText("");
        Edit_k.setText("");
        toast_tip(tip_clear);
    }

    public void back_tem(View v) {
        finish();
    }

}
