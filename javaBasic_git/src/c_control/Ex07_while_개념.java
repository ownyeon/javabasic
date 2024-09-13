package c_control;

import java.util.Scanner;

/*
 * 반복문
 * 	- for문
 * 	- while문
 * 	- do~ while문
 * 
 * for(초기치;조건문;증가치){
 * 반복문장;
 * }
 * 
 * 초기치;
 * while(조건문) {
 * 반복문장;
 * 증가치; 
 * }
 * 
 * 
 */

public class Ex07_while_개념 {

	public static void main(String[] args) {
		
//		int sum = 0;
//		
//		for(int i=1; i<=10; i++) {
//			sum+=i;
//		}//end of for 
//		System.out.println("합: " + sum );
		
//		int sum = 0;
//		
//		int i=1; //for문의 초기치
//		while(i<=10) {//조건문만 남음. 그래서 while은 조건문만 가지고 있게 됨. 
//			sum+=i;
//			i++; //for문의 증가치
//		}//end of for 
//		System.out.println("합: " + sum );	
		
		//단수를 입력받아 구구단 출력
		Scanner input = new Scanner(System.in);
		System.out.println("단 입력->");
		int dan = input.nextInt();
		//[ex] 2 * 1 = 2
		//
		//	   2 * 9 = 18
		
		int i=1;
		while (i<=9) {
			System.out.printf("%d * %d = %d\n", dan, i , dan*i);
			i++;
		}
		
		
		
		
	}//end of main

}//end of class 
