package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int a = 3;
		if(a%2== 0) {
			System.out.println("Â¦¼ö");
		}else{
			System.out.println("È¦¼ö");
		}
	}

}
