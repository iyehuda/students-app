package com.iyehuda.studentsapp

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EditStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_student)

        intent.getStringExtra("studentId")?.let { studentId ->
            loadStudentDetails(studentId)
        } ?: run {
            loadStudentDetails("901901901")
        }
    }

    private fun loadStudentDetails(studentId: String) {
        Model.getInstance().getStudentById(studentId)?.let {
            findViewById<TextView>(R.id.name_input).text = it.name
            findViewById<TextView>(R.id.id_input).text = it.id
            findViewById<TextView>(R.id.phone_input).text = it.phone
            findViewById<TextView>(R.id.address_input).text = it.address
            findViewById<CheckBox>(R.id.check_input).isChecked = it.checked
        }
    }
}
