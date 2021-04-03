package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Hyundai;
import kr.hs.study.beans.Kia;



@Configuration

public class JavaConfig {
	@Bean
	public Hyundai h1() {
		Hyundai h2 = new Hyundai("abante", "black");
		System.out.println(h2.getName());
		System.out.println(h2.getColor());
		h2.order();
		h2.money(3000000);
		return h2;
	}
	@Bean
	public Kia k1() {
		Kia k2 = new Kia("EV6", "gray");
		System.out.println(k2.getName());
		System.out.println(k2.getColor());
		k2.order();
		k2.money(3000000);
		return k2;
	}
}
