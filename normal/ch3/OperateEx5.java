package ch3;

public class OperateEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 4;
		System.out.println(a / b);		// int 소수점 버림.
		
		float c = 4f;
		System.out.println(a / c);		// int + float => float 형변환
		
		int d = 2_147_483_647;
		int f = 1;
		System.out.println(d + f);
		
		int g = -d;
		System.out.println(g + " :: " + Integer.toBinaryString(g));
		
		boolean bb = true;
		Integer cc = null;
		// 좌항이 거짓이면 뒤도 돌아보지 않고 false
		if (!bb && cc > 0) {
			System.out.println("진입된다.");
		} else {
			System.out.println("진입 안된다.");
		}
		
		// 좌항이 참이면 더볼것도 없이 true
		if (bb || cc > 0) {
			System.out.println("진입된다.");
		}
	}

}
