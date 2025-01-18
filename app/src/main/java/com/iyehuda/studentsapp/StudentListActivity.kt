package com.iyehuda.studentsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentListActivity : AppCompatActivity() {
    private val students = listOf(
        Student("123123123", "John Doe"),
        Student("234234234", "Jane Smith"),
        Student("345345345", "Alice Wonderland"),
        Student("456456456", "Bob Builder"),
        Student("567567567", "Charlie Brown"),
        Student("678678678", "Dora Explorer"),
        Student("789789789", "Eve Adams"),
        Student("890890890", "Frank Sinatra"),
        Student("901901901", "Grace Kelly"),
        Student("012012012", "Henry Ford")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        val adapter = StudentAdapter(students)
        val studentList: RecyclerView = findViewById(R.id.studentList)
        studentList.layoutManager = LinearLayoutManager(this)
        studentList.adapter = adapter
    }
}
