package com.wong.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.wong.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler();
    UserBean userbean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
//        final UserBean userbean = new UserBean("张三",33);
        userbean = new UserBean("张三",33);
        mainBinding.setUser(userbean);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                userbean.setName("李四");
                userbean.setAge(18);
            }
        },5000);

        mainBinding.btNext.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                Toast.makeText(MainActivity.this,"Change",Toast.LENGTH_SHORT).show();
                userbean.setName("王五");
                userbean.setAge(20);
            }
        });


    }
}
