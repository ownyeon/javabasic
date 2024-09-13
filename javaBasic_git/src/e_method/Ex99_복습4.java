package e_method;

public class Ex99_복습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int result = subtract(10,8);
//		System.out.println(result);
		
		
	}

	static int subtract(int a, int b) {
		int result = a - b;
		return result;
		
	}

	static void greeting(int a) {
		if(a==1) {
			System.out.println("안녕하세요");
		}else if(a==2) {
			System.out.println("굿모닝");
		}else if(a==3) {
			System.out.println("올라");
		}else {
			System.out.println("곤니치와");
		}
		
	}
	
	static void loopMethod (int a) {
		for(int i=0; i<a; i++) {
			System.out.println("자바는 맛있다.");
		}
	}
	
	static double circle (double a) {
		double result = 3.14*a*a;
		return result;
	}
	
	
	static int square (int a, int b) {
		int result = a*b; 
		return result;
	}
	
	
	

}
