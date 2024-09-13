package javaBasic;

import java.util.Scanner;

public class 숫자3개중제일큰수출력 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

	
		
		if (a > b && a > c) {
		    System.out.println("a값이 제일 큽니다");
		} else if (b > a && b > c) {
		    System.out.println("b값이 제일 큽니다");
		} else {
		    System.out.println("c값이 제일 큽니다.");
		}

		
		//3항 연산자 
		String result = (a > b) ? 
                (a > c ? "a값이 제일 큽니다" : "c값이 제일 큽니다") : 
                (b > c ? "b값이 제일 큽니다" : "c값이 제일 큽니다");

		System.out.println("3항연산 " + result);
		
	}

}
