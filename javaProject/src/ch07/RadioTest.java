package ch07;

public class RadioTest {
	public static void main(String[] args) {
		Radio b = new Radio();
//		b.setRadio("브리츠", true, 89.1, 12);	
		
//		b.name = "브리츠";
//		b.onoff = true;
//		b.ch = 89.1;
//		b.vol = 12;
		
		b.setName("브리츠");
		b.setOnoff(true);
		b.setCh(89.1);
		b.setVol(12);
		
		Radio i = new Radio();
//		i.setRadio("아이리버", false, 95.1, 9);
		
//		i.name = "아이리버";
//		i.onoff = false;
//		i.ch = 95.1;
//		i.vol = 9;
		
		i.setName("아이리버");
		i.setOnoff(false);
		i.setCh(95.1);
		i.setVol(9);
		
		b.print();
		i.print();
	}
}