package kr.hs.study.beans;

public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자");
	}
	public void init() {
		System.out.println("init Method");
	}
	public void destroy() {
		System.out.println("destroy method");
	}
}
