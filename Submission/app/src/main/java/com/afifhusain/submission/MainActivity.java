package com.afifhusain.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.afifhusain.submission.adapter.ListCourseAdapter;
import com.afifhusain.submission.model.Course;
import com.afifhusain.submission.model.CourseData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView course;
    private ArrayList<Course> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        course = findViewById(R.id.course);
        course.setHasFixedSize(true);

        RecyclerView detailActivity = findViewById(R.id.course);
        detailActivity.setOnClickListener(this);


        list.addAll(CourseData.getData());
        showRecycleList();
    }

    private void showRecycleList() {
        course.setLayoutManager(new LinearLayoutManager(this));
        ListCourseAdapter listCourseAdapter = new ListCourseAdapter(list);
        course.setAdapter(listCourseAdapter);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.course:
                break;
        }
    }
}
