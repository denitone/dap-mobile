package com.deni.dap.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.deni.dap.R;
import com.deni.dap.login.LoginActivity;

public class HomeActivity extends AppCompatActivity implements HomeViewContract {
    HomePresenter presenter;
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        presenter = new HomePresenter(this);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.doBackToLogin();
            }
        });
    }

    @Override
    public void successBackToLogin() {
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        finish();
    }
}