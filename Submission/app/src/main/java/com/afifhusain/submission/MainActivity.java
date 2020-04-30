package com.afifhusain.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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

        TextView detailActivity = findViewById(R.id.dtil);
        TextView aboutActivity = findViewById(R.id.about1);
        de.hdodenhof.circleimageview.CircleImageView aboutActivity2 = findViewById(R.id.about2);
        aboutActivity.setOnClickListener(this);
        aboutActivity2.setOnClickListener(this);
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
        String nama = getIntent().getExtras().getString(CourseData);

        switch (v.getId()) {
            case R.id.dtil:
                Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(moveIntent);
                break;

                case R.id.about1:
                    Intent moveIntent2 = new Intent(MainActivity.this, AboutActivity.class);
                    startActivity(moveIntent2);
                    break;

            case R.id.about2:
                Intent moveIntent3 = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent3);
                break;

            }
    }
}
