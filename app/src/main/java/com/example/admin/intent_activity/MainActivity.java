package com.example.admin.intent_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edituser,editpass,editbd,editemail,editphone;
    Button buttonsubm;
    RadioGroup genderRadioGroup;
    String gender;
    RadioButton radioButton;
    String eduser;
    String edpass;
    String edgender;
    String edbd;
    String edemail;
    String edphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonsubm = findViewById(R.id.button_submit);

        edituser = (EditText) findViewById(R.id.edit_textuser);
        editpass = (EditText) findViewById(R.id.edit_textpass);
        editbd = (EditText) findViewById(R.id.edit_textbd);
        editemail = (EditText) findViewById(R.id.edit_textemail);
        editphone = (EditText) findViewById(R.id.edit_phone);

        genderRadioGroup = (RadioGroup) findViewById(R.id.radio);

        buttonsubm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedgender = genderRadioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedgender);

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                eduser = String.valueOf(edituser.getText());
                intent.putExtra("user",eduser);
                edpass = String.valueOf(editpass.getText());
                intent.putExtra("pass",edpass);
                edgender = String.valueOf(radioButton.getText());
                intent.putExtra("gender",edgender);
                edbd = String.valueOf(editbd.getText());
                intent.putExtra("bd",edbd);
                edemail = String.valueOf(editemail.getText());
                intent.putExtra("email",edemail);
                edphone = String.valueOf(editphone.getText());
                intent.putExtra("phone",edphone);
                startActivity(intent);
            }
        });
    }
}
