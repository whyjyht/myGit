package ch03;

public class StringExam {
	public static void main(String[] args) {
		String str  = "Hello " + "java"; //문자열을 연결시킴
		System.out.println(str);
		str = 123 + "C";
		System.out.println(str);
		
		str += "Programmer"; //str = str + "Programmer"
		System.out.println(str);
	}
}
