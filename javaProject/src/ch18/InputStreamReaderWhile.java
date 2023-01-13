package ch18;

import java.io.InputStreamReader;

public class InputStreamReaderWhile {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.print("내용을 입력하세요 : ");
		try {
			int code = isr.read();
			while(code != 13) {
				System.out.println((char)code+"==>"+code);
				code = isr.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
