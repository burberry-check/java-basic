package ch3;

public class OperateEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 30;
		byte c = (byte) (a * b);
		int d = (a * b);		// int 로 형변환
		System.out.println(c + " :: " + Integer.toBinaryString((int)c));	// overflow 발생함
		System.out.println(d + " :: " + Integer.toBinaryString(d));
	}

}
