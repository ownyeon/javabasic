package c_control;

public class Ex06_for중첩_알파벳 {

	public static void main(String[] args) {

		//문제 1번 
//		for(int j=0; j<26; j++) {
//			//알파벳 a부터 z까지 한줄에 출력
//			for(char ch='A'; ch<='A'+j; ch++) { //a를 중심으로 i가 하나씩 증가하고 있으니까 
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
		
		//문제 2번
//		for(int j=0; j<26; j++) {
//		//알파벳 a부터 z까지 한줄에 출력
//		for(char ch='A'; ch<='Z'-j; ch++) { //a를 중심으로 i가 하나씩 증가하고 있으니까 
//			System.out.print(ch);
//		}
//		System.out.println();
//	}
		
//		//문제 3번
//		for(int j=0; j<26; j++) {
//		//알파벳 a부터 z까지 한줄에 출력
//		for(char ch='Z'; ch>='Z'-j; ch--) { //a를 중심으로 i가 하나씩 증가하고 있으니까 
//			System.out.print(ch);
//		}
//		System.out.println();
//		}		
		
		//문제 4번
		
//		//subString()을 사용해서 풀수는 없음 a부터 z까지 입력을 받는 게 아니면 
//		for(char ch = 'A'; ch<='Z'; ch++) {
//			
//			for(char c = ch; c <'Z'; c++ ) {
//				System.out.print(c);
//			}
//			System.out.println();
//		}

		//4번 다른 방법
		for(int j=0; j<26; j++) {
		//알파벳 a부터 z까지 한줄에 출력
			for(char ch=(char)('A'+j); ch<='Z'; ch++) { //ch='A'+i를 하게 되면 자료형에 맞지 않음. 그래서 형변환을 시켜야함. 
				System.out.print(ch);
			}
		System.out.println();
	}
		
		
	}

}
