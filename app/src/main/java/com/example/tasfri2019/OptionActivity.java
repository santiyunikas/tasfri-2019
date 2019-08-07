package com.example.tasfri2019;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tasfri2019.Authentification.AdminsignActivity;
import com.example.tasfri2019.Authentification.SignupActivity;
import com.google.firebase.auth.FirebaseAuth;

public class OptionActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnAdmin, btnGuest, btnUser;
    private FirebaseAuth auth;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        btnAdmin = findViewById(R.id.btn_admin);
        btnGuest = findViewById(R.id.btn_guest);
        btnUser = findViewById(R.id.btn_user);

        btnAdmin.setOnClickListener(this);
        btnGuest.setOnClickListener(this);
        btnUser.setOnClickListener(this);

        auth = FirebaseAuth.getInstance();

        if (auth.getUid()!= null){
            intent = new Intent(OptionActivity.this, HomeActivity.class);
            finish();
            startActivity(intent);
        }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_admin :
                if (auth.getUid()!= null){
                    intent = new Intent(OptionActivity.this, HomeActivity.class);
                    finish();
                }else{
                    intent = new Intent(OptionActivity.this, AdminsignActivity.class);
                    finish();
                }
                startActivity(intent);
                break;
            case R.id.btn_guest :
                intent = new Intent(OptionActivity.this, HomeActivity.class);
                finish();
                startActivity(intent);
                break;
            case R.id.btn_user :
                if (auth.getUid()!= null){
                    intent = new Intent(OptionActivity.this, HomeActivity.class);
                    finish();
                }else {
                    intent = new Intent(OptionActivity.this, SignupActivity.class);
                    finish();
                }
                startActivity(intent);
                break;
        }
    }
}