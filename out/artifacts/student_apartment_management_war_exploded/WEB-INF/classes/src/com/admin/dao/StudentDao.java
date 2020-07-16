package com.admin.dao;

import com.admin.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectAllStudent();

    List<Student> selectAssiedStudent();

    int addStudent(Student student);

    Student selectStudent(Integer sid);

    int editStudent(Student student);

    int deleteDor(Integer sid);

    int deleteStudent(Integer sid);

    Student selectEvery(Integer sid);

    int addDor(Student student);

    int updateDate(Student student);
}
