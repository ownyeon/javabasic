package f_exception;

/*
 * 오류
 * 		- 에러: 심각한 오류 
 * 		- 예외: 심각하지 않은 오류 
 * 
 * 예외처리: 최종적인 목적은 프로그램이 정상으로 종료 
 * 
 * [1] try~catch
 * 
 * 		try{
 * 			예외가 발생할 여지가 있는 구문 
 * 		}catch(Exception ex){
 * 			예외가 발생한 후에 구문
 * 		}finally{
 * 			예외관련 없이 무조건 실행구문 
 * 		}
 * 
 * [2] 함수 뒤에 throws 
 */

public class Ex01_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String [] str = new String[] {"안녕하세요","올라","하이"};
		String [] str = {"안녕하세요","올라","하이"};

		try {	
			for(int i=0; i<str.length; i++) { //실행을 시켜보면 문제가 발생함. Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3at f_exception.Ex01_TryCatch.main(Ex01_TryCatch.java:11)
				System.out.println(str[i]);
			}
			//return;
		}catch(Exception ex) { //예외가 발생하면 catch가 잡기 때문에 프로그램이 끝나지 않는다. 
			System.out.println("예외발생: " + ex.getMessage());
		}finally { //return이 들어가도 무조건 수행함. 
			System.out.println("무조건 구문 실행");
		}
		System.out.println("프로그램 종료");
	}

}
