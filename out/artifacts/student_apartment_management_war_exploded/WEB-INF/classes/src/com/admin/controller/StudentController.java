package com.admin.controller;

import com.admin.domain.Result;
import com.admin.domain.SmartTable;
import com.admin.domain.Student;
import com.admin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/all_student", method = RequestMethod.GET)
    public SmartTable selectAllStudent() {
//        User user = (User)session.getAttribute("user");
//        if(user!=null){
//        @RequestParam(value = "page",required = false) String page;
//        @RequestParam(value = "limit",required = false) String limit;
//        System.out.println(page);
//        System.out.println(limit);
        SmartTable st = new SmartTable();
        List<Student> data = studentService.selectAllStudent();
        st.setCode(0);
        st.setMsg("ms");
        st.setCount(data.size());
        st.setStudents(data);
        return st;
//        }else {
//            return null;
//        }
    }

    @RequestMapping(value = "/assied_student", method = RequestMethod.GET)
    public SmartTable assiedStudent() {
        SmartTable st = new SmartTable();
        List<Student> data = studentService.selectAssiedStudent();
        st.setCode(0);
        st.setMsg("ms");
        st.setCount(data.size());
        st.setStudents(data);
        return st;
    }

    @RequestMapping(value = "/add_student")
    public Result addStudent(Student student) {
        int i = studentService.addStudent(student);
        if (i > 0) {
            return new Result(true, "");
        } else {
            return new Result(false, "");
        }

    }

    @RequestMapping(value = "/selectStudent")
    public Student selectStudent(Integer sid) {
        return studentService.selectStudent(sid);
    }

    @RequestMapping(value = "/selectEvery")
    public Student selectEvery(Integer sid) {
        return studentService.selectEvery(sid);
    }

    @RequestMapping(value = "/editStudent")
    public Result editStudent(Student student) {
        int i = studentService.editStudent(student);
        if (i > 0) {
            return new Result(true, "");
        } else {
            return new Result(false, "");
        }
    }

    @RequestMapping(value = "/deleteStudent")
    public Result deleteStudent(Integer sid) {
        int i = studentService.deleteStudent(sid);
        if (i > 0) {
            return new Result(true, "");
        } else {
            return new Result(false, "");
        }
    }

    @RequestMapping(value = "/addDor")
    public Result addDor(Student student) {
        int i = studentService.addDor(student);
        if (i > 0) {
            return new Result(true, "");
        } else {
            return new Result(false, "");
        }
    }


}