package com.example.yebdata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yebdata.dao.PersoncountDao;
import com.example.yebdata.entity.Personcount;
import com.example.yebdata.service.PersoncountService;
import org.springframework.stereotype.Service;

/**
 * (Personcount)表服务实现类
 *
 * @author makejava
 * @since 2022-01-25 20:41:24
 */
@Service("personcountService")
public class PersoncountServiceImpl extends ServiceImpl<PersoncountDao, Personcount> implements PersoncountService {

}

