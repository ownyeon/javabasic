package e_method;

public class Ex05_복습 {

	public static void main(String[] args) {
		int data1 = 1000;
		double data2 = 1.99;
		String result = method(data1, data2); //2. 메소드 호출할 때 method로 보냄 
		//6. msg의 값을 result에 저장후 출력
		System.out.println(result);
	}
	
	static String method(int data1, double data2){ //3. 값들이 넘어오니까 파라미터에 넣어줘야 함 .
		//1. data1과 data2의 값을 여기서 출력
		System.out.println(data1); //4. 가지고 온 값이 잘 들어있는지 확인 
		System.out.println(data2);
		
		String msg = "안녕하세요"; //5. 안녕하세요 리턴값 보내기 
		return msg; // return값 보내기 
		
	}

}
