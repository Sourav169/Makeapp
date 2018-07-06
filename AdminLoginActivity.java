package com.example.admin.fieldmarshall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLoginActivity extends AppCompatActivity {
     EditText Nameadmin;
     EditText Passwordadmin;
     Button Loginadmin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        Nameadmin = (EditText) findViewById(R.id.etNameid);
        Passwordadmin = (EditText) findViewById(R.id.etuserPasswordid);
        Loginadmin = (Button) findViewById(R.id.btloginid);

        Loginadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Nameadmin.getText().toString(),Passwordadmin.getText().toString());
            }
        });

    }

    private void validate(String adminName,String adminPassword){
        if ((adminName.equals("admin")     )&&(adminPassword.equals("12345"))){
            Intent intent=new Intent(AdminLoginActivity.this,CustomerActivity.class);
            startActivity(intent);
            Toast.makeText(this,"login successfull",Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this,"login failed",Toast.LENGTH_LONG).show();
        }
    }

}
