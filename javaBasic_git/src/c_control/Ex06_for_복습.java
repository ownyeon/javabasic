package c_control;

import java.util.Scanner;

public class Ex06_for_복습 {
	public static void main(String[] args) {
		//자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오. 주의! 숫자를 공백으로 구분하되 줄사이에 빈줄이 없다.
		//			1
		//		1   2
		//	1   2   3
		
		
		//문제 풀이 순서 적기: 
		/*
		 * 1. 몇행 몇열로 나오는지 확인. 3행 3열로 나온다 -> 이중 for문을 사용해야 한다.
		 * 2. 공백을 추가해 줘야 한다.
		 * 3. 반복 패턴 찾기. 1부터 시작해서 1,2,3 이런식으로 늘어남. 그러니까 시작은 1. 그리고 끝나는 부분만 건들여주면 됨
		 * 4. 원래는 j대신 별을 찍어 확인을 해봄. 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자입력 -> ");
		int su = input.nextInt();
		
		//3행 3열로 나온다는 걸 안다 -> 이중 for문 사용
		
		for(int i=0; i<su; i++) { //행(row) 
			//공백 추가 
			//3을 입력하면 2,1,0개 순으로 나와야 한다. 
			for(int k=0; k<su-i-1; k++) {
				System.out.print(' ');
			}
			
			for(int j=1; j<=i+1; j++) { //문자(열:col)
				System.out.print(j);		
			}
			System.out.println();
		}
		
	}

}
