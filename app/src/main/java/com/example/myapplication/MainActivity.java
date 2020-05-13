package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.MyApplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static ArrayList<User> users = new ArrayList<>();
    @Override
    public void onRestoreInstanceState(Bundle savedIntanceState){}
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast=Toast.makeText(this,"onstart started",Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onResume(){
        Toast toast=Toast.makeText(this,"onResume started",Toast.LENGTH_SHORT);
        toast.show();
        super.onResume();
    }

    public void makeSure(View view){
    final Toast yesToast = Toast.makeText(this, "you said yes", Toast.LENGTH_LONG);
    final Toast noToast = Toast.makeText(this, "you said no", Toast.LENGTH_LONG);
    AlertDialog.Builder alertdialog = new AlertDialog.Builder(this).setTitle("signup")
            .setMessage("are you sure?")
            .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    yesToast.show();
                    Signup();
                 }
            }).setNegativeButton("no", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    noToast.show();
                    return;
                }
            });
        alertdialog.show();
}

public void Signup() {

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText usernameT = (EditText) findViewById(R.id.usernameTXT);
        EditText passwordT = findViewById(R.id.passwordTXT);
        EditText EmailT = findViewById(R.id.EmailTXT);
        String username = usernameT.getText().toString();
        String email = EmailT.getText().toString();
        String password = passwordT.getText().toString();
        intent.putExtra("username", username);
        intent.putExtra("password", password);
        intent.putExtra("Email", email);
        startActivity(intent);
                /*EditText firstText=(EditText) findViewById(R.id.num1text);
                EditText secondText=(EditText) findViewById(R.id.num2text);
                System.out.println(firstText+" "+secondText);*/
        //TextView answer=(TextView) findViewById(R.id.answerBtn);
        //answer.setText(firstText.getText().toString()+secondText.getText().toString());
    }
};


