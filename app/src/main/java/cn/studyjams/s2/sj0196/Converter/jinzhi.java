package cn.studyjams.s2.sj0196.Converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import cn.studyjams.s2.sj0196.Converter.util.ToastUtils;
import cn.studyjams.s2.sj0196.Converter.util.UpperCaseTransform;

public class jinzhi extends AppCompatActivity {
    EditText Edit_b;
    EditText Edit_o;
    EditText Edit_d;
    EditText Edit_h;

    String tip = "请正确输入！";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jinzhi_layout);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        Edit_b = (EditText) findViewById(R.id.jinzhi_b);
        Edit_o = (EditText) findViewById(R.id.jinzhi_o);
        Edit_d = (EditText) findViewById(R.id.jinzhi_d);
        Edit_h = (EditText) findViewById(R.id.jinzhi_h);
        Edit_h.setTransformationMethod(new UpperCaseTransform());
    }

    public void convert_b(View view) {
        try {
            String result_d = Integer.valueOf(Edit_b.getText().toString(), 2).toString();
            Edit_d.setText("" + result_d);
            String result_o = Integer.toOctalString(Integer.valueOf(result_d));
            Edit_o.setText(""+result_o);
            String result_h = Integer.toHexString(Integer.valueOf(result_d));
            Edit_h.setText(""+result_h);
        } catch (Exception e) {
            ToastUtils.showToast(jinzhi.this, tip);
        }
    }

    public void convert_o(View view) {
        try {
            String result_d = Integer.valueOf(Edit_o.getText().toString(), 8).toString();
            Edit_d.setText("" + result_d);
            String result_b = Integer.toBinaryString(Integer.valueOf(result_d));
            Edit_b.setText(""+result_b);
            String result_h = Integer.toHexString(Integer.valueOf(result_d));
            Edit_h.setText(""+result_h);
        } catch (Exception e) {
            ToastUtils.showToast(jinzhi.this, tip);
        }
    }

    public void convert_d(View view) {
        try {
            String result_b = Integer.toBinaryString(Integer.valueOf(Edit_d.getText().toString()));
            Edit_b.setText(""+result_b);
            String result_o = Integer.toOctalString(Integer.valueOf(Edit_d.getText().toString()));
            Edit_o.setText(""+result_o);
            String result_h = Integer.toHexString(Integer.valueOf(Edit_d.getText().toString()));
            Edit_h.setText(""+result_h);
        } catch (Exception e) {
            ToastUtils.showToast(jinzhi.this, tip);
        }
    }

    public void convert_h(View view) {
        try {
            String result_d = Integer.valueOf(Edit_h.getText().toString(), 16).toString();
            Edit_d.setText("" + result_d);
            String result_b = Integer.toBinaryString(Integer.valueOf(result_d));
            Edit_b.setText(""+result_b);
            String result_o = Integer.toOctalString(Integer.valueOf(result_d));
            Edit_o.setText(""+result_o);
        } catch (Exception e) {
            ToastUtils.showToast(jinzhi.this, tip);
        }
    }

    public void reset(View view) {
        Edit_b.setText("");
        Edit_o.setText("");
        Edit_d.setText("");
        Edit_h.setText("");
        ToastUtils.showToast(jinzhi.this, "清空完成");
    }

    public void back_jinzhi(View view) {
        finish();
    }
}
