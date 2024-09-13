package e_method;

/*
 * CallByReference
 * 		: 메소드 인자(파라미터)의 자료형이 참조형인 경우 
 * 
 * 		=> 주소만 복사 
 */


public class Ex06_CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StringBuffer a = new StringBuffer("안녕"); //StringBuffer도 자료형에 포함
			StringBuffer b = new StringBuffer("하이");
			add(a,b);
			System.out.println("2. A=" + a + ",B=" + b); //참조형은 원본에 영향을 미침 
			

		
	}
	
	static void add(StringBuffer a, StringBuffer b) {
		//참조형은 append를 써서 더함
		a.append(b);
		System.out.println("1. A=" + a + ",B=" + b); //1

		
	}

}
