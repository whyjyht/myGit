package ch05;

public class ArrayScore2D {
	public static void main(String[] args) {
		//int[][] score = {{100,100,100},{89,76,92},{88,69,72},{45,60,59},{96,92,89}};
		int[][] score;
		score = new int[5][3];
		score[0][0] = 100;
		score[0][1] = 100;
		score[0][2] = 100;
		
		score[1][0] = 89;
		score[1][1] = 76;
		score[1][2] = 92;
				
		score[2][0] = 88;
		score[2][1] = 69;
		score[2][2] = 72;
						
		score[3][0] = 45;
		score[3][1] = 60;
		score[3][2] = 59;
								
		score[4][0] = 96; 
		score[4][1] = 92;
		score[4][2] = 89;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<score.length; i++) {
			int sum = 0; //총점
			float avg = 0.0F; //평균
			System.out.printf("%d\t", i+1); //번호출력
			for(int j=0; j<score[i].length; j++) { //국,영,수 배열값 처리
				sum += score[i][j];
				System.out.printf("%d\t",score[i][j]);
				
			}
			avg = sum/(float)score[i].length;
			
			//출력
			System.out.printf("%d\t%.1f\t", sum, avg);
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
		
	}
}

