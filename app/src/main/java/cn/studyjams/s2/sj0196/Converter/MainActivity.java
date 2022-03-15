package cn.studyjams.s2.sj0196.Converter;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;

import cn.studyjams.s2.sj0196.Converter.dialog.SelfDialog;


public class MainActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;
    private SelfDialog selfDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }*/
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    public void len(View view) {
        Intent intent = new Intent(MainActivity.this, length.class);
        startActivity(intent);
    }

    public void tim(View view) {
        Intent intent1 = new Intent(MainActivity.this, time.class);
        startActivity(intent1);
    }

    public void tem(View view) {
        Intent intent2 = new Intent(MainActivity.this, temperature.class);
        startActivity(intent2);
    }

    public void wei(View view) {
        Intent intent3 = new Intent(MainActivity.this, weight.class);
        startActivity(intent3);
    }

    public void spe(View view) {
        Intent intent4 = new Intent(MainActivity.this, speed.class);
        startActivity(intent4);
    }

    public void sto(View view) {
        Intent intent5 = new Intent(MainActivity.this, storage.class);
        startActivity(intent5);
    }

    public void guide(View view) {
        Intent intent6 = new Intent(MainActivity.this, guide.class);
        startActivity(intent6);
    }

    public void jin(View view) {
        Intent intent7 = new Intent(MainActivity.this, jinzhi.class);
        startActivity(intent7);
    }

    public void quit(View v) {
        /*AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Converter v2.0");
        builder.setMessage("确定退出?");
        builder.setPositiveButton("退出", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        AlertDialog alert = builder.create();
        alert.show();*/
        selfDialog = new SelfDialog(MainActivity.this);
        selfDialog.setTitle("提示");
        selfDialog.setMessage("确定退出Converter？");
        selfDialog.setYesOnclickListener("确定", new SelfDialog.onYesOnclickListener() {
            @Override
            public void onYesClick() {
                finish();
            }
        });
        selfDialog.setNoOnclickListener("取消", new SelfDialog.onNoOnclickListener() {
            @Override
            public void onNoClick() {
                selfDialog.dismiss();
            }
        });
        selfDialog.show();
    }

    //退出程序
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        View v = null;
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            quit(v);
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
