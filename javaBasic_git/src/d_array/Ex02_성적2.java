package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 5명의 국어점수를 입력하세요 (입력예시 : 10/10/10/10/10) -> 55/66/75/69/72
 * 총점은 xxx이고, 평균은 oooo입니다. 
 */


public class Ex02_성적2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("5명의 국어점수를 입력하세요 (입력예시 : 10/10/10/10/10 ) -> ");
		String score_str = input.nextLine(); // 내가 입력하는 국어점수 
		
		StringTokenizer st = new StringTokenizer(score_str, "/");
		
//		값을 뽑아서 저장
		int score [] = new int [st.countTokens()]; //몇개의 개수인지 , 공간 확보  
//		System.out.println(score.length);
		
		
		for(int i=0; i<score.length; i++) {
			score[i] = Integer.parseInt(st.nextToken()) ;
		}
		
//		
//		//총점 구하기 for문 사용 
		int total = 0; 
		for(int j=0; j<score.length; j++) {
			total += score[j];
		}
		System.out.println(total);
		
		//총점과 평균을 출력 
		int avg = 0;
		avg = total/score.length;
		System.out.println(avg);
//		
	}

}
