package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//자바코드로 obj1이라는 객체 생성해서 멤버변수 값을 출력해보기
		TestBean1 obj1 = new TestBean1();
		obj1.prData(); //생성자를 통해 값을 주입함
		System.out.println("==============================");
		
		TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
		obj2.prData();
		System.out.println("==============================");
		TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
		obj3.prData();
		System.out.println("==============================");
		TestBean1 obj4 = ctx.getBean("t4", TestBean1.class);
		obj4.prData();
		System.out.println("==============================");
		TestBean1 obj5 = ctx.getBean("t5", TestBean1.class);
		obj5.prData();
		
//		System.out.println("==============================");
//		TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
//		obj6.prData();
		System.out.println("==============================");
		TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
		obj6.prData();
		
		
		
	
	}

}
