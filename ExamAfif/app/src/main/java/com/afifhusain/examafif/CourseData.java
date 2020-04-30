package com.afifhusain.examafif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;


import android.annotation.SuppressLint;
import android.widget.TextView;

public class CourseData extends AppCompatActivity {
    //Deklarasi Variable
    private TextView GetNIM, GetNama, GetJurusan, GetSemester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_data);
        getSupportActionBar().setTitle("Data Mahasiswa");
        GetNIM = findViewById(R.id.coursedesc);
        GetNama = findViewById(R.id.coursedetail);

        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Mahasiswa dari Activity sebelumnya
        String nama = getIntent().getExtras().getString("");

        //Menentukan identitas yang ditampilkan bedasarkan nama yang dipilih
        switch (nama){
            case "Wildan":
                GetNIM.setText("NIM: 17720004");
                GetNama.setText("Nama: Wildam M Athoillah");

                break;

            case "Taufan":
                GetNIM.setText("NIM: 17720005");
                GetNama.setText("Nama: Taufan Artha");
                GetJurusan.setText("Jurusan: Ekonomi");
                GetSemester.setText("Semester: 5");
                break;

            case "Adibil":
                GetNIM.setText("NIM: 17720006");
                GetNama.setText("Nama: Adibil Muchtar");

                break;

            case "Hari":
                GetNIM.setText("NIM: 17720007");
                GetNama.setText("Nama: Hari");

                break;

            case "Adam":
                GetNIM.setText("NIM: 17720008");
                GetNama.setText("Nama: Adam Makmur");

                break;
        }
    }

}
