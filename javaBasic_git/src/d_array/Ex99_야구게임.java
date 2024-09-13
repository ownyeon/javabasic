package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_야구게임 {

	public static void main(String[] args) {		
		//1. 임의의 수 3개 baseball에 저장 
		//i는 현재 배열에 넣은 인덱스
		//j는 중복을 검사하기 위한 인덱스로 j는 항상i보다 작은 값들만 가지고, 이전에 배열에 이미 채워진 값들과 현재 넣은 값이 중복인지 사용. 
		int baseball[] = new int[3];
		
		for(int i=0; i<baseball.length; i++) {
			baseball[i] = (int)(Math.random()*10); //베이스볼에 랜덤 수 넣기 
//			System.out.println(baseball[i]);
			for(int j=0; j<i; j++) {
				if(baseball[j] == baseball[i]) {
					i--; //i를 하나 빼고 i를 하나 더하면 그 자리에 한다고. 1번지에 들어가고싶은데 앞에있는 거랑 같음 
				}
			}
//			System.out.println(baseball[i] + "/");
		}
		//완성본 
		for(int i=0; i<baseball.length; i++) {
			System.out.print(baseball[i] + " ");
		}
		
		// --------------------------
		// 2. 사용자 입력값 answer에 각각의 숫자로 저장
		// [ex] 3 4 5 
		int []answer = new int[3];
		
		//구문 작성
		Scanner input = new Scanner(System.in);
		System.out.println("숫자입력 (1 2 3) -> ");
		String input_str = input.nextLine();
		StringTokenizer st = new StringTokenizer(input_str);
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = Integer.parseInt(st.nextToken());
		}
		
		//---------------------------
		// 3. 값비교 
		int strike = 0, ball= 0; 
		for(int i=0; i<baseball.length; i++) {
			//baseball이 움직이는값을 i로 생각 i가 0일때 j는 0,1,2비교, i가 2일때 j는 0,1,2
			for(int j=0; j<answer.length; j++) {
				//anwer를 가리키는 변수를 j라고 주는 거임 .
				
				//같은 애를 발견했니? 
				 if(baseball[i] == answer[j]) {
					 //자리수
					 if(i==j) {
						 strike++;
					 }else {
						 ball++;
					 }
				 }
				
			}
			
		}
		System.out.println("스트라이크" + strike + "/볼" + ball);
	}

}
