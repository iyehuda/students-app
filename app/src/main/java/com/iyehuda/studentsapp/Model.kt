package com.iyehuda.studentsapp

class Model private constructor() {
    companion object {
        private val instance = Model()

        fun getInstance(): Model {
            return instance
        }
    }

    private val students = mutableListOf<Student>()

    fun addStudent(student: Student) {
        students.add(student)
    }

    fun addStudents(students: List<Student>) {
        this.students.addAll(students)
    }

    fun getStudents(): List<Student> {
        return students
    }

    fun getStudentsCount(): Int {
        return students.size
    }

    fun clear() {
        students.clear()
    }
}
