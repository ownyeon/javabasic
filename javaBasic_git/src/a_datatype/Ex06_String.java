package a_datatype;


/*
 * [주의] String 이름으로 클래스명 지정하면 안된다. 
 * 
 * [데이터타입 - 자료형]
 * 1. 기본형 -> 스택에 메모리를 잡음 
 * 2. 참조형 : 배열, 클래스 -> 힙에 메모리를 잡고, 주소값만 딸랑 가지고 있음. 
 * 		-> 반드시 new 예약어를 메모리 확보를 해야 한다. 
 * 
 * 	*String은 제공하는 클래스 
 * 
 * */

public class Ex06_String {

	public static void main(String[] args) {

		int age = 30; 
		
		//[1] 클래스변수 선언
		//[2] 메모리를 확보
		String name;
		name = new String("홍길동"); //new를 만나면 자유 동간인 [힙]에 잡혀진다. 메모리에 주소가 있는데, 그 주소값을 name에 넣음(스택에 주소를 따라서 힙에 주소를 찾아감)
		
		String name2= new String("홍길동"); 
		
		/*
		 * name 변수의 값과 name2 변수의 값이 같다면 "이름이 같다" 출력
		 * 그렇지 않다면 "이름이 다르다" 출력
		 * => 다르다고 나오는 게 맞음, 왜 다르게 나오는가? 변수 안에는 주소값이 들어있는 거임. 그래서 이름이 같다가 아닌 주소가 같다로 물어봐야 한다. 
		 * */
		
		
		if(name == name2) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 다르다.");
		}
		
		//문자열값을 비교한다면???
		if(name.equals(name2)) {
			System.out.println("이름이 같다");
		}else {
			System.out.println("이름이 다르다.");
		}
	}

}
