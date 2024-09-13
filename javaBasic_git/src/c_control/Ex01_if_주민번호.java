package c_control;

/*
 * 1 : int
 * '1': char
 * "1": String
 * 
 */


public class Ex01_if_주민번호 {

	public static void main(String[] args) {

		String id = "010319-4174315";
		char sung = id.charAt(7);
		String gender = ""; 
//		System.out.println(sung);
		
		//그 문자가 1이거나 3이거나 9라면 '남자'를 출력 
		//그 문자가 2이거나 4이라면 0이면 '여자'를 출력
		//캐릭터형이면 문자 비교를 해줘야 한다. 
		if(sung == '1' || sung =='3' || sung =='9') {
			gender = "남자"; 
			
			//System.out.println("남자");
		} else if(sung == '2'||sung =='4' || sung == '0'){
			//System.out.println("여자");
			gender = "여자";
		}
		
		System.out.println("당신은 " + gender + "입니다");
		
		
	}

}
