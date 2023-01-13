package ch03;

import java.util.Scanner;

public class JumSoo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("Java : ");
		int java = sc.nextInt();
		System.out.print("DB : ");
		int db = sc.nextInt();
		System.out.print("HTML : ");
		int html = sc.nextInt();
		System.out.print("JSP : ");
		int jsp = sc.nextInt();
		sc.close();
		
		int tot = java + db + html + jsp;
		double avg = tot / 4.0;
		
		System.out.println("=====================================================");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균\t");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f",name, java, db, html, jsp, tot, avg);
		System.out.println();
		System.out.println("=====================================================");
		
		
		
	}

}
