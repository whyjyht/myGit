package ch11;

public class StudentUse {
	public static void main(String[] args) {
		SInfo si = new SInfo();
		si.address("홍길동", "서울 강남구", "hong@gmail.com");
		si.point(90, 85, 79);
		si.print();
	}
}
