package com.deni.dap.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.deni.dap.R;
import com.deni.dap.home.HomeActivity;
import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity implements LoginViewContract {
    LoginPresenter presenter;
    Button btn_login;
    TextView et_username,et_password;
    View currentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presenter = new LoginPresenter(this);


        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentView = view;
                presenter.doLogin(et_username.getText().toString(), et_password.getText().toString());
            }
        });

    }

    @Override
    public void showLoginSuccess(String message) {
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        this.startActivity(intent);
        this.finish();
    }

    @Override
    public void showLoginFailed(String message) {
        Snackbar.make(currentView, message, Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
}