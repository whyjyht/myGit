package ch05;

public class GetMinMax {
	public static void main(String[] args) {
		int[] arr = {79, 88, 91, 33, 100, 55, 95};
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max + "\n" + "최소값 : " + min);
		
	}
}
