package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.JavaConfig;

public class MainClass {
	public static void main(String[] args) {
		//xml 설정
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 t1 = ctx1.getBean("obj1", TestBean1.class);
		System.out.println("t1:" + t1);
		ctx1.close();
		
		System.out.println("=======================================");
		//java 설정
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		TestBean1 t2 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t2:" + t2);
		
		TestBean1 t3 = ctx2.getBean("java2", TestBean1.class);
		System.out.println("t3:" + t3);
		
		
		TestBean1 t4 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t4: " + t4);
		TestBean1 t5 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t5: " + t5);
		TestBean1 t6 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t6: " + t6);
		
		System.out.println("===========================");
		TestBean1 t7 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t7: "+ t7);
		TestBean1 t8 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t8: " + t8);
	}
}
