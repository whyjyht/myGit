package ch09;

public class Manager extends Employee {
	public void input(int num, String name, String adress, String email, int salary, String rrn) {
		setNum(num);
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.salary = salary;
		setRrn(rrn);
	}
	public void print() {
		System.out.println("===========================");
		System.out.println("사번 : " + getNum());
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + adress);
		System.out.println("이메일 : " + email);
		System.out.println("주민번호 : " + getRrn());
		System.out.println("연봉 : " + salary);
		System.out.println("보너스 : " + (double)(salary * 0.3));
		System.out.println("===========================");
	}
}