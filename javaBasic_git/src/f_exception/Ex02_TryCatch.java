package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외적으로 다른 곳에서 가지고 오게 되면 예외처리를 필수로 해줘야 함. 		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("abc.txt"); //필수적인 예외처리를 해줘야 함. 
			fis.read(); //1. 데이터가 오고가는 통로 
			
			System.out.println("파일처리");
		}catch(FileNotFoundException ex) { //FileNotFoundException : 파일이 존재하지 않는 문제일때는 이렇게 사용할 수도 있다. 
			System.out.println("파일이 존재하지 않는 예외발생: " + ex.getMessage());
//			ex.printStackTrace(); //잘못된 상황들을 발자취대로 프린트를 해줌 
		}catch(Exception ex) { //그 외 다른 문제들을 여기서 잡아내겠다. 
			System.out.println("그 외 예외발생: " + ex.getMessage());
		}finally {
			try {
			fis.close(); //가상 통로는 반드시 닫아줘야 함. 그리고 얘도 예외처리가 필요함. 
			}catch(Exception ex) {
				
			}
		}
		
	}

}
