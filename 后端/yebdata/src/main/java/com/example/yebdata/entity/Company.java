package com.example.yebdata.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

@Data
public class Company extends Model<Company> {

    private String field;

    private Integer count;

    private Integer id;



}

