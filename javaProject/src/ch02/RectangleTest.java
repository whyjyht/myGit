package ch02;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===============================");
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		int g = sc.nextInt();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		int s = sc.nextInt();
		double n = g * s;
		System.out.println("직사각형의 넓이는 " + n + " 입니다.");
		System.out.println("===============================");
		
		sc.close();
	}
	
}