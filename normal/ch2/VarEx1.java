/**
 * 변수 관련 내용 정리
 */
package ch2;

import java.util.Date;

public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean
        boolean isTest = true;
        System.out.printf("불린형 = %b%n", isTest);

        // Integer
        int intTest = 10, intTest2 = 0b11111;      // 2진수
        System.out.printf("정수 = %d, 2진수 = %d %n", intTest, intTest2);

        // jdk1.7 추가. 없어도 그만
        long lnTest = 10_000_000_000L;  
        System.out.println(lnTest);

        // long
        lnTest = 10000000000L;
        System.out.println(lnTest);

        // float
        float fTest = 3.14f;
        System.out.println(fTest);

        // char
        char chTest = 'a';
        String strTest = "aaaaa";
        System.out.printf("캐릭터 = %c, 문자열 = %s%n", chTest, strTest);

        // 요건 참조형
        Date dtToday = new Date();
        // 포맷 출력. 
        System.out.format("%tY년 %tm월 %td일 (\'%ty년)%n", dtToday, dtToday, dtToday, dtToday);
        System.out.printf("%tY년 %tm월 %td일 (\'%ty년)%n", dtToday, dtToday, dtToday, dtToday);
        
        // float의 정밀도
        double da = 1.1111111;		// 
        float fa = (float)da;				// 6자리 까지만 저장 1.111111
        double db = (double)(fa);	// 다시 더블로 돌리면 흐므흐므 1.111111044883728
        
        System.out.println("원래 : " + da);
        System.out.println("fa : " + fa);
        System.out.println("db : " + db);
        
        // overflow 
        // 4byte 15 + 1 => 1111 + 0001 => 0001 0000 => 0000
        byte bMin = -128;
        byte bMax = 127;
        System.out.printf("bMin = %d, bMax = %d%n", bMin, bMax);
        System.out.println("bMin binary = " + Integer.toBinaryString((int)bMin));
        System.out.println("bMax binary = " + Integer.toBinaryString((int)bMax));
        System.out.println("bMin - 1 = " + (byte)(bMin-1));
        System.out.println("bMax + 1 = " + (byte)(bMax+1));
        
        // 2진 보수
        int a = 40;
        int b = a*-1;
        System.out.printf("40 을 이진수로 %s", Integer.toBinaryString(a));
        System.out.printf("40 을 이진수로 %s", Integer.toBinaryString(b));
	}

}
