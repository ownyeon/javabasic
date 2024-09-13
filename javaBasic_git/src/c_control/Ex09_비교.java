package c_control;

import java.util.Scanner;

public class Ex09_비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//-----[1] for문이용 
//		System.out.println("구구단 출력 몇 번 할까요? ");
//		int su = input.nextInt();
//		
//		for(int a=0; a<su; a++) {
//			System.out.println("단 입력->");
//			int dan = input.nextInt();
//			for(int i=1; i<=9; i++) {
//				System.out.printf("%d * %d = %d \n", dan, i, dan * i);
//			}
//		}
		
		//------[2] while이용
//		while(true) {
//		System.out.println("단 입력->");
//		int dan = input.nextInt();
//		for(int i=1; i<=9; i++) {
//			System.out.printf("%d * %d = %d \n", dan, i, dan * i);
//		}
//		System.out.println("종료할까요? (Y/N)");
//		String answer = input.next();
////		String answer = input.nextLine(); //버퍼에 남아있는 엔터(개행문자)떄문에 바로 빈문자열이 입력되면서 "단 입력"이 나온다. 
//		
//		if(answer.equals("Y") || answer.equals("y")) break;
		
		
		//----------------[3] do~while이용
		
		String answer = "";
		
		do { //while조건이 만족을 해야지만 반복을 도니까 while은 true가 되어야 함. 어떻게 하면 반복을 할까?
		System.out.println("단 입력->");
		int dan = input.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan * i);
		}
		System.out.println("다시 할까요? (Y/N)");
		answer = input.next();
//		String answer = input.nextLine(); //버퍼에 남아있는 엔터(개행문자)떄문에 바로 빈문자열이 입력되면서 "단 입력"이 나온다. 
		
		}while(answer.equals("Y") || answer.equals("y"));
	

	}

}
