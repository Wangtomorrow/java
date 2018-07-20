package com.yzw.dbutils;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import com.yzw.jdbcUtils.DataSourceUtils;

public class CURDDemo {
	@Test
	public void insert() throws SQLException{
		//创建queryrunner
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		
		//编写sql
		String sql = "insert into category values(?,?)";
		
		//执行sql
		qr.update(sql, "c222","电器");
	}
}
