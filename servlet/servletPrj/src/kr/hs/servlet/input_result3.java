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
		out.print("<html><head><title>Ȧ¦�Ǻ�</title></head><body>");
		//�ڹ��ڵ� �ۼ��ؼ� Ȧ���Դϴ�, ¦���Դϴ�. ��½��Ѻ�
		String num = req.getParameter("num");
		int num1 = Integer.parseInt(num);
		if(num1%2 == 0) 
			txt ="even";
		else txt="odd";
		
		req.setAttribute("result", txt); //�ѱ� ���� �ִٸ� setAttribute ���
		RequestDispatcher dispatcher = req.getRequestDispatcher("Result.jsp");
		dispatcher.forward(req, res);
	//controller => txt   txt�� result.jsp�� �Ѱ������
	}
		
}
