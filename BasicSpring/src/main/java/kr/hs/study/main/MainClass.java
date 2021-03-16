package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		//컨테이너의 설정파일을 읽어온다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//설정파일을 읽어서 객체 생성해서 IOC 컨테이너에 보관
		
		//컨테이너 -> 생성한 객체중에 TestBean.class타입의 객체를 가지고와서 t1에 넣어라
//		Test t1 = ctx.getBean(TestBean.class);
//		t1.method1();
		
		//getbean 리턴 타입이 object이기 때문에 다운 캐스팅해줘야함
//		Test t1=(Test) ctx.getBean("t1");
//		t1.method1();
		
//		Test t1 = ctx.getBean("t1", TestBean.class);
//		t1.method1();
//		System.out.println("t1:" + t1);
		
		//t1 객체를 가지고 와서 t2에 넣어 t2 주소값 찍어보기
//		Test t2 = ctx.getBean("t1", TestBean.class);
//		t2.method1();
//		System.out.println("t2:" + t2);
		
		Test t2=ctx.getBean("t2", TestBean2.class);//config.xml에서 lazy-init을 쓸 경우 나오지 않는다
		//이 문장을 써야 그때 객체가 생성된다.
		
		
		ctx.close();
	}

}
