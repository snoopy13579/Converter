package cn.studyjams.s2.sj0196.Converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by lenovo on 2017/4/17.
 */

public class guide extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_layout);
    }

    public void back(View v) {
        finish();
    }
}
