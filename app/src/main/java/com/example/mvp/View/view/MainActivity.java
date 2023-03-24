package com.example.mvp.View.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvp.R;
import com.example.mvp.View.InterfaceUnits.InterfacaMain;
import com.example.mvp.View.Presenter.preSenterMain;
import com.example.mvp.View.model.User;

public class MainActivity extends AppCompatActivity implements InterfacaMain {
    EditText edtAccount, edtPassword;
    Button btnLogin;
    TextView txtResutl;
    // khai báo interFace
    private  preSenterMain preSenterMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        preSenterMain = new preSenterMain(this);



        btnLogin . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onClickLogin();
            }
        });
    }

    private void onClickLogin() {
       String name = edtAccount.getText().toString().trim();
       String pass = edtPassword.getText().toString().trim();

        User user = new User(name,pass);
        preSenterMain.login(user);

    }

    private void mapping() {
        edtAccount = findViewById(R.id.edtAccount);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtResutl = findViewById(R.id.txtResuft);

    }

    @Override
    public void loginSucceccs() {
        txtResutl.setVisibility(View.VISIBLE);
        txtResutl.setText("Thành công");

    }

    @Override
    public void loginErrol() {
        txtResutl.setVisibility(View.VISIBLE);
        txtResutl.setText("Thất bại");

    }
}