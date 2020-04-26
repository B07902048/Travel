package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travel.user.LoginActivity;
import com.example.travel.user.SignupActivity;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        if(mAuth.getCurrentUser() != null)
            jump();
        setContentView(R.layout.activity_main);
    }

    private void jump(){
        intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
    }

    public void jumpLogin(View view){
        intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void jumSignup(View view){
        intent = new Intent(MainActivity.this, SignupActivity.class);
        startActivity(intent);
    }
}
