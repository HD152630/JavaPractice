package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car2
 * 1. 개요 : 자바 실습 과제4-3
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class Car3 {
	
	// field
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3() {
		
	}
	public Car3(String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	public Car3(String company, String model, String color, int maxSpeed) {
		this(company, model, color, 0, 0);
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public Car3(String company, String model, String color) {
		this(company, model, color, 0);
		this.company = company;
		this.model = model;
		this.color = color;
	}
	// method
		// getter
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getPrice() {
		return price;
	}
		// setter
	public void setCompany(String newCompany) {
		company = newCompany;
	}
	public void setModel(String newModel) {
		model = newModel;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public void setMaxSpeed(int newMaxSpeed) {
		maxSpeed = newMaxSpeed;
	}
	public void setPrice(int newPrice) {
		price = newPrice;
	}
}
