package com.supriyalahade.session4assign2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.supriyalahade.session4assign2.R;
import com.supriyalahade.session4assign2.model.Student;

import java.util.ArrayList;

/**
 * Created by BIDWAI on 21-07-2016.
 */
public class StudentAdapter extends BaseAdapter {


    ArrayList<Student> mArrayList;
    LayoutInflater mLayoutInflater;


    public StudentAdapter(Context context,ArrayList<Student> mArrayList){

        this.mArrayList= mArrayList;
        mLayoutInflater = LayoutInflater.from(context);



    }


    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView= mLayoutInflater.inflate(R.layout.item_list,parent,false);

        Student student = (Student)getItem(position);

        TextView name = (TextView)convertView.findViewById(R.id.name);
        TextView phone = (TextView)convertView.findViewById(R.id.phone);

        name.setText(student.getName());
        phone.setText(student.getPhone());




        return convertView;
    }
}
