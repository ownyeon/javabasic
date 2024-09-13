package a_datatype;

public class Ex04_Decaration {

	public static void main(String[] args) {
//	
//		int kor; //변수선언
//		kor = 30; //값 대입
//		
//		//초기화 = 변수선언 + 값대입 
//		int eng = 30; 

		int kor=30, eng=50;
		
		//두 점수 맞바꾸기 -> 두 변수의 값을 바꾸기
		//kor =30, eng = 50
		//[바꾼 후] kor=50, eng=30;
		//temp는 30값을 초기화 시킨 상태이다. 
		int temp = kor;
		kor = eng;
		eng = temp;
		
		
		System.out.println("국어:" + kor + " , 영어=" + eng);
		System.out.printf("국어: %d, 영어= %d\n", kor, eng);
//		System.out.println();
		/*
		 * 만약에 국어점수와 영어 점수가 동일하니? 
		 * 그렇다면 "두 점수가 동일"이라고 출력
		 * 그렇지 않다면 "두 정수는 다름"이라고 출력
		 * */
		
		if(kor == eng) {
		
			System.out.println("두 점수가 동일");
		}else {
			System.out.println("두 점수는 다름");
		}
		

		
		
	}

}
