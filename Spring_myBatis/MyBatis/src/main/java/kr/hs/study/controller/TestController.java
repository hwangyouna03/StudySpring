package kr.hs.study.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.dto.LoginDTO;

@Controller
public class TestController {
	
	@Autowired
	SqlSessionTemplate sqlsessiontemplate;
	//IOC container에서 SqlSessionTemplate 이 있는지 찾어
	//있으면, SqlSessionTemplate의 주소를 sqlsessiontemplate에 넣는다
	
	@GetMapping("/login")
	public String login() {
		return "login_form";
	}
	@PostMapping("/login_re")
	public String login_re(LoginDTO dto) {
		sqlsessiontemplate.insert("login.insert",  dto);
		                         //namespace.id값(니네맘대로)
		return "result";
	}

}
