package kr.hs.study.beans;

public class Kia implements Car {

	private String name;
	private String color;
	
	public int money(int money) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void order() {
		// TODO Auto-generated method stub
		System.out.println("주문합니다.");

	}
	public Kia() {
		System.out.println("Kia 기본 생성자");
	}

	public Kia(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
