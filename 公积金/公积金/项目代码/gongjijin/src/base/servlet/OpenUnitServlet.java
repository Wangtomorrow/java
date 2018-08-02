package base.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import base.dao.OpenUnitDao;
import base.po.UnitBasicInformation;
/**
 * 用于单位开户业务
 * 2018.7.10
 * 段本庆
 */
public class OpenUnitServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			UnitBasicInformation ubi = new UnitBasicInformation();
			
			ubi.setUnitaccnum(request.getParameter("unitaccnum"));
			ubi.setUnitaddr(request.getParameter("unitaddr"));
			ubi.setOrgcode(request.getParameter("orgcode"));
			ubi.setUnitchar(request.getParameter("unitchar"));
			ubi.setUnitkind(request.getParameter("unitkind"));
			ubi.setSalarydate(request.getParameter("salarydate"));
			ubi.setUnitphone(request.getParameter("unitphone"));
			ubi.setUnitlinkman(request.getParameter("unitlinkman"));
			ubi.setUnitagentpapno(request.getParameter("unitagentpapno"));
			ubi.setUnitprop(Double.parseDouble(request.getParameter("unitprop")));
			ubi.setRemark(request.getParameter("remark"));
			
			OpenUnitDao oud = new OpenUnitDao();
			
			if(oud.openUnit(ubi)){
				response.sendRedirect("index.jsp");
			}else{
				response.sendRedirect("OpenAccount.jsp");
			}
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
