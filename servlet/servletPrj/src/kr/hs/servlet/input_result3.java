package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input_result3")
public class input_result3 {
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		String txt;
		PrintWriter out=res.getWriter();
		res.setContentType("utf-8");
		out.print("<html><head><title>홀짝판별</title></head><body>");
		//자바코드 작성해서 홀수입니다, 짝수입니다. 출력시켜봐
		String num = req.getParameter("num");
		int num1 = Integer.parseInt(num);
		if(num1%2 == 0) 
			txt ="even";
		else txt="odd";
		
		req.setAttribute("result", txt); //넘길 값이 있다면 setAttribute 사용
		RequestDispatcher dispatcher = req.getRequestDispatcher("Result.jsp");
		dispatcher.forward(req, res);
	//controller => txt   txt를 result.jsp로 넘겨줘야함
	}
		
}
