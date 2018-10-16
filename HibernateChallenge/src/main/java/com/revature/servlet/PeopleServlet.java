package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.revature.model.People;
import com.revature.repository.PeopleDao;
import com.revature.util.ConnectionUtil;

@WebServlet("/people")
public class PeopleServlet extends HttpServlet{

	List<People> people;
	PeopleDao dao = new PeopleDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		people = dao.getPeople();
		resp.setContentType("text/xml");
		ObjectMapper om1 = new XmlMapper();
		String obj1 = om1.writeValueAsString(people);
		PrintWriter pw1 = resp.getWriter();
		pw1.print(obj1);
		pw1.close();
		
		resp.setContentType("text/xml");
		ObjectMapper om = new XmlMapper();
		String obj = om.writeValueAsString(dao.getPeopleByName("Shawn"));
		PrintWriter pw = resp.getWriter();
		pw.print(obj);
		pw.close();
	}
	
	/*protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper om = new XmlMapper();
		People postPeople = (People) om.readValue(req.getInputStream(), People.class);
		PrintWriter pw = resp.getWriter();
		pw.print(dao.savePeople(postPeople));
		pw.close();
	}*/	
	
	@Override
	public void destroy() {
		ConnectionUtil.shutdown();
	}
}
