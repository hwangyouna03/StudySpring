package kr.hs.study.main;


import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;
import kr.hs.study.beans.Person;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HelloWorldEn hello = new HelloWorldEn();
		Hello hello = new HelloWorldKo();
		hello.sayHello();
		
		Person p = new Person("lee", 25);
		p.setAge(30);
		p.setName("kim");
		
		System.out.println(p.getAge());
		System.out.println(p.getName());
		
	}

}
