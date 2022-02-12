package com.example.yebdata.controller;


import com.example.yebdata.entity.China;
import com.example.yebdata.service.ChinaService;
import com.example.yebdata.service.impl.ChinaServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * (China)表控制层
 *
 * @author makejava
 * @since 2022-01-25 19:28:47
 */
@RestController
@RequestMapping("china")
public class ChinaController {
        @Resource
        ChinaService chinaService ;
        @GetMapping("/china/list")
        public List<China> list(){
                return chinaService.list();
        }
}

