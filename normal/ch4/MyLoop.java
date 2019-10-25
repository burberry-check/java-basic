package ch4;

public class MyLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLoop myLoop = new MyLoop();
		
//		myLoop.myFor();
//		myLoop.myWhile();
//		myLoop.myDoWhile();
//		myLoop.myBreakContinue();
		myLoop.myNestedLoopExist();
	}
	
	public void myFor () {
		System.out.println(" === For === ");
		for(int i=2; i<=4; i++) {
			System.out.printf("%10s %d 단 =%n", "=", i);
			for(int j=4; j<=6; j++) {
				System.out.printf("%d X %d = %d,  ", i, j, i*j);
			}
			System.out.println("");
		}
	}
	
	public void myWhile () {
		System.out.println(" === While === ");
		int i = 2;
		while (i <= 4) {
			for(int j=4; j<=6; j++) {
				System.out.printf("%d X %d = %d,  ", i, j, i*j);
			}
			System.out.println("");
			i++;
		}
	}
	
	public void myDoWhile () {
		System.out.println(" === Do While === ");
		int i = 2;
		do {
			for(int j=4; j<=6; j++) {
				System.out.printf("%d X %d = %d,  ", i, j, i*j);
			}
			System.out.println("");
		} while (++i <= 4);
	}
	
	public void myBreakContinue () {
		System.out.println(" === Break, Continue === ");
		int j = 10;
		for (int i = 2; i <=j; i++) {
			if (i == 5) {
				System.out.println("END");
				break;
			} else if ( i == 3) {
				System.out.println("SKIP 3");
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void myNestedLoopExist () {
		System.out.println(" === NestedLoopExist === ");
		firstLoop : for (int i=1; i <= 10; i++) {
			secondLoop : for (int j = 1; j <= i; j++) {
				System.out.print("○");
				if (i == 2) break secondLoop;
				System.out.print("★");
				if (i == 4) continue secondLoop;
				System.out.print("▽");
				if (i == 8) break firstLoop;
				System.out.print("♨");
				if (i == 6) continue firstLoop;
				System.out.print("＠");
			}
			System.out.println();
		}
	}

}
