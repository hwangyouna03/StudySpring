package kr.hs.study.beans;

public class HyunDai implements Car {
	
	private String name;
	private String color;
	private Car car;
	
	public int money(int money) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void order() {
		// TODO Auto-generated method stub
		System.out.println("주문하다");
	}
	public HyunDai() {
		System.out.println("HyunDai 기본 생성자");
	}
	public HyunDai(String name, String color) {
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

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
	
	
}
