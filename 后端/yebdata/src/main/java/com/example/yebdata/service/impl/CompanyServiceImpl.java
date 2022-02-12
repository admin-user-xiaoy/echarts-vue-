package com.example.yebdata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yebdata.dao.CompanyDao;
import com.example.yebdata.entity.Company;
import com.example.yebdata.service.CompanyService;
import org.springframework.stereotype.Service;

/**
 * (Company)表服务实现类
 *
 * @author makejava
 * @since 2022-01-25 20:41:22
 */
@Service("companyService")
public class CompanyServiceImpl extends ServiceImpl<CompanyDao, Company> implements CompanyService {

}

