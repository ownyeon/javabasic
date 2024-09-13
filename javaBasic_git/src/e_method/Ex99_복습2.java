package e_method;

import java.util.Scanner;

public class Ex99_복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("점수입력-> ");
		int jumsu = input.nextInt();
		
		String result = pass(jumsu); //1. 인자를 넘김 
		System.out.println(result);
	}
	
	/*
	 * 역할: 입력받은 점수를 넘겨 받아서 80점 이상이면 '합격'출력 그렇지 않으면 '불합격' 확인
	 */
	static String pass(int jumsu){ //2. 파라미터로 받음
		String result = "";
		if(jumsu >= 80) {
			result = "합격";
		}else {
			result = "불합격";
		}
//		System.out.println(result);
		return result;
		
	}

}
