package com.example.config.dataBase;


import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "hikaricp")
public class DataBaseProperties {

    private HikariDataSource test1;

    private HikariDataSource test2;

}