package a_datatype;

import java.util.Scanner;

/*
 * 자바에서 콘솔 입력받는 방법
 * 
 * -java.util.Scanner 클래스 이용
 * 
 * - 정수형입력시: nextInt() 
 * - 실수형입력시: nextDouble()
 * - 문자열입력시: next(), nextLine() ***[숙제] 차이점? 
 * 
 * */

//[참고] 자주사용하는 기본적인 클래스는 java.lang 패키지
//import java.lang.*;
//import java.util.Scanner;

public class Ex08_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor, eng, math;
		
		Scanner input = new Scanner(System.in);
		//영어점수입력받기, 수학점수입력받기, 출력
		
		System.out.println("국어입력->");
		kor = input.nextInt();
		System.out.println("국어" + kor);
		
		System.out.println("수학입력->");
		math = input.nextInt();
		System.out.println("수학" + math);
		
		System.out.println("영어입력->");
		eng = input.nextInt();
		System.out.println("영어" + eng);
		
		//총점구해서 출력
		int total; 
		total = kor + eng + math; 
		System.out.println(total);
		//평균구해서 출력
		int avg;
		avg = total/3;
		System.out.println(avg);
		
		
		
	}

}
