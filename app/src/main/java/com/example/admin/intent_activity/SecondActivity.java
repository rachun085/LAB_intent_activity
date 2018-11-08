package com.example.admin.intent_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView showuser,showpass,showgender,showbd,showemail,showphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button buttonback = findViewById(R.id.button_back);

        showuser = (TextView) findViewById(R.id.showuser);
        showpass = (TextView) findViewById(R.id.showpass);
        showgender = (TextView) findViewById(R.id.showgender);
        showbd = (TextView) findViewById(R.id.showbd);
        showemail = (TextView) findViewById(R.id.showemail);
        showphone = (TextView) findViewById(R.id.showphone);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String user = bundle.getString("user");
            showuser.setText("Username : "+String.format(user));
            String pass = bundle.getString("pass");
            showpass.setText("Password : "+String.format(pass));
            String gender = bundle.getString("gender");
            showgender.setText("Gender: "+String.format(gender));
            String bd = bundle.getString("bd");
            showbd.setText("Birthday : "+String.format(bd));
            String email = bundle.getString("email");
            showemail.setText("Email : "+String.format(email));
            String phone = bundle.getString("phone");
            showphone.setText("Phone : "+String.format(phone));
        }

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
