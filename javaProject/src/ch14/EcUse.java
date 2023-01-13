package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<EC> list = new ArrayList<>();
		list.add(new EC(1234, "2023-01-04", "하이트맥주", "삼성", "37918123468", 55900));
		list.add(new EC(2345, "2022-12-12", "꼬깔콘", "롯데", "35691123445", 23600));
		list.add(new EC(3456, "2023-01-01", "노트북", "현대", "36160123482", 2600000));
		map.put("list", list);
		print(map);
	}
	static void print(Map<String, Object> map) {
		ArrayList<EC> list2 = (ArrayList<EC>)map.get("list");
		System.out.println("------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("------------------------------------------------------------------");
		for(EC c : list2) {
			System.out.println(c.getNo()+"\t"+c.getOrderDate()+"\t"+c.getProduct()+"\t"+c.getCardName()+"\t"+c.getCardNo()+"\t"+String.format("%,d", c.getPay()));
		}
		System.out.println("------------------------------------------------------------------");
	}
}
