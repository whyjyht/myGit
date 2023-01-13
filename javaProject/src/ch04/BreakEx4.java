package ch04;

public class BreakEx4 {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("------------------------");
		while(true) {
			System.out.println(i + " Hello World");
			i++;
			if(i == 8) {
				System.out.println("n값이 8이며 while문 빠져나옴");
				System.out.println("------------------------");
				break;
			}
		}
	}
}
