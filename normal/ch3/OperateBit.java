package ch3;

public class OperateBit {

	// https://tech.kakao.com/2017/09/27/kakao-blind-recruitment-round-1/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperateBit ob = new OperateBit();
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		ob.printMap(n, arr1, arr2);
		
		int n2 = 6;
		int[] arr3 = {46, 33, 33 ,22, 31, 50};
		int[] arr4 = {27 ,56, 19, 14, 14, 10};
		ob.printMap(n2, arr3, arr4);
	}
	
	public void printMap(int n, int[] arr1, int[] arr2) {
		String data;
		System.out.printf("%d X %d => %n", n, n);
		for(int i = 0; i < n; i++) {
			data = Integer.toBinaryString(arr1[i] | arr2[i]);
			data = data.replaceAll("0", "X");
			data = data.replaceAll("1", "#");
			System.out.println(data);
			data = "";
		}
		
	}

}
