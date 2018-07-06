package com.example.admin.fieldmarshall;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class OrderHistoryActivity extends AppCompatActivity {

    DatabaseReference databaseReference;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);

        databaseReference = FirebaseDatabase.getInstance().getReference("customerinfo");

        recyclerView = (RecyclerView) findViewById(R.id.myrecyleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<OrderList, OrderListViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<OrderList, OrderListViewHolder>(OrderList.class, R.layout.orderlist_layout, OrderListViewHolder.class, databaseReference) {
            @Override
            protected void populateViewHolder(OrderListViewHolder viewHolder, OrderList model, int position) {

                viewHolder.setTitle(model.getCustomerName());
                viewHolder.setId(model.getCustomerId());
                viewHolder.setOrderid(model.getCustomerGenre());

            }
        };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    public static class OrderListViewHolder extends RecyclerView.ViewHolder {
        View mView;

        public OrderListViewHolder(View itemView) {

            super(itemView);
            mView = itemView;

        }

        public void setTitle(String customername) {

            TextView post_title = (TextView) mView.findViewById(R.id.textViewname);
            post_title.setText(customername);
        }

        public void setId(String customerid) {

            TextView post_id = (TextView) mView.findViewById(R.id.textViewid);
            post_id.setText(customerid);
        }

        public void setOrderid(String customergenre) {

            TextView post_order = (TextView) mView.findViewById(R.id.textVieworder);
            post_order.setText(customergenre);
        }
    }
}