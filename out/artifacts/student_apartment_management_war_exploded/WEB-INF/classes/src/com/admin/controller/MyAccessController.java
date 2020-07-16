package com.admin.controller;

import com.admin.domain.Access;
import com.admin.domain.Result;
import com.admin.service.MyAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyAccessController {

    @Autowired
    MyAccessService myAccessService;

    @RequestMapping("/selAccessRecords")
    public List<Access> selAccessRecords(Access access) {
        List<Access> accesses = myAccessService.selAccessRecords(access);
        return accesses;
    }

    @RequestMapping("/addAccessRecord")
    public Result addAccessRecord(Access access) {
        int i = myAccessService.addAccessRecord(access);
        if (i > 0) {
            return new Result(true, "");

        } else {
            return new Result(false, "");
        }
    }
}
