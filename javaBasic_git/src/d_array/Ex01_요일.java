package d_array;

import java.util.*;


public class Ex01_요일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance(); //얘네가 가지고 있는 값들을 가지고 올거임. 이렇게 하면 내가 메모리를 잡아서 값을 넣는다는 것임. 
		//그래서 .getInstance()를 사용해야 한다. 
		System.out.println("현재 날짜 확인");
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MONTH) +1 +"월");
		System.out.println(cal.get(Calendar.DATE)+"일");
		
		System.out.println("현재 시간 확인");
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.MINUTE) +"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");

		
		String [] yoil = {"일","월","화","수","목","금","토"};
		//요일은 숫자가 나옴 
		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)-1] + "요일");
		//SUNDAY:1, ... , FRIDAY:6
		
		int yoilnum = cal.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(yoil[yoilnum] + "요일");
	}

}
