package b_operator;

/*
 * 
 * not : 결과에 반대로 하는 연산자 
 * 
 * 		-일반논리 (true/false) not: !
 * 		-이진논리 not : ~
 * 
 * 
 * */



public class Ex02_NOT {

	public static void main(String[] args) {

		//일반논리 not 
		boolean result = 3 > 4;
		System.out.println(result);
		System.out.println(!result);
		
		//이진논리 not 
		int a = 15; //4바이트 32비트 [0]0000000 00000000 00000000 00001111
					// 0: 양수, 1:음수 
		System.out.println(a);
		System.out.println(~a);
		//[1]1111111 11111111 1111111 11110000 
		
	}

}
