package com.iyehuda.studentsapp

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StudentDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_details)

        intent.getStringExtra("studentId")?.let { studentId ->
            loadStudentDetails(studentId)
        }
    }

    private fun loadStudentDetails(studentId: String) {
        Model.getInstance().getStudentById(studentId)?.let {
            findViewById<TextView>(R.id.name_text).text = it.name
            findViewById<TextView>(R.id.id_text).text = it.id
            findViewById<TextView>(R.id.phone_text).text = it.phone
            findViewById<TextView>(R.id.address_text).text = it.address
            findViewById<CheckBox>(R.id.check).isChecked = it.checked
        }
    }
}
