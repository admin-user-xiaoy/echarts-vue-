package com.example.yebdata.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.yebdata.entity.Company;
import com.example.yebdata.entity.Nature;
import com.example.yebdata.service.NatureService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("nature")
public class NatureController  {

    @Resource
    private NatureService natureService;
    @GetMapping("nature/list")
    public List<Nature> list(){
        return natureService.list();
    }

}

