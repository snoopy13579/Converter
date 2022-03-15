package cn.studyjams.s2.sj0196.Converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import cn.studyjams.s2.sj0196.Converter.util.ToastUtils;

public class length extends AppCompatActivity {

    EditText Edit_nm;
    EditText Edit_um;
    EditText Edit_mm;
    EditText Edit_cm;
    EditText Edit_m;
    EditText Edit_km;
    EditText Edit_ly;
    String i, i_1, i_2, i_3, i_4, i_5, i_6;
    double i1, i2, i3, i4, i5, i6;
    double i7, i8, i9, i10, i11, i12;
    double i13, i14, i15, i16, i17, i18;
    double i19, i20, i21, i22, i23, i24;
    double i25, i26, i27, i28, i29, i30;
    double i31, i32, i33, i34, i35, i36;
    double i37, i38, i39, i40, i41, i42;

    String tip_warning = "请正确输入！";
    String tip_clear="清空完成！";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length_layout);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        Edit_nm = (EditText) findViewById(R.id.length_nm);
        Edit_um = (EditText) findViewById(R.id.length_um);
        Edit_mm = (EditText) findViewById(R.id.length_mm);
        Edit_cm = (EditText) findViewById(R.id.length_cm);
        Edit_m = (EditText) findViewById(R.id.length_m);
        Edit_km = (EditText) findViewById(R.id.length_km);
        Edit_ly = (EditText) findViewById(R.id.length_ly);
    }

    /*提醒输入有误*/
    public void toast_tip(String tip) {
        ToastUtils.showToast(length.this, tip);
    }

    public void convertly(View view) {
        try {
            double guangnian = Double.parseDouble(Edit_ly.getText().toString());
            i1 = guangnian * 300000000.0 * 365 * 24 * 60 * 60 / 1000;
            i2 = guangnian * 300000000.0 * 365 * 24 * 60 * 60;
            i3 = guangnian * 300000000.0 * 365 * 24 * 60 * 60 * 100;
            i4 = guangnian * 300000000.0 * 365 * 24 * 60 * 60 * 1000;
            i5 = guangnian * 300000000.0 * 365 * 24 * 60 * 60 * 1000000;
            i6 = guangnian * 300000000.0 * 365 * 24 * 60 * 60 * 1000000000;
            i = String.valueOf(guangnian);
            Edit_km.setText("" + i1);
            Edit_m.setText("" + i2);
            Edit_cm.setText("" + i3);
            Edit_mm.setText("" + i4);
            Edit_um.setText("" + i5);
            Edit_nm.setText("" + i6);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void convertkm(View view) {
        try {
            double qianmi = Double.parseDouble(Edit_km.getText().toString());
            i7 = qianmi / (300000000.0 * 365 * 24 * 60 * 60) * 1000;
            i8 = qianmi * 1000.0;
            i9 = qianmi * 1000.0 * 100;
            i10 = qianmi * 1000.0 * 100.0 * 10.0;
            i11 = qianmi * 1000.0 * 100.0 * 10.0 * 1000;
            i12 = qianmi * 1000.0 * 100.0 * 10.0 * 1000 * 1000;
            i_1 = String.valueOf(qianmi);
            Edit_ly.setText("" + i7);
            Edit_m.setText("" + i8);
            Edit_cm.setText("" + i9);
            Edit_mm.setText("" + i10);
            Edit_um.setText("" + i11);
            Edit_nm.setText("" + i12);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void convertm(View view) {
        try {
            double mi = Double.parseDouble(Edit_m.getText().toString());
            i13 = mi / (300000000.0 * 365 * 24 * 60 * 60);
            i14 = mi / 1000.0;
            i15 = mi * 100;
            i16 = mi * 100.0 * 10.0;
            i17 = mi * 100.0 * 10.0 * 1000;
            i18 = mi * 100.0 * 10.0 * 1000 * 1000;
            i_2 = String.valueOf(mi);
            Edit_ly.setText("" + i13);
            Edit_km.setText("" + i14);
            Edit_cm.setText("" + i15);
            Edit_mm.setText("" + i16);
            Edit_um.setText("" + i17);
            Edit_nm.setText("" + i18);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }

    }

    public void convertcm(View view) {
        try {
            double limi = Double.parseDouble(Edit_cm.getText().toString());
            i19 = limi / (300000000.0 * 365 * 24 * 60 * 60 * 100);
            i20 = limi / 100.0 / 1000.0;
            i21 = limi / 100;
            i22 = limi * 10.0;
            i23 = limi * 10.0 * 1000;
            i24 = limi * 10.0 * 1000 * 1000;
            i_3 = String.valueOf(limi);
            Edit_ly.setText("" + i19);
            Edit_km.setText("" + i20);
            Edit_m.setText("" + i21);
            Edit_mm.setText("" + i22);
            Edit_um.setText("" + i23);
            Edit_nm.setText("" + i24);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void convertmm(View view) {
        try {
            double haomi = Double.parseDouble(Edit_mm.getText().toString());
            i25 = haomi / (300000000.0 * 365 * 24 * 60 * 60 * 1000);
            i26 = haomi / 1000.0 / 1000.0;
            i27 = haomi / 1000.0;
            i28 = haomi / 10.0;
            i29 = haomi * 1000;
            i30 = haomi * 1000 * 1000;
            i_4 = String.valueOf(haomi);
            Edit_ly.setText("" + i25);
            Edit_km.setText("" + i26);
            Edit_m.setText("" + i27);
            Edit_cm.setText("" + i28);
            Edit_um.setText("" + i29);
            Edit_nm.setText("" + i30);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void convertum(View view) {
        try {
            double weimi = Double.parseDouble(Edit_um.getText().toString());
            i31 = weimi / (300000000.0 * 365 * 24 * 60 * 60) / 1000000.0;
            i32 = weimi / (1000.0 * 1000.0 * 1000.0);
            i33 = weimi / (1000.0 * 1000.0);
            i34 = weimi / (10.0 * 1000.0);
            i35 = weimi / 1000;
            i36 = weimi * 1000;
            i_5 = String.valueOf(weimi);
            Edit_ly.setText("" + i31);
            Edit_km.setText("" + i32);
            Edit_m.setText("" + i33);
            Edit_cm.setText("" + i34);
            Edit_mm.setText("" + i35);
            Edit_nm.setText("" + i36);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void convertnm(View view) {
        try {
            double nami = Double.parseDouble(Edit_nm.getText().toString());
            i37 = nami / (300000000.0 * 365 * 24 * 60 * 60) / 1000000000.0;
            i38 = nami / (1000.0 * 1000.0 * 1000.0 * 1000.0);
            i39 = nami / (1000.0 * 1000.0 * 1000.0);
            i40 = nami / (10.0 * 1000.0 * 1000.0);
            i41 = nami / (1000 * 1000.0);
            i42 = nami / 1000;
            i_6 = String.valueOf(nami);
            Edit_ly.setText("" + i37);
            Edit_km.setText("" + i38);
            Edit_m.setText("" + i39);
            Edit_cm.setText("" + i40);
            Edit_mm.setText("" + i41);
            Edit_um.setText("" + i42);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void reset(View view) {
        Edit_ly.setText("");
        Edit_km.setText("");
        Edit_m.setText("");
        Edit_cm.setText("");
        Edit_mm.setText("");
        Edit_um.setText("");
        Edit_nm.setText("");
        toast_tip(tip_clear);
    }

    public void back_length(View v) {
        finish();
    }
}
