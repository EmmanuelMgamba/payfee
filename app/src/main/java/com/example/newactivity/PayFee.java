package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PayFee extends AppCompatActivity {

    EditText reg_username, reg_pass, reg_confirm ;
    Button btn_regis;
    Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_fee);

        reg_username = findViewById(R.id.reg_username);
        reg_pass = findViewById(R.id.reg_pass);
        reg_confirm = findViewById(R.id.reg_confirm);
        Button btn_login = (Button) findViewById(R.id.btn_login);
        Button btn_regis = (Button) findViewById(R.id.btn_regis);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayFee.this, MainActivity.class);
                startActivity(intent);



    }
});
        btn_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayFee.this, MainActivity.class);
                startActivity(intent);

    }
});
    }
}