package com.example.yebdata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yebdata.dao.ChinaDao;
import com.example.yebdata.entity.China;
import com.example.yebdata.service.ChinaService;
import org.springframework.stereotype.Service;

/**
 * (China)表服务实现类
 *
 * @author makejava
 * @since 2022-01-25 19:28:50
 */
@Service("chinaService")
public class ChinaServiceImpl extends ServiceImpl<ChinaDao, China> implements ChinaService {

}

