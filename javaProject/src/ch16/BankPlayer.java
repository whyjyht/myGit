package ch16;

public class BankPlayer extends Thread {
	private int type;
	private MyBank myBank;
	
	public BankPlayer(int type, MyBank myBank) {
		this.type = type;
		this.myBank = myBank;
	}
	@Override
	public void run() {
		switch(type) {
		case 1: myBank.hongmoney(); break;
		case 2: myBank.samoney(); break;
		case 3: myBank.leemoney(); break;
		}
	}
}
