package com.example.admin.fieldmarshall;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class OrderList{
  private   String customerId;
  private   String customerName;
  private   String customerGenre;
    public OrderList(){

    }
    public OrderList(String customerId, String customerName, String customerGenre) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerGenre = customerGenre;
    }

        public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGenre() {
        return customerGenre;
    }

    public void setCustomerGenre(String customerGenre) {
        this.customerGenre = customerGenre;
    }


    }




