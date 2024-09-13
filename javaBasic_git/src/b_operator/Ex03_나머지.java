package b_operator;

import java.util.Scanner;

public class Ex03_나머지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//나머지 연산자 활용: 홀/짝수 구할 때
//		int a = 11; 
		
//		if(a%2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}

		int num1;
		Scanner input = new Scanner(System.in);
		//영어점수입력받기, 수학점수입력받기, 출력
		
		System.out.println("숫자입력->");
		num1 = input.nextInt();		
		
		
		//숫자 하나는 입력받아 해당하는 숫자가 3의 배수인지 아닌지 출력 
		if(num1%3 == 0) {
			System.out.println("3의 배수");
			
		}else {
			System.out.println("3의 배수가 아님");
		}
		
	}

}
