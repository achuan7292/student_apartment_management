package com.admin.controller;

import com.admin.domain.Dormitory;
import com.admin.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DormitoryController {
    @Autowired
    DormitoryService dormitoryService;

    @RequestMapping("/search_dor")
    public List<Dormitory> searchDor(Dormitory dormitory) {

        return dormitoryService.searchDor(dormitory);
    }

}
