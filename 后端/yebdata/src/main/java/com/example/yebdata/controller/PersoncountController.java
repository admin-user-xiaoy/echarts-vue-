package com.example.yebdata.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.yebdata.entity.Nature;
import com.example.yebdata.entity.Personcount;
import com.example.yebdata.service.PersoncountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("personcount")
public class PersoncountController {

    @Resource
    private PersoncountService personcountService;
    @GetMapping("/personcount/list")
    public List<Personcount> list(){
        return personcountService.list();
    }
}

