package com.supriyalahade.session4assign2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.supriyalahade.session4assign2.adapter.StudentAdapter;
import com.supriyalahade.session4assign2.model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    ArrayList<Student> mArrayList;

    StudentAdapter mStudentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView)findViewById(R.id.listView);

        mArrayList= new ArrayList<>();

        mArrayList.add(new Student("ABC","12345"));
        mArrayList.add(new Student("XYZ","11111"));
        mArrayList.add(new Student("IJK","54321"));

        mStudentAdapter=new StudentAdapter(this,mArrayList);
        mListView.setAdapter(mStudentAdapter);






    }
}
