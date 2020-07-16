package com.admin.service;

import com.admin.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAllStudent();

    List<Student> selectAssiedStudent();

    int addStudent(Student student);

    Student selectStudent(Integer sid);

    int editStudent(Student student);

    int deleteStudent(Integer sid);

    Student selectEvery(Integer sid);

    int addDor(Student student);
}
