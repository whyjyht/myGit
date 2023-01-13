package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		System.out.println("제품정보를 입력하세요.");
		while(true) {
			Product p = new Product();
			p.input();
			list.add(p);
			System.out.print("계속 하려면 아무 값이나, 마치려면 0을 입력하세요 : ");
			if(sc.next().equals("0")) {
				System.out.println("제품정보 입력을 마칩니다.");
				break;
			}
		}
		sc.close();
		System.out.println("================================================");
		System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(천원)");
		System.out.println("------------------------------------------------");
		for(Product p : list) {
			System.out.println(p.getNum()+"\t"+p.getName()+"\t"+p.getMake()+"\t"+String.format("%,d", p.getPrice())+"\t"+p.getAmount()+"\t"+String.format("%,d", p.getMoney()));
		}
		System.out.println("================================================");
	}
}
