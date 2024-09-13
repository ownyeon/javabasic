package c_control;

public class Ex01_if_전화번호 {

	public static void main(String[] args) {

		String tel = "02-222-2222";
		int idx = tel.indexOf('-'); //몇번째인지 찾는다. 
//		System.out.println(idx);
		
		String localNum = tel.substring(0, idx); // 0번쨰부터 idx(2)앞에 까지의 문자열
		System.out.println(localNum);
		
		/*
		 * 지역번호가 02라면 "서울" 출력
		 * 그렇지않고 지역번호가 032라면 "인천"출력
		 * 나머지는 "한국" 출력
		 */
		
		/*
		 * 1. 초기화
		 * 2. 초기화된 변수에 값을 넣음
		 * 3. 문자열을 비교할때는 equals를 사용해야 함. 
		 */
		
		
		String local = ""; 
		
		if (localNum.equals( "02" ) ) { //문자열을 비교할때는 equals를 사용해야 한다. 
			local = "서울";
		}else if (localNum.equals("032")) {
			local = "인천";
		} else {
			local = "한국";
		}
		
		
		
		
		
		
	}

}
