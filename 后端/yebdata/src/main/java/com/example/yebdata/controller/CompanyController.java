package com.example.yebdata.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.yebdata.entity.China;
import com.example.yebdata.entity.Company;
import com.example.yebdata.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Company)表控制层
 *
 * @author makejava
 * @since 2022-01-25 20:41:21
 */
@RestController
@RequestMapping("company")
public class CompanyController {

    @Resource
    private CompanyService companyService;
    @GetMapping("/company/list")
    public List<Company> list(){
        return companyService.list();
    }
}

