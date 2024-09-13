package e_method;

import java.util.Scanner;

public class Ex99_복습3 {

	public static void main(String[] args) {
		char ch[][] = input(); //10. 저장된 ch는 output의 인수로 넘겨준다. 
		output(ch);
	}
	
	/*
	문자 배열에 저장된 문자들을 화면에 출력한다.
	*/
	static void output(char [][] ch) {//11. 넘겨준 ch는 자료형을 맞춰준다. 
		
		for(int i=0; i<ch.length; i++) { //12. 넘겨준 배열의 길이만큼 for문을 돌아서 최종 값을 출력한다. 
			for(int j=0; j<ch[i].length; j++) {
		
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
	}

	/*
	두 정수와 알파벳 문자 하나를 입력받는다
	[예] 3 4 F
	*/	
	static char [][] input() { //9. return값에 따라 자료형을 char[][]으로 만든다. 
		//1. 정수와 문자열 입력을 받는다. 그대로 인수로 넘겨줄 것이기 때문에 배열 안에 저장할 필요가 없다. 
		Scanner input = new Scanner (System.in);
		System.out.println("첫번째 정수 입력");
		int a = input.nextInt();
		System.out.println("두 번째 정수 입력");
		int b = input.nextInt();
		System.out.println("세 번째 문자 입력");
		char c = input.next().charAt(0);
		
		char [][] ch = makeSquare(a,b,c); //2. makesquare함수에 인수 a,b,c를 보낸다. 7. 넘어온 값인 ch를 저장한다. 
		return ch; //8. 저장한 ch값을 리턴을 통해 호출된 input으로 보내줘야 한다
		
	}
	
	// 입력받은 첫 번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어
	//		입력받은 문자를 시작으로 저장한다. 
	/*
	 * 		F	G	H	I
	 * 		J	K	L	M
	 * 		N	O	P	Q
	 */
	static char[][] makeSquare(int a, int b, char c) { //3. a,b,c 파라미터를 설정한다. 
		 char [][]  ch = new char [a][b]; //4. char[][] ch = null;은 메모리가 잡힌 게 아니기 때문에 직접 메모리를 설정해 줘야 한다. 
		 
		 //5. 초기문자 초기화 
		  char initchar = c; 
		 
			for(int i=0; i<a; i++) {
				for(int j=0; j<b; j++) {
					ch[i][j] = initchar;
					initchar++;
					// 5. 2차원 배열로 크기를 잡아주고 초기값을 설정하여 잡아준 크기만큼 증가하도록 하기 
				}
			}
			
			return ch; //6. 얘가 45라인으로 리턴이 되는 거임, 메모리 값을 넘겨준다. 
			
	}

}