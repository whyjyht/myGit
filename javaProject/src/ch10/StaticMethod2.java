package ch10;

public class StaticMethod2 {
	static int num =10;
	static String name = "홍길동";
	String email = "hong@gmail.com";
	String hp = "010-1234-5678";
	String addr = "서울 강남구 역삼동";
	
	public static void printA() {
		System.out.println("==== printA() ====");
		System.out.println("사번 : " + num);
		System.out.println("이름 : " + name);
		StaticMethod2 s = new StaticMethod2();
		System.out.println("이메일 : " + s.email);
		System.out.println("전화 : " + s.hp);
		System.out.println("주소 : " + s.addr);
	}
	public void printB() {
		System.out.println("==== printB() ====");
		System.out.println("사번 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("전화 : " + hp);
		System.out.println("주소 : " + addr);
	}
	
	public static void main(String[] args) {
		printA();
		StaticMethod2 ss = new StaticMethod2();
		ss.printB();
	}
}
