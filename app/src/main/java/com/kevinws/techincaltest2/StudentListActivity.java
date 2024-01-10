package com.kevinws.techincaltest2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class StudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sholib", R.drawable.profile, "Jl. Salak"));
        studentList.add(new Student("Baturahman", R.drawable.profile, "Jl. Batu"));
        studentList.add(new Student("Suwito", R.drawable.profile, "Jl. Sakura"));
        studentList.add(new Student("Fitri", R.drawable.profile, "Jl. Kemenangan"));
        studentList.add(new Student("Jessica", R.drawable.profile, "Jl. Raya"));
        studentList.add(new Student("Michael", R.drawable.profile, "Jl. Tol"));
        studentList.add(new Student("Agus", R.drawable.profile, "Jl. Layang"));
        studentList.add(new Student("Marzuki", R.drawable.profile, "Jl. Bagus"));
        studentList.add(new Student("Fanny", R.drawable.profile, "Jl. Berlubang"));
        studentList.add(new Student("Livina", R.drawable.profile, "Jl. Sempit"));

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<Student> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, studentList);
        listView.setAdapter(adapter);
    }
}
