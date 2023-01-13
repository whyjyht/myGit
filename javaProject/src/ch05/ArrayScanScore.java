package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적처리할 학생수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		int[] st = new int[num];
		for(int i=0; i<st.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			st[i] = sc.nextInt();
			sum += st[i];
		}
		sc.close();
		System.out.println();
		System.out.println("총점은 " + sum + "점 입니다.");
		System.out.println("평균성적은 " + String.format("%.1f", (double)sum/(double)num) + "점 입니다.");
	}
}
