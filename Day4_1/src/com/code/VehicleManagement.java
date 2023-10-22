package com.code;

public class VehicleManagement {
	
	private int id;
	private String name,color;
	private double price;
	static double discount;
	
	static
	{
		System.out.println("Static block");
		discount=1000;
	}
	
	public VehicleManagement(int id,String name,String color,double price)
	{
		this.id=id;
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	public String toString()
	{
		return id+" "+name+" "+color+" "+price+" "+discount;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void showDiscount()
	{
		System.out.println("Bonus :"+discount);
	}
	
}
