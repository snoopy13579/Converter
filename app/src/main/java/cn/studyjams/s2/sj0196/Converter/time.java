package cn.studyjams.s2.sj0196.Converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;

import cn.studyjams.s2.sj0196.Converter.util.ToastUtils;

public class time extends AppCompatActivity {
    EditText Edit_c;
    EditText Edit_y;
    EditText Edit_m;
    EditText Edit_w;
    EditText Edit_d;
    EditText Edit_h;
    EditText Edit_min;
    EditText Edit_s;
    RadioButton rad_btn_year1;
    RadioButton rad_btn_year2;
    RadioButton rad_btn_day1;
    RadioButton rad_btn_day2;
    RadioButton rad_btn_day3;
    RadioButton rad_btn_day4;

    String tip_warning = "请正确输入！";
    String tip_clear="清空完成！";

    double year = 365.0;
    double day = 30.0;
    String i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8;
    double i1, i2, i3, i4, i5, i6, i7;
    double i11, i12, i13, i14, i15, i16, i17;
    double i21, i22, i23, i24, i25, i26, i27;
    double i31, i32, i33, i34, i35, i36, i37;
    double i41, i42, i43, i44, i45, i46, i47;
    double i51, i52, i53, i54, i55, i56, i57;
    double i61, i62, i63, i64, i65, i66, i67;
    double i71, i72, i73, i74, i75, i76, i77;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_layout);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        Edit_c = (EditText) findViewById(R.id.time_c);
        Edit_y = (EditText) findViewById(R.id.time_y);
        Edit_m = (EditText) findViewById(R.id.time_m);
        Edit_w = (EditText) findViewById(R.id.time_w);
        Edit_d = (EditText) findViewById(R.id.time_d);
        Edit_h = (EditText) findViewById(R.id.time_h);
        Edit_min = (EditText) findViewById(R.id.time_min);
        Edit_s = (EditText) findViewById(R.id.time_s);
        rad_btn_year1 = (RadioButton) findViewById(R.id.rad_btn_year1);
        rad_btn_year2 = (RadioButton) findViewById(R.id.rad_btn_year2);
        rad_btn_day1 = (RadioButton) findViewById(R.id.rad_btn_day1);
        rad_btn_day2 = (RadioButton) findViewById(R.id.rad_btn_day2);
        rad_btn_day3 = (RadioButton) findViewById(R.id.rad_btn_day3);
        rad_btn_day4 = (RadioButton) findViewById(R.id.rad_btn_day4);
    }

    /*提醒输入有误*/
    public void toast_tip(String tip) {
        ToastUtils.showToast(time.this, tip);
    }

    public void checkYearMonth() {
        if (rad_btn_year2.isChecked()) {
            year = 366;
        } else if (rad_btn_year1.isChecked()) {
            year = 365;
        }
        if (rad_btn_day1.isChecked()) {
            day = 28;
        } else if (rad_btn_day2.isChecked()) {
            day = 29;
        } else if (rad_btn_day3.isChecked()) {
            day = 30;
        } else if (rad_btn_day4.isChecked()) {
            day = 31;
        }
    }

    public void convertc(View view) {
        try {
            checkYearMonth();
            double shiji = Double.parseDouble(Edit_c.getText().toString());
            i1 = shiji * 100.0;
            i2 = shiji * 100.0 * 12;
            i3 = (shiji * 100.0 * year) / 7.0;
            i4 = shiji * 100.0 * year;
            i5 = shiji * 100.0 * year * 24;
            i6 = shiji * 100.0 * year * 24 * 60;
            i7 = shiji * 100.0 * year * 24 * 60 * 60;
            i_1 = String.valueOf(shiji);
            Edit_y.setText("" + i1);
            Edit_m.setText("" + i2);
            Edit_w.setText("" + i3);
            Edit_d.setText("" + i4);
            Edit_h.setText("" + i5);
            Edit_min.setText("" + i6);
            Edit_s.setText("" + i7);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void converty(View view) {
        try {
            checkYearMonth();
            double nian = Double.parseDouble(Edit_y.getText().toString());
            i11 = nian / 100.0;
            i12 = nian * 12;
            i13 = (nian * year) / 7.0;
            i14 = nian * year;
            i15 = nian * year * 24;
            i16 = nian * year * 24 * 60;
            i17 = nian * year * 24 * 60 * 60;
            i_2 = String.valueOf(nian);
            Edit_c.setText("" + i11);
            Edit_m.setText("" + i12);
            Edit_w.setText("" + i13);
            Edit_d.setText("" + i14);
            Edit_h.setText("" + i15);
            Edit_min.setText("" + i16);
            Edit_s.setText("" + i17);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void convertm(View view) {
        try {
            checkYearMonth();
            double yue = Double.parseDouble(Edit_m.getText().toString());
            i21 = yue / 12.0 / 100.0;
            i22 = yue / 12;
            i23 = (yue * day) / 7.0;
            i24 = yue * day;
            i25 = yue * day * 24;
            i26 = yue * day * 24 * 60;
            i27 = yue * day * 24 * 60 * 60;
            i_3 = String.valueOf(yue);
            Edit_c.setText("" + i21);
            Edit_y.setText("" + i22);
            Edit_w.setText("" + i23);
            Edit_d.setText("" + i24);
            Edit_h.setText("" + i25);
            Edit_min.setText("" + i26);
            Edit_s.setText("" + i27);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void convertw(View view) {
        try {
            checkYearMonth();
            double zhou = Double.parseDouble(Edit_w.getText().toString());
            i31 = (zhou * 7) / year / 100.0;
            i32 = (zhou * 7) / year;
            i33 = (zhou * 7) / day;
            i34 = zhou * 7;
            i35 = zhou * 7 * 24;
            i36 = zhou * 7 * 24 * 60;
            i37 = zhou * 7 * 24 * 60 * 60;
            i_4 = String.valueOf(zhou);
            Edit_c.setText("" + i31);
            Edit_y.setText("" + i32);
            Edit_m.setText("" + i33);
            Edit_d.setText("" + i34);
            Edit_h.setText("" + i35);
            Edit_min.setText("" + i36);
            Edit_s.setText("" + i37);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void convertd(View view) {
        try {
            checkYearMonth();
            double tian = Double.parseDouble(Edit_d.getText().toString());
            i41 = tian / year / 100.0;
            i42 = tian / year;
            i43 = tian / day;
            i44 = tian / 7.0;
            i45 = tian * 24;
            i46 = tian * 24 * 60;
            i47 = tian * 24 * 60 * 60;
            i_5 = String.valueOf(tian);
            Edit_c.setText("" + i41);
            Edit_y.setText("" + i42);
            Edit_m.setText("" + i43);
            Edit_w.setText("" + i44);
            Edit_h.setText("" + i45);
            Edit_min.setText("" + i46);
            Edit_s.setText("" + i47);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void converth(View view) {
        try {
            checkYearMonth();
            double shi = Double.parseDouble(Edit_h.getText().toString());
            i51 = shi / 24.0 / year / 100.0;
            i52 = shi / 24.0 / year;
            i53 = shi / 24.0 / day;
            i54 = shi / 24.0 / 7.0;
            i55 = shi / 24.0;
            i56 = shi * 60;
            i57 = shi * 60 * 60;
            i_6 = String.valueOf(shi);
            Edit_c.setText("" + i51);
            Edit_y.setText("" + i52);
            Edit_m.setText("" + i53);
            Edit_w.setText("" + i54);
            Edit_d.setText("" + i55);
            Edit_min.setText("" + i56);
            Edit_s.setText("" + i57);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void convertmin(View view) {
        try {
            checkYearMonth();
            double fen = Double.parseDouble(Edit_min.getText().toString());
            i61 = fen / 60.0 / 24.0 / year / 100.0;
            i62 = fen / 60.0 / 24.0 / year;
            i63 = fen / 60.0 / 24.0 / day;
            i64 = fen / 60.0 / 24.0 / 7.0;
            i65 = fen / 60.0 / 24.0;
            i66 = fen / 60.0;
            i67 = fen * 60.0;
            i_7 = String.valueOf(fen);
            Edit_c.setText("" + i61);
            Edit_y.setText("" + i62);
            Edit_m.setText("" + i63);
            Edit_w.setText("" + i64);
            Edit_d.setText("" + i65);
            Edit_h.setText("" + i66);
            Edit_s.setText("" + i67);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void converts(View view) {
        try {
            checkYearMonth();
            double miao = Double.parseDouble(Edit_s.getText().toString());
            i71 = miao / 60.0 / 60.0 / 24.0 / year / 100.0;
            i72 = miao / 60.0 / 60.0 / 24.0 / year;
            i73 = miao / 60.0 / 60.0 / 24.0 / day;
            i74 = miao / 60.0 / 60.0 / 24.0 / 7.0;
            i75 = miao / 60.0 / 60.0 / 24.0;
            i76 = miao / 60.0 / 60.0;
            i77 = miao / 60.0;
            i_8 = String.valueOf(miao);
            Edit_c.setText("" + i71);
            Edit_y.setText("" + i72);
            Edit_m.setText("" + i73);
            Edit_w.setText("" + i74);
            Edit_d.setText("" + i75);
            Edit_h.setText("" + i76);
            Edit_min.setText("" + i77);
        } catch (Exception e) {
            toast_tip(tip_warning);
        }
    }

    public void reset(View view) {
        Edit_c.setText("");
        Edit_y.setText("");
        Edit_m.setText("");
        Edit_w.setText("");
        Edit_d.setText("");
        Edit_h.setText("");
        Edit_min.setText("");
        Edit_s.setText("");
        toast_tip(tip_clear);
    }

    public void back_time(View v) {
        finish();
    }
}
