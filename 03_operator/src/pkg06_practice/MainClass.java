package pkg06_practice;

public class MainClass {
	public static void method1() {
		int second = 90;
		int m = second / 60 ;
		int s = second % 60 ;
		System.out.println(m + "분");
		System.out.println(s + "초");
	}
	public static void method2() {
		// x 와 y의 값을 교환하기
		
		int x = 10;
		int y = 20;
		int temp;
		temp = x + y;
		x = temp - x;
		y = temp - y;
		System.out.println(x);
		System.out.println(y);
	}
	public static void method3() {
		// 점수가 90점대이면 true 아니면 false
		int score = 100;
		boolean set = score >= 90 && score < 100 ? true : false;
		System.out.println(set);
				
	}
	public static void method4() {
	//짝수 / 홀수 판단
		// 짝수 : 2로 나눈 나머지가 0인 수
		// 홀수 : 2로 나눈 나머지가 1인 수
		int tnt = 201;
		String hol = tnt % 2 == 0 ? "짝" : "홀" ;
		System.out.println(hol);
	}
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
	}

}
