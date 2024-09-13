package c_control;

import java.util.Scanner;

public class Ex02_if_학번 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String information = input.nextLine();
		
		//예제 2017년도에 입학한 공대 컴퓨터학과 학생입니다. 
		
		//1. 입학년도를 찾는다. 
		//2. 단과대 번호를 찾는다.
		//3. 공과대학인지, 사회학과인지 경우에 해당하는 문자를 찾는다.
		//4. 그 문자에 따른 값들을 출력한다. 
		
			String localNum = information.substring(0,4);  // 입학년도
	        System.out.println(localNum);
	        String localNum2 = information.substring(4,5);  // 단과대 번호, information.charAt(4)를 사용해서 가지고 올 수 도 있음 
	        System.out.println(localNum2);
	        String localNum3 = information.substring(5,7);  // 학과 코드
	        System.out.println(localNum3);
	        
	        String local = ""; 
	        String local2 = "";
	        
	        // 단과대학 구분 (공대 또는 사회대)
	        if (localNum2.equals("1")) {  // "1"을 사용해 공대인지 확인
	            local = "공대";
	        } else {
	            local = "사회대";
	        }
	        
	        // 학과 구분
	        if(local.equals("공대")) {  // equals로 문자열 비교
	            
	            if(localNum3.equals("11")) {
	                local2 = "컴퓨터학과";
	            } else if (localNum3.equals("12")) {
	                local2 = "소프트웨어 학과";
	            } else if (localNum3.equals("13")) {
	                local2 = "모바일 학과";
	            } else if(localNum3.equals("22")) {
	                local2 = "자바 학과";
	            } else {
	                local2 = "서버학과";
	            }
	            
	        } else {  // 사회대의 경우
	            
	            if(localNum3.equals("11")) {
	                local2 = "사회학과";
	            } else if (localNum3.equals("12")) {
	                local2 = "경영학과";
	            } else {
	                local2 = "경제학과";
	            }
	        }
	        
	        System.out.println(information + "은 " + localNum + "년에 입학한 " + local + " " + local2 + " 학생입니다.");
	        
		
	}

}

