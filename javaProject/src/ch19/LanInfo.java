package ch19;

import java.net.NetworkInterface;
import java.util.Enumeration;

public class LanInfo {
	public static void main(String[] args) {
		try {
			//NetworkInterface : 랜카드의 정보제공용 객체
			Enumeration<NetworkInterface> enu=NetworkInterface.getNetworkInterfaces();
			//getNetworkInterfaces() : 네트워크 인터페이스(랜카드)의 다양한 정보 제공
			while(enu.hasMoreElements()) {
				NetworkInterface net=enu.nextElement(); //다음요소진행
				System.out.println(net);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
