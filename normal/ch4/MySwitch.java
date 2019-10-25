package ch4;

public class MySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random() * 4);
		// System.out.println(num);
		final int ONE = 1;
		final String STR_ONE = "1";
		switch (num) {
//			case 1:			// 1과 ONE 동시 사용 불가. '1'과 ONE 동시 사용불가. 1과 '1' 은 사용 가능. 왜???
			case '1':			// char
			case ONE :		// 정수 상수
//			case STR_ONE : // 문자열 상수 는 사용 불가 (Type mismatch: cannot convert from String to int)
				System.out.println("only 1!!!");
				break;
			case 2 :
				System.out.println("2가 선택되었습니다.");
				break;
			default :
				System.out.println("너는 선택되어졌다. " + Integer.toString(num) + "이");
		}
		
		String[] randomString = {"가위", "바위", "보", "무지개반사"};
		String result = randomString[num];
		
		System.out.println("안내면 술래 가위 바위 보!!!");
		switch (result) {		// 문자열 조건 사용 가능(jdk 1.7부터)
			case "가위":
				System.out.println("가위를 내셨군요");
				break;
			case "바위":
				System.out.println("바위를 내셨군요");
				break;
			case "보":
				System.out.println("보를 내셨군요");
				break;
			default :
				System.out.println("극강 무지개 반사!!!!");
		}
	}

}
