package b_operator;

/*
 * 
 * 문자열 처리하는 클래스
 * - String
 * - StringBuffer / StringBuilder
 * 
 * 
 * 
 * 
 * 
 */


public class Ex12_String별종 {

	public static void main(String[] args) {
		
		//위에처럼 StringBuffer를 사용해서 객체를 만든후 플러스 연산자를 사용해서 붙이면 오류가 나온다. 
		//스트링버퍼와 스트링 빌더의 차이: 하나의 작업이 시작됐을 때 다른 작업은 rock이 걸림. 
		StringBuffer sb = new StringBuffer("홍길동");
		sb.append("바보");
//		sb + "바보";
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("홍길국");
		sb2.append("바보");
		System.out.println(sb2);
		
		//String str = new String("홍질자");
		//[특권] new 생략 가능 
		//		+ 연산자 가능 (String이 유일하게 더하기가 될 수 있도록 한 것임) 
		String str = "총길자";
		str += "바보"; //		str = str + "바보"; 
		// 메모리를 새로 만듦. 3000번인 홍길자가 아니라 7000번인 홍길자 바보라는 메모리를 만들고 그거를 str이 가져다가 씀 
		System.out.println(str);
		

	}

}
