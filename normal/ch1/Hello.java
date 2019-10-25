package ch1;

public class Hello {
	// main method 의 선언문
	public static void main(String args[]) {
		System.out.println("Hello");
		
		// World 클래스 생성
		World w = new World();
		World.main();		// static 메서드 호출
		w.notMain();		// 메서드 호출
	}
}

class World {
	public static void main() {
		System.out.println("World");
	}
	
	public void notMain() {
		System.out.println("No World");
	}
}