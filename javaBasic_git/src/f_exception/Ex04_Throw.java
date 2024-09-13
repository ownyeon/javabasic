package f_exception;

public class Ex04_Throw {

	public static void main(String[] args) {

		try {
			readMessage();
		}catch(Exception ex) {
			System.out.println("실패" + ex.getMessage());
		}
		System.out.println("프로그램 종료");
	}

	//예외를 던져라
	static void readMessage() throws Exception{
		String [] str = {"안녕하세요","올라","하이"};
		try {
			for(int i=0; i<=str.length; i++) {  //1. 문제가 여기되는 애들 try로 잡기 
				System.out.println(str[i]);
			}
		}catch(Exception ex) {

			//내가 만든 예외를 발생을 시킬거야, 새로운 자바 파일을 만듦. 
			throw new MyException();
		}
	}

}
