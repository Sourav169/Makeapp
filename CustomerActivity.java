package com.example.admin.fieldmarshall;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CustomerActivity extends AppCompatActivity {
    DatabaseReference databaseReference;
    ListView listViewcustomer;
    List<UserId> userIdList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        databaseReference = FirebaseDatabase.getInstance().getReference("customerinfo");

        listViewcustomer = (ListView) findViewById(R.id.Listview_Customer);
        userIdList = new ArrayList<>();
    }
        @Override
        protected void onStart() {
            super.onStart();
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    userIdList.clear();
                    for(DataSnapshot orderSnapshot : dataSnapshot.getChildren()){

                        UserId userId=orderSnapshot.getValue(UserId.class);
                        userIdList.add(userId);

                    }
                    CustomerInfo adapter=new CustomerInfo(CustomerActivity.this,userIdList);
                    listViewcustomer.setAdapter(adapter);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });


        }
    }


