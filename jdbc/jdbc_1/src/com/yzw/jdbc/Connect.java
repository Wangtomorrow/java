package com.yzw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

public class Connect {
	@Test
	public void jdbc_connect() throws Exception{
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取链接
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wzy","root","000000");
		//编写sql
		String sql="select * from category";
		//创建语句执行者
		PreparedStatement st=conn.prepareStatement(sql);
		//设置参数
		//执行sql语句
		ResultSet rs = st.executeQuery();
		//处理结果
		while(rs.next()){
			System.out.println(rs.getString("cid")+"::"+rs.getString("cname"));
		}
		//释放资源  先打开的后关闭
		rs.close();
		st.close();
		conn.close();
	}
}
