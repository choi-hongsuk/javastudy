package pkg03_branch_practice;

public class MainClass {

	  public static void method1() {
	    
	    // 월에 따른 계절 출력하기
	    int month = 2;
	    if (month == 12 || month ==  1 || month == 2) {
	    	System.out.println("겨울");
	    }else if (month == 3 || month == 4 || month == 5){
	    	System.out.println("봄");
	    }else if (month == 6 || month == 7 || month == 8) {
	    	System.out.println("여름");
	    }else if (month == 9 || month == 10 || month == 11) {
	    	System.out.println("가을");
	    }else {
	    	System.out.println("잘못된 월을 입력하였습니다.");
	    }
	  }
	  
	  public static void method2() {
	    
	    // 점수와 학년에 따른 합격 여부
	    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
	    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
	    
	    int score = 10;  // 점수
	    int grade = 4;   // 학년
	    if ( grade < 1 || grade >= 7 ) {
	    	System.out.println("잘못된 학년을 입력하였습니다.");
	    }else if (grade <= 3) {
	    	if (score >= 60 && score <= 100) {
	    		System.out.println("합격입니다.");
	    	}else if (score >= 0 && score < 60) {
	    		System.out.println("불합격입니다.");
	    	}else {
	    		System.out.println("잘못된 점수를 입력하였습니다.");
	    	}
	    }else if (grade <= 6) {
	    	if (score >= 70 && score <= 100) {
	    		System.out.println("합격입니다.");
	    	}else if (score >= 0 && score < 70) {
	    		System.out.println("불합격입니다.");
	    	}else {
	    		System.out.println("잘못된 점수를 입력하였습니다.");
	    	}
	    }
	  
	  public static void method3() {
	    
	    // 4일은 목요일, n일 후는 무슨 요일?
	    
	    int day = 4;      // 4일은 목요일
	    int nDay = 10;    // nDay일 후
	    String weekName;  // 요일 (월~일)
	    if ((day + nDay) % 7 == 4) {
	    	weekName = "목요일";
	    	System.out.println(weekName + "입니다");
	    }else if ((day + nDay) % 7 == 5) {
	    	weekName = "금요일";
	    	System.out.println(weekName + "입니다");
	    }else if ((day + nDay) % 7 == 6) {
	    	weekName = "토요일";
	    	System.out.println(weekName + "입니다");
	    }else if ((day + nDay) % 7 == 0) {
	    	weekName = "일요일";
	    	System.out.println(weekName + "입니다");
	    }else if ((day + nDay) % 7 == 1) {
	    	weekName = "월요일";
	    	System.out.println(weekName + "입니다");
	    }else if ((day + nDay) % 7 == 2) {
	    	weekName = "화요일";
	    	System.out.println(weekName + "입니다");
	    }else if((day + nDay) % 7 == 3) {
	    	weekName = "수요일";
	    	System.out.println(weekName + "입니다");
	    }else
	    	System.out.println("잘못된 수를 입력하였습니다");
	  }
	  
	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
		  method1();
		  method2();
		  method3();
	  }

	}