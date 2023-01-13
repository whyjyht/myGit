package ch07;

public class Person {
	//멤버변수
	private String name;
	private int age;
	private double height;
	private String email;
	private String address;
	
	//setter : set+변수명
	public void setName(String name) { //지역변수
		this.name = name;
	}
	//getter : get+변수명
	public String getName() {
		return name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setAge(int age) {
		if(age < 0 || age > 150) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else {
			this.age = age;
		}
	}
	public int getAge() {
		return age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void print() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 키 : " + height);
	}
	public void print2() {
		System.out.println("이름 : "+name +"\n나이 : "+age+"\n이메일 : "+email+"\n주소 : "+ address+"\n");
	}
}