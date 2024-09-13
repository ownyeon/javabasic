package c_control;

import java.util.Calendar;

public class Ex03_나이구하기 {

	public static void main(String[] args) {
	
		
		//나이를 계산하고 싶음 
		String id = "010919-4174315";
		String nai = id.substring(0,2); // nai = "80"
		//바로 계산이 안되고 숫자 나이로 만들어줘야 한다. 
		int sunai = Integer.parseInt(nai); //"80" -> 80으로 바꿔준다. 참조형과 기본형 끼리는 casting이 안됨. 그래서 형변환을 시켜줘야 함 
	
		String juMon = id.substring(2,4); //주민등록상 월 추출
		int juMonth = Integer.parseInt(juMon);
//		System.out.println(juMonth);
		
		String juDa = id.substring(4,6); //주민등록상 일 추출
		int juDate = Integer.parseInt(juDa);
		
		int age = 0; 
		char sung = id.charAt(7);
		
		//올해 년도, 월, 일 구하기 
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		
		//성별 문자가 '1'이거나 '2'라면
		if(sung == '1' || sung =='2') {
			age = year - (1900 +  sunai) +1;	
		} else if(sung == '3' || sung =='4') {
		//성별 문자가 '3'이거나 '4'라면
		age = year - (2000 +  sunai) +1;
		}
//		
		System.out.println("한국나이= " + age);

		int manAge = age;
		int realAge = 0;

		//------------ 만나이 구하기 
		//월과 일이 둘 다 지났을 경우, manAge-2
		//월과 일이 둘 다 지나지 않았을 경우, manAge-2
		//지금 월보다 주민등록상 월이 큰 경우 
//		if(juMonth<month) {
//			realAge=manAge-1;
//		}else if(juMonth==month) {
//			if(juDate>=date) {
//				realAge = manAge-1;
//			}else if(juDate<date) {
//				realAge=manAge-2;
//			}
//		}else if(month<juMonth) {
//			realAge = manAge-2;
//		}
//		
//		System.out.println("나의 만 나이는" + realAge + "살입니다");
		
	}

}





/*
 * Wrapper class : 자료형 클래스 
 * 
 * int : Integer
 * long : Long 
 * double : Double 
 * 
 * 
 * 
 * 
 */
 