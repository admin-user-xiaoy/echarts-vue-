package com.example.yebdata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yebdata.dao.NatureDao;
import com.example.yebdata.entity.Nature;
import com.example.yebdata.service.NatureService;
import org.springframework.stereotype.Service;

/**
 * (Nature)表服务实现类
 *
 * @author makejava
 * @since 2022-01-25 20:41:23
 */
@Service("natureService")
public class NatureServiceImpl extends ServiceImpl<NatureDao, Nature> implements NatureService {

}

