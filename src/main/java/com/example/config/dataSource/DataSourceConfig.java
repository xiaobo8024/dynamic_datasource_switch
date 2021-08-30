package com.example.config.dataSource;


import com.example.config.dataBase.DataBaseProperties;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class DataSourceConfig {

    @Autowired
    private DataBaseProperties dataBaseProperties;


}