package e_method;
// string은 쓰레기가 많이 생김 (새롭게 메모리를 계속 만드니까.) 
//내용이 자주 변경되는 것들은 스트링버퍼나 스트링 빌더로 해야함. 

public class Ex06_CallByString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "안녕";
		String b = "하이"; 
		
		add(a,b);
		System.out.println("2. A=" + a + ",B=" + b); //1

	}
	static void add(String a, String b) {
		//String 클래스는 메모리를 새로 잡음. 
		a += b; 
		System.out.println("1. A=" + a + ",B=" + b); //1

	}

}

/*
 * 	1. A=안녕하이,B=하이
 *	2. A=안녕,B=하이	
 */
