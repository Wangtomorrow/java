package com.yzw.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.yzw.jdbcUtils.JdbcUtils;



public class Test_1 {
	@Test
	public void tt(){
		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement st =null;
		
		try {
			//获取连接
			conn = JdbcUtils.getConnection();
			//编写sql语句
			String sql = "insert into category values(?,?)";		
			//获取语句执行者
			st=conn.prepareStatement(sql);
			//设置参数
			st.setString(1, "c007");
			st.setString(2,"9595外");
			//执行操作
			int i = st.executeUpdate();
			//处理结果
			if(i==1)
			{
				System.out.println("success!");
			}
			else
			{
				System.out.println("fail");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//释放资源
			JdbcUtils.closeResource(conn, st, rs);
		}
}
}