package ch14;

import java.util.Scanner;

public class Product {
	private String num;
	private String name;
	private String make;
	private int price;
	private int amount;
	private int money;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("제품번호 : ");
		num = sc.next();
		System.out.print("제품명 : ");
		name = sc.next();
		System.out.print("제조사 : ");
		make = sc.next();
		System.out.print("단가 : ");
		price = sc.nextInt();
		System.out.print("수량 : ");
		amount = sc.nextInt();
		money = (price*amount)+(price*amount/10);
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
