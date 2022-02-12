package com.example.yebdata;

import com.example.yebdata.dao.ChinaDao;
import com.example.yebdata.entity.China;
import org.apache.catalina.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
class YebdataApplicationTests {
        @Autowired
    private ChinaDao chinaDao;
        @Test
    public  void testselect(){
            System.out.println("---select method test -----");
            List<China> chinalist = chinaDao.selectList(null);
            for(China china:chinalist){
                System.out.println(china);
            }
        }


}
