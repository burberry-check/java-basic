package ch5;

import java.util.ArrayList;

public class MyStrArray {
	public static void main(String[] args) {
		MyStrArray myStrArray = new MyStrArray();
		
		myStrArray.stringObjectTest();
		myStrArray.getCharFromString();
		myStrArray.equalStr();
		myStrArray.cutAndJoin();
	}
	
	public void stringObjectTest() {
		// 빈 문자열 체크
		String isEmptyStr = "";
		String isEmptyStrInstance = new String();
		String isEmptyStrInstance2 = new String("");
		String isEmptyStr2 = null;
		
		try {
			System.out.println(isEmptyStr.isEmpty());
			System.out.println(isEmptyStrInstance.isEmpty());
			System.out.println(isEmptyStrInstance2.isEmpty());
			System.out.println(isEmptyStr2.isEmpty());	// nullpoint
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void getCharFromString() {
		// 문자열을 char 배열로 복사
		String myStr = "가나다라마바사";
		char [] ch = {'a','b','c','d','f'};
		
		// 시작 인덱스, 끝 인덱스, 복사 받을 char 배열 이름, 복사 시작 위치
		myStr.getChars(0, 3, ch, 1); 

		System.out.println(ch.length);
		System.out.println(ch);
	}
	
	public void equalStr() {
		// 문자열 비교
		String str1 = "ABC";
		String str2 = "aDc";
		String str3 = "ABC";
		
		System.out.println(str1.equals(str1));		// true
		System.out.println(str1.equalsIgnoreCase(str1));		// true
		System.out.println(str1 == str3);			// false
	}
	
	public void cutAndJoin() {
		String strOrg = "이것을 요리 조리 잘라보아요";
		ArrayList<String> alStr = new ArrayList<String>();
		
		alStr.add(strOrg.substring(0, 3));
		alStr.add(strOrg.substring(3, 6));
		alStr.add(strOrg.substring(6));
//		alStr.add(1);  // 컴파일 오류
		
		System.out.println(alStr);
		alStr.sort(null);
		String strNew = "";
		for(String s : alStr) {
			strNew = strNew.concat(s);
		}
		System.out.println(strNew);
	}
}
