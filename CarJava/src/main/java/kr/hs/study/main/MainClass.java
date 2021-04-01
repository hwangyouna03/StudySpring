package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Hyundai;
import kr.hs.study.beans.Kia;
import kr.hs.study.config.JavaConfig;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		Hyundai h = ctx.getBean("h1", Hyundai.class);
		System.out.println("h:" + h);
		
		Kia k = ctx.getBean("k1", Kia.class);
		System.out.println("k:" + k);
	}	
}
