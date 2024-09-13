package b_operator;

import java.util.Scanner;

public class Ex06_복습 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); //시스템안에 입력하고자 한다. = 가상 통로 

		System.out.println("문자 하나를 입력하세요 -> ");
		char ch = input.nextLine().charAt(1); //문자열 입력 = input.nextLine(), 첫번째 것만 담겠다. 
		System.out.println("문자: " + ch);

		//사용자가 입력한 문자가 대문자인지 여부 출력
		if(ch >= 'A' && ch <='Z') { //문자가 'A'보다 크거나 같고, 문자가 'Z'보다 작거나 같다면 
			System.out.println("대문자");
		}else if(ch >= 'a' && ch <='z'){
			System.out.println("소문자");
		}else {
			System.out.println("기타 문자");
		}


		// 그렇지 않다면 문자가 'a'보다 크거나 같고 'z'보다 작거나 같다면
		// '소문자'라고 출력


		//Ascii-code 
		//'A' : 65
		//'B' : 66
		//'B' > 'A'



	}

}

/*
 * 
 * 자동 임포트 : ctrl + shift + o 
 * 
 * 줄맞춤: ctrl + i 
 *
 * 
 * */
