package com.example.admin.fieldmarshall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button signin, signup,admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signin=(Button)findViewById(R.id.btSignin);
        signup=(Button)findViewById(R.id.btSignup);
        admin=(Button)findViewById(R.id.btAdmin);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup=(new Intent(MainActivity.this,LoginActivity.class));
                startActivity(signup);


            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signin=(new Intent(MainActivity.this,LoginActivity.class));
                startActivity(signin);
            }
        });

         admin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent admin=(new Intent(MainActivity.this,AdminLoginActivity.class));
        startActivity(admin);
    }
});

    }
}
