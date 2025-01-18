package com.iyehuda.studentsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentListActivity : AppCompatActivity() {
    private val students = listOf(
        Student("123123123", "John Doe", "052-1231231", "Baker 12, Tel Aviv"),
        Student("234234234", "Jane Smith", "052-2342342", "Bialik 23, Haifa"),
        Student("345345345", "Alice Wonderland", "052-3453453", "Carmel 34, Jerusalem"),
        Student("456456456", "Bob Builder", "052-4564564", "Dizengoff 45, Tel Aviv"),
        Student("567567567", "Charlie Brown", "052-5675675", "Einstein 56, Ashdod"),
        Student("678678678", "Dora Explorer", "052-6786786", "Frishman 22, Tel Aviv"),
        Student("789789789", "Eve Adams", "052-7897897", "Gordon 13, Tel Aviv"),
        Student("890890890", "Frank Sinatra", "052-8908908", "Hertzl 1, Ramat Gan"),
        Student("901901901", "Grace Kelly", "052-9019019", "Ibn Gvirol 7, Rosh Haayin"),
        Student("012012012", "Henry Ford", "052-0120120", "Jabotinsky 9, Tel Aviv")
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
