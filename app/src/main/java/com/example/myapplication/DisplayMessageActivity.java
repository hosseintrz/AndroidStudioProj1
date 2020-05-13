package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("passed");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");
        String email = intent.getStringExtra("email");
        User user = new User(username, password, email);
        TextView signupResult = findViewById(R.id.signupResult);
        System.out.println("passed2");
        if (MainActivity.users.contains(user))
            signupResult.setText(R.string.signupFail);
        else
            {
                MainActivity.users.add(user);
                signupResult.setText(R.string.signupSuccess);
            }
    SignupDialog signupdialog=new SignupDialog();


    }
    //TextView result=findViewById(R.id.result);

}
