package ch16;

public class MyBank {
	public synchronized void hongmoney() {
		for(int i=10; i<=50; i+=10) {
			System.out.println("홍길동님의 통장잔고는 "+i+"만원 입니다.");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	public synchronized void samoney() {
		for(int i=20; i<=60; i+=10) {
			System.out.println("사임당님의 통장잔고는 "+i+"만원 입니다.");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	public synchronized void leemoney() {
		for(int i=30; i<=70; i+=10) {
			System.out.println("이몽룡님의 통장잔고는 "+i+"만원 입니다.");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
