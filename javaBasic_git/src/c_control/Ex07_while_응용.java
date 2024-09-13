package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * for문: 반복횟수를 알고 있는 경우 주로 사용 
 * while문: 반복횟수를 모를 때 주로 사용
 * 
 * 
 */


public class Ex07_while_응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 예: 국어/영어/수학 ->90/88/70
		Scanner input = new Scanner(System.in);
		System.out.println("국어/영어/수학 90 88 70 -> ");
		String str = input.nextLine();
//		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str,"/");//어떤 애들을 기점으로 해서 쪼갬. 구분자: 공백 
		
		int cnt = st.countTokens(); //값을 뽑아서 저장하고 있어야함. 
		System.out.println(cnt);
		//반복횟수 알 수 있다면
		//단어 몇개 쪼갰는지 얻어올 수 있음 
		for(int i=0; i<cnt; i++) {
			String token = st.nextToken(); //쪼갠 토큰 다음걸 가지고 옴. 
			System.out.println("점수:" + token);
		}
		
		
		
		//다음애가 있으면 반복문을 구동. 남아있는 단어가 존재하지 않으면 false가 돼서 반복문을 벗어남
//		while(st.hasMoreTokens()) {
//			String token = st.nextToken(); //쪼갠 토큰 다음걸 가지고 옴. 단어가 남아있으면 읽어옴 
//			System.out.println("점수:" + token);
//		}
	}

}
