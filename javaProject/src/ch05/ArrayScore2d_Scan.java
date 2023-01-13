package ch05;

import java.util.Scanner;

public class ArrayScore2d_Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avg;
		int tot = 0;
		
		System.out.print("학생수를 입력하세요 : ");
		int num = sc.nextInt();
		int[][] score = new int[num][3];
		
		System.out.println("국, 영, 수 점수를 각각 입력하세요 : ");
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1 +"번 학생의 점수 : ");
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1+"\t");
			tot = 0;
			for(int j=0; j<score[i].length; j++) {
				tot = tot + score[i][j];
				System.out.print(score[i][j] + "\t");
			}
			avg = tot/(double)score[i].length;
			System.out.print(tot+"\t"+String.format("%.1f", avg)+"\t");
			if(avg>90) {
				System.out.println("A");
			}else if(avg>80) {
				System.out.println("B");
			}else if(avg>70) {
				System.out.println("C");
			}else if(avg>60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
			
		}
		sc.close();
	}
}
