package com.example.reporteriabusqueda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@SpringBootApplication
public class ReporteriaBusquedaApplication  {


    public static void main(String[] args) {
        SpringApplication.run(ReporteriaBusquedaApplication.class, args);
    }


}
