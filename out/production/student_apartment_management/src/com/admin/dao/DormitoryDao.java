package com.admin.dao;

import com.admin.domain.Dormitory;
import com.admin.domain.Student;

import java.util.List;

public interface DormitoryDao {
    List<Dormitory> searchDao(Dormitory dormitory);

    List<Student> searchEveryDor(Dormitory dormitory1);
}
