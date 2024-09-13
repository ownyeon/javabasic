package d_array;

import java.util.Scanner;

/*
 *학생수를 입력하세요 -> 5
 *
 */
public class Ex02_성적1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("학생수를 입력하세요 -> ");
		int su = input.nextInt();
	
		int [] kor = new int[su]; //사용자가 갯수를 잡은 만큼 확보, 학생수 
		
		for(int i=0; i<kor.length; i++) {
			System.out.println(i + "번 학생의 점수를 입력하세요");
			kor[i] = input.nextInt();
		}
		//총점 구하기 for문 사용 
		int total = 0; 
		for(int j=0; j<kor.length; j++) {
			total += kor[j];
		}
		System.out.println(total);
		
		//총점과 평균을 출력 
		int avg = 0;
		avg = total/su;
		System.out.println(avg);
	
	
	
	
	
	}

}
