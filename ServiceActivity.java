package com.example.admin.fieldmarshall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import java.text.DateFormat;
import java.util.Calendar;

public class ServiceActivity extends AppCompatActivity {


    private FirebaseAuth firebaseAuth;
    private Button logout;


    private TextView generateorder;
    private TextView previousorder;

    private TextView viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

       Calendar calendar=Calendar.getInstance();
       String CurrentDate= DateFormat.getDateInstance().format(calendar.getTime());
       TextView date=findViewById(R.id.tvdate);
       date.setText(CurrentDate);



        generateorder = (TextView) findViewById(R.id.tvOrder);
        previousorder=(TextView)findViewById(R.id.tvOrderHistory);
        viewpager=(TextView)findViewById(R.id.tvOrdertoday);

        firebaseAuth = FirebaseAuth.getInstance();
        logout = (Button) findViewById(R.id.btLogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(ServiceActivity.this, LoginActivity.class));
            }
        });

        generateorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity((new Intent(ServiceActivity.this, OrderActivity.class)));
            }
        });

        previousorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ServiceActivity.this,OrderHistoryActivity.class));
            }
        });

        viewpager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ServiceActivity.this,Main2Activity.class));

            }
        });


    }

}