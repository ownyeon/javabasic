package c_control;

import java.util.Scanner;

public class Ex06_for중첩_숫자사각형 {

	public static void main(String[] args) {
		
		/*
		 * 문제) 행과 열의 수를 입력 받아 다음 과 같이 출력하는 프로그램으로 작성하시오. 
		 * 입력
		 * 3 4
		 * 
		 * 출력
		 * 1 2 3 4 
		 * 2 4 6 8
		 * 3 6 9 12
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개 입력->");
		int row = input.nextInt();//줄
		int col = input.nextInt(); //칸
		
		int su = 1;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col;j++) {
				System.out.print(su + " ");
				su++;
			}
			System.out.println();
		}
		
		
//		int su = 1;
		
//		for(int i=0, su=1; i<row; i++) { //초기화한 값을 for문 안에 넣어두 된다. 
//			for(int j=0; j<col;j++, su++) {
//				System.out.print(su + " ");
//			}
//			System.out.println();
//		}
		
		//문제 숫자사각형1
		
//		for(int i=1; i<=row; i++) { //줄 
//			for(int j=1; j<=col; j++) { //칸 
//				System.out.print(i*j + " ");
//			}
//			System.out.println();
//		}
		
//		//문제 숫자사각형 3
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자 1개 입력->");
//		int row = input.nextInt();//줄, 칸 
//		
//		//첫번째 열의 값은 1,2,3,4 
//		//두번째 열의 값은 첫번쨰 열의 값에 4를 더한 값 2 6 10 14
//		//세번쨰 열의 값은 두번쨰 열의 값에 4를 더한 값 3 7 11 15
//		
//		
//		for(int i=1; i<=row; i++) { //줄 
//			for(int j=1; j<=row; j++) { //칸 
//				
//				System.out.print((i-row)+j*row + " ");
//			}
//			System.out.println();
//		}
		
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자 2개 입력->");
//		int row = input.nextInt();//줄
//		int col = input.nextInt(); //칸
//		
//		int number =1; //시작값
//		
//		for(int i=0; i<row; i++) {
//			//짝수행이라면
//			if(i % 2 == 0) {
//				for(int j=0; j < col; j++) { //칸 
//					System.out.print(number + " ");
//					number++;
//				}
////				System.out.println();
//				
//				//홀수행이라면
//			}else if(i % 2 == 1) {
//				int startnumber2 = number + col -1; //1 + 5 -1 = 5  
//				for(int j=0; j<col; j++) { //칸 
//					System.out.print(startnumber2 + " ");
//					startnumber2--; 
//				}
//				number+=startnumber2; //4줄 5칸이었을 때 3번째 줄 홀수에 값은 number값에 더해줘야 한다. 
//			}
//			System.out.println();
//			
//		}
		
		
		
		
		
		

	}

}
