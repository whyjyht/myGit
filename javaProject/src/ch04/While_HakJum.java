package ch04;

import java.util.Scanner;

public class While_HakJum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		String lev = "";
		
		int total;
		double avg;
		
		System.out.println("전체 성적입력이 끝나면 마지막에 -1을 입력하세요.");
		System.out.print("아무정수나 입력하세요 : ");
		int a = sc.nextInt();
		while(a != -1) {
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int mat = sc.nextInt();
			total = kor + eng + mat;
			avg = total / 3.0;
			
			if(avg >= 90.0) {
				lev = "수";
			}else if(avg >= 80.0) {
				lev = "우";
			}else if(avg >= 70.0) {
				lev = "미";
			}else if(avg >= 60.0) {
				lev = "양";
			}else
				lev = "가";
			
			result += kor + "\t" + eng + "\t" + mat + "\t" + total + "\t" + String.format("%.1f", avg) + "\t" + lev + "\n";
			System.out.print("계속하려면 아무정수나 입력하세요 : ");
			a = sc.nextInt();
		}
		System.out.println("===========================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("-------------------------------------------");
		System.out.println(result);
		System.out.println("===========================================");
		
		sc.close();
	}

}
