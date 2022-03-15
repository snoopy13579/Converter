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

public class storage extends AppCompatActivity {
    EditText Edit_tb;
    EditText Edit_gb;
    EditText Edit_mb;
    EditText Edit_kb;
    EditText Edit_b;
    EditText Edit_bit;
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
        setContentView(R.layout.storage_layout);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        Edit_tb = (EditText) findViewById(R.id.storage_tb);
        Edit_gb = (EditText) findViewById(R.id.storage_gb);
        Edit_mb = (EditText) findViewById(R.id.storage_mb);
        Edit_kb = (EditText) findViewById(R.id.storage_kb);
        Edit_b = (EditText) findViewById(R.id.storage_b);
        Edit_bit = (EditText) findViewById(R.id.storage_bit);
    }

    public void converttb(View view) {
        try {
            double t = Double.parseDouble(Edit_tb.getText().toString());
            i1 = t * 1024.0;
            i2 = t * 1024.0 * 1024.0;
            i3 = t * 1024.0 * 1024.0 * 1024.0;
            i4 = t * 1024.0 * 1024.0 * 1024.0 * 1024.0;
            i5 = t * 1024.0 * 1024.0 * 1024.0 * 1024.0 * 8.0;
            i_1 = String.valueOf(t);
            Edit_gb.setText("" + i1);
            Edit_mb.setText("" + i2);
            Edit_kb.setText("" + i3);
            Edit_b.setText("" + i4);
            Edit_bit.setText("" + i5);
        } catch (Exception e) {
            ToastUtils.showToast(storage.this, "请正确输入！");
        }
    }

    public void convertgb(View view) {
        try {
            double gb = Double.parseDouble(Edit_gb.getText().toString());
            i11 = gb / 1024.0;
            i12 = gb * 1024.0;
            i13 = gb * 1024.0 * 1024.0;
            i14 = gb * 1024.0 * 1024.0 * 1024.0;
            i15 = gb * 1024.0 * 1024.0 * 1024.0 * 8.0;
            i_2 = String.valueOf(gb);
            Edit_tb.setText("" + i11);
            Edit_mb.setText("" + i12);
            Edit_kb.setText("" + i13);
            Edit_b.setText("" + i14);
            Edit_bit.setText("" + i15);
        } catch (Exception e) {
            ToastUtils.showToast(storage.this, "请正确输入！");
        }
    }

    public void convertmb(View view) {
        try {
            double mb = Double.parseDouble(Edit_mb.getText().toString());
            i21 = mb / 1024.0 / 1024;
            i22 = mb / 1024.0;
            i23 = mb * 1024.0;
            i24 = mb * 1024.0 * 1024.0;
            i25 = mb * 1024.0 * 1024.0 * 8.0;
            i_3 = String.valueOf(mb);
            Edit_tb.setText("" + i21);
            Edit_gb.setText("" + i22);
            Edit_kb.setText("" + i23);
            Edit_b.setText("" + i24);
            Edit_bit.setText("" + i25);
        } catch (Exception e) {
            ToastUtils.showToast(storage.this, "请正确输入！");
        }
    }

    public void convertkb(View view) {
        try {
            double kb = Double.parseDouble(Edit_kb.getText().toString());
            i31 = kb / 1024.0 / 1024 / 1024.0;
            i32 = kb / 1024.0 / 1024.0;
            i33 = kb / 1024.0;
            i34 = kb * 1024.0;
            i35 = kb * 1024.0 * 8.0;
            i_4 = String.valueOf(kb);
            Edit_tb.setText("" + i31);
            Edit_gb.setText("" + i32);
            Edit_mb.setText("" + i33);
            Edit_b.setText("" + i34);
            Edit_bit.setText("" + i35);
        } catch (Exception e) {
            ToastUtils.showToast(storage.this, "请正确输入！");
        }
    }

    public void convertb(View view) {
        try {
            double kb = Double.parseDouble(Edit_b.getText().toString());
            i41 = kb / 1024.0 / 1024 / 1024.0 / 1024.0;
            i42 = kb / 1024.0 / 1024.0 / 1024.0;
            i43 = kb / 1024.0 / 1024.0;
            i44 = kb / 1024.0;
            i45 = kb * 8.0;
            i_5 = String.valueOf(kb);
            Edit_tb.setText("" + i41);
            Edit_gb.setText("" + i42);
            Edit_mb.setText("" + i43);
            Edit_kb.setText("" + i44);
            Edit_bit.setText("" + i45);
        } catch (Exception e) {
            ToastUtils.showToast(storage.this, "请正确输入！");
        }
    }

    public void convertbit(View view) {
        try {
            double bit = Double.parseDouble(Edit_bit.getText().toString());
            i51 = bit / 8.0 / 1024.0 / 1024 / 1024.0 / 1024.0;
            i52 = bit / 8.0 / 1024.0 / 1024.0 / 1024.0;
            i53 = bit / 8.0 / 1024.0 / 1024.0;
            i54 = bit / 8.0 / 1024.0;
            i55 = bit / 8.0;
            i_6 = String.valueOf(bit);
            Edit_tb.setText("" + i51);
            Edit_gb.setText("" + i52);
            Edit_mb.setText("" + i53);
            Edit_kb.setText("" + i54);
            Edit_b.setText("" + i55);
        } catch (Exception e) {
            ToastUtils.showToast(storage.this, "请正确输入！");
        }
    }

    public void reset(View view) {
        Edit_tb.setText("");
        Edit_gb.setText("");
        Edit_mb.setText("");
        Edit_kb.setText("");
        Edit_b.setText("");
        Edit_bit.setText("");
        ToastUtils.showToast(storage.this, "清空完成");
    }

    public void back_sto(View v) {
        finish();
    }
}
