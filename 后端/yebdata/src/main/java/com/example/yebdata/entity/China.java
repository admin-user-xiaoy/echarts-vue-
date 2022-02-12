package com.example.yebdata.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class China extends Model<China> {
    @TableId
    private Integer id;

    private String province;

    private Integer count;


}

