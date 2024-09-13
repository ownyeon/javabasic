package f_exception;

import java.io.FileInputStream;

public class Ex03_Throws {

	public static void main(String[] args) {

		//예외 잡으세요 -> 트라이케치
		//예외 던지세요 throws Exception을 써달라는 거임 
		//정상적으로 잘 처리를 했는지
		try {
			readFile(); 
			System.out.println("파일처리성공");
		}catch(Exception ex) {
			System.out.println("예외발생" + ex.getMessage());
			//ex.printStackTrace();
		}
	}
	static void readFile() throws Exception { //예외가 발생함 
		FileInputStream fis =null;
		try {
		 fis = new FileInputStream("happy.txt");
		}finally {
			fis.close(); //여기서 트라이케치가 필요없는 이유는 throws(예외를 잡았다)기 떄문에 필요없음. 
		}
	}

}
