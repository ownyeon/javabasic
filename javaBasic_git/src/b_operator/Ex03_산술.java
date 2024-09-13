package b_operator;

/*
 * 산술연산자 : + - * (/) %
 * 
 * 
 * 
 * 
 * 
 * */
import java.util.Scanner;

public class Ex03_산술 {

	public static void main(String[] args) {
	
		int num1, num2; 
		Scanner input = new Scanner(System.in);
		//영어점수입력받기, 수학점수입력받기, 출력
		
		System.out.println("첫번째숫자입력->");
		num1 = input.nextInt();
		
		System.out.println("두번째숫자입력->");
		num2 = input.nextInt();
		
		System.out.println("더하기: " + (num1+num2));
		System.out.println("빼기" + (num1-num2));
		System.out.println("곱하기: " + (num1*num2));
		System.out.println("나누기: " + (num1/num2));
		System.out.println("나머지: " + (num1%num2));
		
	}

}

/*
 * 
 * [콘솔창에서]
 * 
 * 첫번째숫자입력-> __ (ex) 20 
 * 두번째숫자입력 -> __ (ex) 15
 * 
 * 더하기 : 35
 * 빼기 : 5
 * 곱하기: 300
 * 나누기: 1 (정수랑 정수가 나누면 값이 정수) 
 * 나머지는: 5 
 * 
 * */
 