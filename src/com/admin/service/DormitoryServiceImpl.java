package com.admin.service;

import com.admin.dao.DormitoryDao;
import com.admin.domain.Dormitory;
import com.admin.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DormitoryServiceImpl implements DormitoryService {

    @Autowired
    DormitoryDao dormitoryDao;

    @Override
    public List<Dormitory> searchDor(Dormitory dormitory) {
//        搜索到的所有宿舍
        List<Dormitory> dormitories = dormitoryDao.searchDao(dormitory);
        List<Student> students = dormitoryDao.searchEveryDor(dormitory);

        for (Dormitory dormitory1 : dormitories) {
//            搜索每个宿舍，找到其中的所有宿舍成员
            List<Student> eveStudents = new ArrayList<>();
            for (Student student : students) {
                if (student.getHostelNo() == dormitory1.getHostelNo()) {
                    eveStudents.add(student);
                    if (eveStudents.size() >= 4) {
                        continue;
                    }
                }

            }
            dormitory1.setStudents(eveStudents);

        }
        return dormitories;
    }
}
