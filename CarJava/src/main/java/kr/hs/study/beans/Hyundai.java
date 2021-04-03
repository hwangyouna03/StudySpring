package kr.hs.study.beans;

public class Hyundai implements Car {

	private String name;
	private String color;
	
	public int money(int money) {
		
		return 0;
	}

	public void order() {
		// TODO Auto-generated method stub
		System.out.println("주문합니다.");
	}
	public Hyundai() {
		System.out.println("Hyundai 기본생성자");
	}

	public Hyundai(String name, String color) {
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
