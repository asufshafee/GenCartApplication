package com.webmarke8.app.gencart.Activities;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.webmarke8.app.gencart.R;
import com.webmarke8.app.gencart.Session.MyApplication;
import com.webmarke8.app.gencart.Utils.AppUtils;
import com.webmarke8.app.gencart.Utils.Validations;

public class Customer_Login extends AppCompatActivity {

    EditText Email, Password;

    MyApplication myApplication;
    RelativeLayout Progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer__login);


        myApplication = (MyApplication) getApplicationContext();
        Progress = (RelativeLayout) findViewById(R.id.Progress);


        Email = (EditText) findViewById(R.id.email);
        Password = (EditText) findViewById(R.id.password);


        findViewById(R.id.forgot_password).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Validations.isValidEmail(Email, "Email is not Valid") && Validations.isEmpity(Password, "Password is not Valid")) {

                    Progress.setVisibility(View.VISIBLE);
                    LoginService();

                }
            }
        });

        findViewById(R.id.signup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AppUtils.StartActivity(getApplicationContext(), Customer_Signup.class);

            }
        });
    }

    public void LoginService() {

    }
}
