package com.iyehuda.studentsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(private val students: List<Student>) : RecyclerView.Adapter<StudentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.bind(students[position])
    }

    override fun getItemCount(): Int {
        return students.size
    }
}

class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val name: TextView = itemView.findViewById(R.id.studentName)
    private val id: TextView = itemView.findViewById(R.id.studentId)
    private val checkBox: CheckBox = itemView.findViewById(R.id.studentCheck)

    fun bind(student: Student) {
        name.text = student.name
        id.text = student.id
        checkBox.isChecked = student.checked

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            student.checked = isChecked
        }
    }
}
