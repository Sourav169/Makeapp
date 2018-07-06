package com.example.admin.fieldmarshall;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.admin.Name;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoofTabs;
    public PagerAdapter(FragmentManager fm,int NumberofTabs) {

        super(fm);
        this.mNoofTabs=NumberofTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                Name name=new Name();
                return name;
            case 1:
                Software software=new Software();
                return software;
            case 2:
                Business business=new Business();
                return business;
               default:
                return null;
    }}

    @Override
    public int getCount() {
        return 0;
    }
}
