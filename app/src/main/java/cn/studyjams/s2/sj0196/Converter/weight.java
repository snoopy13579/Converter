package cn.studyjams.s2.sj0196.Converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import cn.studyjams.s2.sj0196.Converter.util.ToastUtils;

/**
 * Created by lenovo on 2017/4/16.
 */

public class weight extends AppCompatActivity {

    EditText Edit_t;
    EditText Edit_kg;
    EditText Edit_j;
    EditText Edit_g;
    EditText Edit_mg;
    EditText Edit_ug;
    String i_1, i_2, i_3, i_4, i_5, i_6;
    double i1, i2, i3, i4, i5;
    double i11, i12, i13, i14, i15;
    double i21, i22, i23, i24, i25;
    double i31, i32, i33, i34, i35;
    double i41, i42, i43, i44, i45;
    double i51, i52, i53, i54, i55;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_layout);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        Edit_t = (EditText) findViewById(R.id.weight_t);
        Edit_kg = (EditText) findViewById(R.id.weight_kg);
        Edit_j = (EditText) findViewById(R.id.weight_j);
        Edit_g = (EditText) findViewById(R.id.weight_g);
        Edit_mg = (EditText) findViewById(R.id.weight_mg);
        Edit_ug = (EditText) findViewById(R.id.weight_ug);
    }

    public void convertt(View view) {
        try {
            double dun = Double.parseDouble(Edit_t.getText().toString());
            i1 = dun * 1000.0;
            i2 = dun * 1000.0 * 2.0;
            i3 = dun * 1000.0 * 1000.0;
            i4 = dun * 1000.0 * 1000.0 * 1000.0;
            i5 = dun * 1000.0 * 1000.0 * 1000.0 * 1000.0;
            i_1 = String.valueOf(dun);
            Edit_kg.setText("" + i1);
            Edit_j.setText("" + i2);
            Edit_g.setText("" + i3);
            Edit_mg.setText("" + i4);
            Edit_ug.setText("" + i5);
        } catch (Exception e) {
            ToastUtils.showToast(weight.this, "请正确输入！");
        }
    }

    public void convertkg(View view) {
        try {
            double qianke = Double.parseDouble(Edit_kg.getText().toString());
            i11 = qianke / 1000.0;
            i12 = qianke * 2.0;
            i13 = qianke * 1000.0;
            i14 = qianke * 1000.0 * 1000.0;
            i15 = qianke * 1000.0 * 1000.0 * 1000.0;
            i_2 = String.valueOf(qianke);
            Edit_t.setText("" + i11);
            Edit_j.setText("" + i12);
            Edit_g.setText("" + i13);
            Edit_mg.setText("" + i14);
            Edit_ug.setText("" + i15);
        } catch (Exception e) {
            ToastUtils.showToast(weight.this, "请正确输入！");
        }
    }

    public void convertj(View view) {
        try {
            double jin = Double.parseDouble(Edit_j.getText().toString());
            i21 = jin / 2000.0;
            i22 = jin / 2.0;
            i23 = jin * 500.0;
            i24 = jin * 500.0 * 1000.0;
            i25 = jin * 500.0 * 1000.0 * 1000.0;
            i_3 = String.valueOf(jin);
            Edit_t.setText("" + i21);
            Edit_kg.setText("" + i22);
            Edit_g.setText("" + i23);
            Edit_mg.setText("" + i24);
            Edit_ug.setText("" + i25);
        } catch (Exception e) {
            ToastUtils.showToast(weight.this, "请正确输入！");
        }
    }

    public void convertke(View view) {
        try {
            double ke = Double.parseDouble(Edit_g.getText().toString());
            i31 = ke / 1000.0 / 1000.0;
            i32 = ke / 1000.0;
            i33 = ke / 500.0;
            i34 = ke * 1000.0;
            i35 = ke * 1000.0 * 1000.0;
            i_4 = String.valueOf(ke);
            Edit_t.setText("" + i31);
            Edit_kg.setText("" + i32);
            Edit_j.setText("" + i33);
            Edit_mg.setText("" + i34);
            Edit_ug.setText("" + i35);
        } catch (Exception e) {
            ToastUtils.showToast(weight.this, "请正确输入！");
        }
    }

    public void convertmg(View view) {
        try {
            double haoke = Double.parseDouble(Edit_mg.getText().toString());
            i41 = haoke / 1000.0 / 1000000.0;
            i42 = haoke / 1000.0 / 1000.0;
            i43 = haoke / 1000.0 / 500.0;
            i44 = haoke / 1000.0;
            i45 = haoke * 1000.0;
            i_5 = String.valueOf(haoke);
            Edit_t.setText("" + i41);
            Edit_kg.setText("" + i42);
            Edit_j.setText("" + i43);
            Edit_g.setText("" + i44);
            Edit_ug.setText("" + i45);
        } catch (Exception e) {
            ToastUtils.showToast(weight.this, "请正确输入！");
        }
    }

    public void convertug(View view) {
        try {
            double weike = Double.parseDouble(Edit_ug.getText().toString());
            i51 = weike / 1000.0 / 1000000000.0;
            i52 = weike / 1000.0 / 1000000.0;
            i53 = weike / 1000.0 / 500000.0;
            i54 = weike / 1000.0 / 1000.0;
            i55 = weike / 1000.0;
            i_6 = String.valueOf(weike);
            Edit_t.setText("" + i51);
            Edit_kg.setText("" + i52);
            Edit_j.setText("" + i53);
            Edit_g.setText("" + i54);
            Edit_mg.setText("" + i55);
        } catch (Exception e) {
            ToastUtils.showToast(weight.this, "请正确输入！");
        }
    }

    public void reset(View view) {
        Edit_t.setText("");
        Edit_kg.setText("");
        Edit_j.setText("");
        Edit_g.setText("");
        Edit_mg.setText("");
        Edit_ug.setText("");
        ToastUtils.showToast(weight.this, "清空完成");
    }

    public void back_wei(View v) {
        finish();
    }
}
