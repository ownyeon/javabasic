package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while_연습 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("숫자 입력 (1 2 3 4) ->");
		String str= input.nextLine();
		
		StringTokenizer st = new StringTokenizer(str);
		
//		int max = 0;// st.nextToken()형변환 필요 nextToken은 스트링임 
//		while(st.hasMoreTokens()) {
//			String token = st.nextToken();
////			System.out.println(token);
//			//값을 비교할 수 있는 건 숫자여야함, 형변환을 해줌. 인트는 기본형이고 스트링은 참조형이기 때문에 (int)token이라고 쓰면 오류가 난다.
//			int su = Integer.parseInt(token);
//			
//			if(max<su) {
//				max = su;
//			}
//		}System.out.println("큰수" + max);
		
//		int countodd = 0;
//		int counteven = 0;
//		//정수를 입력받아 입력 받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오. 
//		while(st.hasMoreTokens()) {
//			String token = st.nextToken();
//			int su = Integer.parseInt(token); //입력받은 값들을 숫자로 형변환 시켜주기 
//		
//			if(su%2==0) {
//				countodd++;
//				}
//			else if(su%2==1) {
//				counteven++;
//			} 
//		}
//		
//		System.out.println("짝수는" + countodd);
//		System.out.println("홀수는" + counteven);
		
		//문제3 
		//10개의 정수 입력받아서 그 합과 평균을 출력하되 
		//0 이 입력되면 10개 입력이 끝나지 않았더라도 그 때까지 입력된 합과 평균을 출력하는 프로그램을 작성하시오. 
		
		int sum = 0; 
		int avg = 0; 
		int count = 0;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
//			System.out.println(token);
			//값을 비교할 수 있는 건 숫자여야함, 형변환을 해줌. 인트는 기본형이고 스트링은 참조형이기 때문에 (int)token이라고 쓰면 오류가 난다.
			int su = Integer.parseInt(token);
			// 값이 0이면 멈춤
			if(su==0) {
				break; 
			}
			sum += su;
			count++;
			avg = sum/count;
			
			//값이 10이면 멈춤
			if(su==10) {
				break;
			}
			
		}
		System.out.println(sum);
		System.out.println(avg);
		
	}

}
