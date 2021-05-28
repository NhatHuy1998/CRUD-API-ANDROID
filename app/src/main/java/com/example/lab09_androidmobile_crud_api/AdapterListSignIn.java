package com.example.lab09_androidmobile_crud_api;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterListSignIn extends BaseAdapter {

    private int layout;
    private Context context;
    private ArrayList<Employees> arrayList;

    public AdapterListSignIn(int layout, Context context, ArrayList<Employees> arrayList) {
        this.layout = layout;
        this.context = context;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
       return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.list_item_sign_in,null);

        Employees employees = arrayList.get(position);

        TextView tvEmail = convertView.findViewById(R.id.tvEmail);
        TextView tvPassword = convertView.findViewById(R.id.tvPassword);

        tvEmail.setText("Email: "+employees.getEmail()+"");
        tvPassword.setText("Password: "+employees.getPassword());

        return convertView;

    }
}
