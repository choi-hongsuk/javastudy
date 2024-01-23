package pkg04_random;

public class Class01_Math {

	public static void main(String[] args) {
		/*
		 * Math.random()		0.0 <= 난수 < 1.0 
		 */
		
		// 5% 확률로 "대박"
		if(Math.random() < 0.05) {
			System.out.println("대박");
		} else {
			System.out.println("대박은 무슨");
		}
	
	}

}
