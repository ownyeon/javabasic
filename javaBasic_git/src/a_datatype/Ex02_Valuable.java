package a_datatype;

/*
 * [참고]
 * 9: 숫자9
 * '9': 문자9
 * "9": 문자열 9 
 * 
 * */

public class Ex02_Valuable {

	public static void main(String[] args) {
		
		
		
		// ------------------------------------
		// [1] 변수를 선언
		char testCh;		// 문자변수 testCh 선언
		//정수형 변수 jungsu 선언
		int jungsu; 
		//실수형 변수 silsu선언
		double silsu;
		//논리형 변수 ok 선언 
		boolean ok; 
	
		
		// ------------------------------------
		// [2] 값을 지정(대입) 
			// testCh 변수에 '깡' 문자 지정 (대입, 저장) 
			//만약에 ""를 사용하고 싶으면 char 를 사용하는 게 아니라 string을 사용해야 함 
		testCh = '깡'; 
		//jungsu 변수에 10000숫자 지정 
		jungsu = 100000;
		//선언한 실수형 변수에 3.6 저장
		silsu = 3.6;
		//ok 변수에 참(true) 지정(저장, 대입) 
		ok = true;
		
		//------------------------------------
		// [3] 출력
		System.out.println("문자변수:" + testCh);
		//jungsu 변수를 출력
		System.out.println("정수형변수:"+jungsu);
		//선언한 실수형 변수를 출력 
		System.out.println("실수형변수:"+silsu);
		System.out.println("논리형변수"+ ok);
		
	}

}
