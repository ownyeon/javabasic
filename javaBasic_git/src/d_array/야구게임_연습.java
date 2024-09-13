package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

//게임이 끝날 때까지 반복하도록 하려면, while 루프를 사용하여 계속해서 숫자를 입력받고, 그 값들을 비교하는 과정을 반복
// 조건은 strike가 3이 될때 게임이 종료된다. 

public class 야구게임_연습 {

	public static void main(String[] args) {
		//1. 임의의 수 3개 baseball에 저장
		int baseball[] = new int[3];

		//베이스볼에 랜덤 수를 넣고, 중복값인지 체크하기. 
		for(int i=0; i<baseball.length; i++) {
			baseball[i] =(int) (Math.random()*10); //Math.random자체가 double형이기 때문에 형변환을 해줘야 한다. 
			//중복값 체크하기 
			for(int j=0; j<i; j++) { //이전에 들어간 값들과 현재의 값을 비교한다. 
				if(baseball[j] == baseball[i]) {
					i--; 
					//1. 랜덤 값을 생성하여 배열에 저장.
					//2. 이전에 생성된 값들과 비교하여 중복 여부를 확인
					//3. 만약 중복된 값이 발견되면, 해당 위치에 다시 랜덤 값을 할당 

				}

			}		System.out.println(baseball[i] + "/");
			//랜덤값 생성
			// baseball[0]에 5가 들어갔다고 가정
			// 그 다음 두번째 baseball[1]에 5가 들어가면 중복이 발생
			//

		}		//완성본 
		for(int i=0; i<baseball.length; i++) {
			System.out.print(baseball[i] + " ");
		}


		int strike = 0, ball = 0; 
		while(strike<3) {
			//3. 값 비교
			strike = 0; //초기화 

			//2. 사용자 입력값 answer에 각각의 숫자로 저장 ex) 3 4 5 
			int [] answer = new int[3];
			//구문 작성 
			Scanner input = new Scanner(System.in);
			System.out.println("숫자입력 (1 2 3) -> ");
			String input_str = input.nextLine();
			StringTokenizer st = new StringTokenizer(input_str);

			for(int i=0; i<answer.length; i++) {
				answer[i] = Integer.parseInt(st.nextToken());//스트링과 인트여서 타입이 맞지 않음 형변환을 시켜줘야함.
				//			System.out.println(answer[i]);
			}


			//baseball이 움직이는값을 i로 생각 i가 0일때 j는 0,1,2비교, i가 2일때 j는 0,1,2
			for(int i= 0; i<baseball.length; i++) { //baseball이 가지고 있는 값
				for(int j=0; j<answer.length; j++) { // 내가 쓴 정답이 가지고 있는 값 
					if(baseball[i] == answer[j]) { 
						if(i==j) {
							strike++;
						}else {
							ball++;
						}
					}
				}
			}
			System.out.println("스트라이크" + strike + " 볼 " + ball);
		}
		System.out.println("모두 스트라이크로 게임을 종료합니다. ");
	}

}
