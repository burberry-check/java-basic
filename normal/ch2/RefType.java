package ch2;

class MyBookPage {
	private int nowPage;
	MyBookPage(int newPageCnt) {
		this.nowPage = newPageCnt;
	}
	
	public int getPage () {
		return this.nowPage;
	}
	
	public void setPage (int setPageCnt) {
		this.nowPage = setPageCnt;
	}
}

public class RefType {

	public static void main(String[] args) {
		MyBookPage intBookPage1stDay = new MyBookPage(1);
		MyBookPage intBookPage2ndDay = new MyBookPage(10);
		// 1. 10
		System.out.println(intBookPage1stDay.getPage() + " : " + intBookPage2ndDay.getPage() + " : " + intBookPage1stDay.equals(intBookPage2ndDay));
		
		intBookPage1stDay = intBookPage2ndDay;		// 클래스를 대입
		System.out.println(intBookPage1stDay.getPage() + " : " + intBookPage2ndDay.getPage() + " : " + intBookPage1stDay.equals(intBookPage2ndDay));	// 10, 10
		
		intBookPage2ndDay.setPage(30);					// b에 세팅해도
		System.out.println(intBookPage1stDay.getPage() + " : " + intBookPage2ndDay.getPage() + " : " + intBookPage1stDay.equals(intBookPage2ndDay));	// 10, 10
		
		intBookPage1stDay.setPage(50);						// a에 세팅해도 동일
		System.out.println(intBookPage1stDay.getPage() + " : " + intBookPage2ndDay.getPage() + " : " + intBookPage1stDay.equals(intBookPage2ndDay));	// 10, 10

	}

}
