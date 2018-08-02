package base.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import base.dao.UnitDao;
import base.po.UnitBasicInformation;
/**
 * 单位信息操作
 * 2018.7.6
 * 段本庆
 */
public class SelectUnitServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			UnitBasicInformation ubi = new UnitBasicInformation();
			ubi.setUnitaccnum(request.getParameter("unitaccnum"));
			
			UnitDao ud = new UnitDao();
			ubi = ud.getUnitAccNum(ubi);
			if(ubi.getUnitaccnum()!=null){
				HttpSession session = request.getSession();
				session.setAttribute("unitaccname",ubi.getUnitaccname());
				response.sendRedirect("company.jsp");
			}else{
				System.out.println("公积金账号不存在");
			}
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	}

}
