package kr.hs.study.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.model.dto.LoginBean;
@Controller
public class LoginController {
	@Autowired
	SqlSessionTemplate sqlsessiontemplate;
	
	
	@GetMapping("/login")
	public String login() {
		return "login_form";
	}
	
	@PostMapping("/login")
	public String login_re(LoginBean bean,Model model) {
		//model.addAttribute("bean", bean);
		sqlsessiontemplate.insert("test.insert1", bean);
		return "result";
		
	}
	@GetMapping("/delete")
	public String delete(@RequestParam String id) {
		sqlsessiontemplate.delete("test.delete1",id);
		return "result";
	}
	@GetMapping("/list")
	public String list(Model model){
		List<LoginBean> temp=sqlsessiontemplate.selectList("test.list1");
		model.addAttribute("temp", temp);
		return "result3";
		
	}
}






