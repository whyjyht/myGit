package ch05;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] mat = new int[2];
		int[] tot = new int[2];
		double[] avg = new double[2];
		double all_avg = 0.0;
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		for(int i=0; i<2; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();
			System.out.print("국어점수 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어점수 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학점수 : ");
			mat[i] = sc.nextInt();
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i]/3.0;
			all_avg += avg[i];
			
		}
		sc.close();
		for(int i=0; i<2; i++) {
			System.out.println("이름 : "+name[i]+"\n"+"국어 : "+kor[i]+"\n"+"영어 : "+eng[i]+"\n"+"수학 : "+mat[i]+"\n"+"총점 : "+tot[i]+"\n"+String.format("평균 : %.1f", avg[i]));
			System.out.println();
		}
		System.out.println("========================");
		System.out.printf("학급평균 : %.1f",all_avg/2.0);
		
	}

}
