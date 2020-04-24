package com.afifhusain.submission.model;

import com.afifhusain.submission.R;

import java.util.ArrayList;

public class CourseData {

    private static String[] CourseName = {
        "Basic Programming",
        "Algorithm and Data Structure",
        "Web Programming",
        "Object Oriented Programming",
        "Microcontroller",
        "Machine Learning"
    };

    private static String[] CourseDetail = {
        "Basic syntax and procedure code writing for fundamentals programming skills.",
        "How to make planning, program worked, features and structure program before you develop our programs.",
        "Live code Web Programming with technology .etc : HTML, CSS, SQL, PHP and Javascript.",
        "OOP is important section programming langguange sriting structure for big team and software developer",
        "Its about digital, IC, compiling your program and upload your code to IC. Let's code and controll some module",
        "Learn about how to machine work and we will make phyton programming language for this course"
    };

    private static int[] CourseImage = {
            R.drawable.basic,
            R.drawable.algorithm,
            R.drawable.web,
            R.drawable.object,
            R.drawable.micro,
            R.drawable.machine,

    };

    public static ArrayList<Course> getData() {
        ArrayList<Course> list = new ArrayList<>();
        for (int coordinat = 0; coordinat < CourseName.length; coordinat++ ) {
            Course course = new Course();
            course.setTitle(CourseName[coordinat]);
            course.setDesc(CourseDetail[coordinat]);
            course.setImage(CourseImage[coordinat]);
            list.add(course);
        }
        return list;
    }

}
