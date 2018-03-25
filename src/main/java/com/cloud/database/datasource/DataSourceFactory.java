package com.cloud.database.datasource;

import com.cloud.database.model.DataSourceConfiguration;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class DataSourceFactory {

    public DataSource configAndGetDataSource(DataSourceType dataSourceType , DataSourceConfiguration configuration){
        DataSource dataSource = null;
        switch (dataSourceType){
            case HikariCP:
                dataSource = configureHikariDataSource(configuration);
                break;
            default:
                dataSource = new HikariDataSource();
        }
        return dataSource;
    }


    private HikariDataSource configureHikariDataSource(DataSourceConfiguration configuration){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("");
        config.setUsername("");
        config.setPassword("");
        config.setReadOnly(false);
        config.setConnectionTimeout(0);
        config.setIdleTimeout(0);
        config.setMaxLifetime(0);
        config.setMaximumPoolSize(0);

        HikariDataSource dataSource = new HikariDataSource(config);

        return dataSource;

    }

}
