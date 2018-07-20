package com.yzw.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.yzw.jdbcUtils.JdbcUtils;

public class C3p0Demo {
	@Test
	
	public void test() throws Exception{
		ComboPooledDataSource ds = new ComboPooledDataSource();
		
		Connection conn = ds.getConnection();
		String sql = "insert into category values(?,?);";
		PreparedStatement st= conn.prepareStatement(sql);
		//设置参数
		st.setString(1, "c124");
		st.setString(2, "解药");
				
		int i = st.executeUpdate();
		System.out.println(i);
		JdbcUtils.closeResource(conn, st, null);
	}
}
