package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;
//@Configuration 을 붙이면 bean을 등록하는 설정파일이라는 것을 알 수 있음
@Configuration
public class JavaConfig {
	/*<bean id="obj1 class="kr.hs.study.TestBean1"/>*/
	
	@Bean(name="new", initMethod="init", destroyMethod="destroy")
	@Lazy
	@Scope("prototype")
	public TestBean1 java1() { //리턴타입: 객체
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	@Bean
	public TestBean1 java2() { //리턴타입: 객체
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
}
