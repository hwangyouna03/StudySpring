package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HyunDai;
import kr.hs.study.beans.Kia;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		HyunDai c1 = ctx.getBean("c1", HyunDai.class);
		System.out.println("c1: " + c1);
		System.out.println(c1.getName());
		System.out.println(c1.getColor());
		System.out.println("=========================");
		Kia c2 = ctx.getBean("c2",Kia.class);
		System.out.println("c2: " + c2);
		System.out.println(c2.getName());
		System.out.println(c2.getColor());
		
	}

}
