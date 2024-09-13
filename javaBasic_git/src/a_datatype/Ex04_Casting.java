package a_datatype;

/*
 * [참고] 자료형
 * 
 * 1. 기본형 
 * `논리형: boolean  
 * `문자형: char(2Byte) 
 * `정수형: byte(1B), short(2B), int(4B), long(8B)
 * `실수형: float(4B), double(8B) 
 * 	
 * 2. 참조형 : 배열, 클래스 
 * 
 * [기본] 
 * 		변수의 자료형과 값의 자료형이 일치 
 * 
 * [참고]
 * 		변수의 자료형과 값의 자료형이 안 맞는 경우 
 * 		
 * 		`변수의 자료형 > 값의 자료형 : 자동해결
 * 		`변수의 자료형 < 값의 자료형 : 자료형 변경(casting) 
 * 
 * 
 * */


public class Ex04_Casting {

	public static void main(String[] args) {
		
		float f; 
//		f= 3.6 //에러발생 
		
		f = (float)3.6;
		System.out.println("f="+ f);
		
		double d; //8B
		d = 100; //공간(8b), = 4B의 값, 남은 4byte가 남게됨. 
		System.out.println("d=" +d);
		
		
		//정수형변수 i에 36.99실수 대입하고 출력
		
		int i;
		i = (int)36.99; //4바이트에다가 8바이트짜리를 넣으려고 해서 에러가 나타나는 거임. 
		System.out.println("i=" + i);
		
		int su;
//		su = 10000000000; //0이 11개는 이 숫자는 저장을 못한다고 에러가 나는 거임 
		
		long big;
		big = 10000000000L; //그냥 10000000000 이렇게만 쓰게 되면 에러, 이랬을 때 L로 롱형으로 잡아줘야 한다. 
		System.out.println("큰수:"+ big); 
		
		
		
		

	}

}
