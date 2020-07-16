package com.admin.service;

import com.admin.dao.StudentDao;
import com.admin.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> selectAllStudent() {
        return studentDao.selectAllStudent();
    }

    @Override
    public List<Student> selectAssiedStudent() {
        return studentDao.selectAssiedStudent();
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public Student selectStudent(Integer sid) {
        return studentDao.selectStudent(sid);
    }

    @Override
    public int editStudent(Student student) {
        return studentDao.editStudent(student);
    }

    @Override
    public int deleteStudent(Integer sid) {
        int i = studentDao.deleteStudent(sid);
        int j = studentDao.deleteDor(sid);
        return i + j;
    }

    @Override
    public Student selectEvery(Integer sid) {
        return studentDao.selectEvery(sid);
    }

    @Override
    public int addDor(Student student) {
        int a = studentDao.updateDate(student);
        if (a > 0) {
            return studentDao.addDor(student);
        } else {
            return 0;
        }
    }
}
