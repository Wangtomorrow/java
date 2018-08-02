package base.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import base.dao.LoginDao;
import base.po.Teller;
/**
 * 柜员登陆后台处理
 * 2018.7.6
 * 段本庆
 *
 */
public class LoginServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			Teller te = new Teller();
			te.setOp(request.getParameter("op"));
			te.setPassword(request.getParameter("password"));
			
			LoginDao ld = new LoginDao();
			if(ld.doLogin(te)){
				HttpSession session = request.getSession();
				session.setAttribute("op", te.getOp());
				response.sendRedirect("index.jsp");
			}else{
				response.sendRedirect("Login.jsp");
			}
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	}

}
