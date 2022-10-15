package com.xsolo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class XsoloApplication {

    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext run = SpringApplication.run(XsoloApplication.class, args);
        DataSource dataSource = run.getBean(DataSource.class);
        System.out.println(dataSource);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}
