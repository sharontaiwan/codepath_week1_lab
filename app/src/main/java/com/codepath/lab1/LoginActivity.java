package com.codepath.lab1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button onLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        onLogin = (Button) findViewById(R.id.btnLogin);

        //設定按鈕的ClickListener
        onLogin.setOnClickListener(new Button.OnClickListener() {
         @Override
            public void onClick(View view) {

             //當使用者按下按鈕時顯示Toast
             //Toast.LENGTH_LONG表示顯示時間較長，Toast.LENGTH_SHORT則表示顯示時間較短
             Toast.makeText(view.getContext(), "這是一個Toast......", Toast.LENGTH_LONG).show();

         }
        });
    }


    public void onLogin(View view) {

    }
}
