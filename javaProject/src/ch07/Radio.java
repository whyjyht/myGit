package ch07;

public class Radio {
	String name;
	boolean onoff;
	double ch;
	int vol;
	
//	void setRadio(String n, boolean o, double c, int v) {
//		name= n;
//		onoff = o;
//		ch = c;
//		vol = v;
//	}
	
	void setName(String name) {
		this.name = name;
	}
	void setOnoff(boolean onoff) {
		this.onoff = onoff;
	}
	void setCh(double ch) {
		this.ch = ch;
	}
	void setVol(int vol) {
		this.vol = vol;
	}
	void print() {
		System.out.println("[" + name + " 라디오]");
		if(onoff==true) {
			System.out.println("라디오가 켜져있습니다.");
		}else
			System.out.println("라디오가 꺼져있습니다.");
		System.out.println("현재 채널은 " + ch + " 입니다.\n볼륨은 " + vol + " 입니다.\n");
	}
}