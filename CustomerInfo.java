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

public class CustomerInfo extends ArrayAdapter<UserId> {

    private Activity context;
    private List<UserId> userIdList;

    public CustomerInfo(Activity context,List<UserId> userIdList){
        super(context,R.layout.customerinfo_layout,userIdList);
        this.context=context;
        this.userIdList=userIdList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listviewitem=inflater.inflate(R.layout.customerinfo_layout,null,true);

        TextView tvname=(TextView)listviewitem.findViewById(R.id.tvcustomerName);
        TextView tvid=(TextView)listviewitem.findViewById(R.id.tvcustomerId);
        TextView tvAddress=(TextView)listviewitem.findViewById(R.id.tvcustomerAddress);
        TextView tvStreet=(TextView)listviewitem.findViewById(R.id.tvcustomerStreet);
        TextView tvdistrict=(TextView)listviewitem.findViewById(R.id.tvcustomerDistrict);
        TextView tvsoftware=(TextView)listviewitem.findViewById(R.id.tvcustomerOrder);
        TextView tvBusiness=(TextView)listviewitem.findViewById(R.id.tvcustomerBusiness);

        UserId userId=userIdList.get(position);

        tvname.setText(userId.getCustomerName());
        tvid.setText(userId.getCustomerId());
        tvAddress.setText(userId.getCustomerAddress());
        tvStreet.setText(userId.getStreetAddress());
        tvdistrict.setText(userId.getDistrictAddress());
        tvsoftware.setText(userId.getCustomerGenre());
        tvBusiness.setText(userId.getCustomerBusiness());

        return listviewitem;



    }
}


