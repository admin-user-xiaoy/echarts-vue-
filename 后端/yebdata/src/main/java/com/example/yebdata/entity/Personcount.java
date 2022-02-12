package com.example.yebdata.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

@Data
public class Personcount extends Model<Personcount> {

    private String gear;

    private Integer count;

    private Integer id;



}

