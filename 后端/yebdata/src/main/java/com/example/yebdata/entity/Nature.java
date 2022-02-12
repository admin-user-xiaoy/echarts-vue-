package com.example.yebdata.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

@Data
public class Nature extends Model<Nature> {

    private String nature;

    private Integer count;

    private Integer id;



}

