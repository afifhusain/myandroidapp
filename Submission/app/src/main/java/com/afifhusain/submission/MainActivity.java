package com.afifhusain.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.afifhusain.submission.adapter.ListCourseAdapter;
import com.afifhusain.submission.model.Course;
import com.afifhusain.submission.model.CourseData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView course;
    private ArrayList<Course> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        course = findViewById(R.id.course);
        course.setHasFixedSize(true);

        list.addAll(CourseData.getData());
        showRecycleList();
    }

    private void showRecycleList() {
        course.setLayoutManager(new LinearLayoutManager(this));
        ListCourseAdapter listCourseAdapter = new ListCourseAdapter(list);
        course.setAdapter(listCourseAdapter);
    }


}
