package pkg03_one_practice;

public class MainClass {
	public static void method1() {
		// 월에 따른 계절 출력하기
		int month = 6;
		String[] seasons = new String[] {"겨울", "봄", "여름", "가을"};
		
		// 코드 한 줄만 추가할 것
		int n = (month % 12 / 3) ;
		System.out.println(seasons[n]);
	}
	
	public static void method2() {
		// 4일은 목요일, nDay일 후는 무슨 요일?
		
		int day = 4;
		int nDay = 13;
		String[] weekNames = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		
		// day의 nDay일 후
		day += nDay;
		
		// 코드 한 줄만 추가할 것
		int n = (day % 7);
		System.out.println(weekNames[n]);
	}
	
	public static void method3() {

		char[] letters = new char[26];
		char ch = 'A';
		for (int i = 0; i < letters.length; i++) {
			letters[i] = ch;
		}
		for(int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
	}
	
	public static void method4() {
		// 배열 a의 마지막 3개 요소를 배열 b의 값으로 수정하기 
		int [] a = new int [] {10, 20, 30, 0, 0, 0};
		int [] b = new int [] {40, 50, 60};
		
		for (int i = 0; i < b.length; i++) {
			a[3 + i] = b[i]; 
		}
		/*
		 * 배열 복사를 위한 자바 표준 API
		 * System.arraycopy(b, 0, a, 3, b.length)
		 * 	1) 복사시작요소 : b[0] 요소를 a[3] 요소로 복사
		 * 	2) 복사할요소개수 : b.length개 복사
		 */
		
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
	
	public static void method5 () {
	    // 10진수를 2진수로 변환하기
	    
	    // 10진수
	    int number = 35;            // 2 | 35
	                                //   └----
	                                // 2 | 17  ... 1 → binary[0]
	                                //   └----
	                                // 2 |  8  ... 1 → binary[1]
	                                //   └----
	                                // 2 |  4  ... 0 → binary[2]
	                                //   └----
	                                // 2 |  2  ... 0 → binary[3]
	                                //   └----
	                                // 2 |  1  ... 0 → binary[4]
	                                //   └----
	                                //      0  ... 1 → binary[5]
	    
	    // 2진수                    //   ┌---------------------------------------┐
	    int[] binary = new int[10]; //   | 1 | 1 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 |
	                                //   └---------------------------------------┘
	    
	    int n = 0;
		while(number > 0) {
			 binary[n++] = number % 2;
			 number /= 2;
		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}
	
	public static void main(String[] args) {
		method5();

	}

}