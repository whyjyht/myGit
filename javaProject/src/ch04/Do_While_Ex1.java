package ch04;

public class Do_While_Ex1 {

	public static void main(String[] args) {
		int i = 1; //초기식
		do { //먼저실행
			System.out.print(i);
			i++;
		}while(i <= 10); //조건식
	}
}
