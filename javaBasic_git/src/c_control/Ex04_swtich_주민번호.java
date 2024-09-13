package c_control;

public class Ex04_swtich_주민번호 {

	public static void main(String[] args) {

		String id = "801212-1234567";
		char chu1 = id.charAt(8);
//		System.out.println(chu1);
		
		
		String local = "";
		
		switch(chu1) {
		case '0' :local = "서울"; break;
		case '1' :local ="인천/부산"; break;
		case '2' :local = "경기"; break;
		case '9' :local = "제주"; break;
		default : local ="한국"; 
		}
		
		System.out.println("당신은 " + local + "출신입니다");
		
		
		
		}
		
		
		
	}


/*
 * 
 *주민번호에서 출신지 번호가 
 *0:서울
 *1:인천/부산
 *2/경기
 *9/제주
 *나머지: 한국
 *
 * if(chu1 =='0'){
 * 서울
 * }else if (chu1 =='1'){
 * 인천/부산
 * 
 * 
 * 
 * 분기문 switch
 * [주의] break 문장 확인
 * [주의] 문자형(char)/정수형(int/long)/문자열(String) 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 */
 