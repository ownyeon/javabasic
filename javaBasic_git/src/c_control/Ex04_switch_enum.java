package c_control;

enum Size{ //이너미라는 타입을 너네가 만들어봐, 가독성 읽기가 편하기 때문에 사용하는 거임 
	SALL,
	MEDIUM,
	LARGE
}

public class Ex04_switch_enum {

	public static void main(String[] args) {
		Size size = Size.SALL; //화면에서 넘어오는 값 상상하기 , 스몰 버튼이 눌렸을 때 Size.SALL이 값으로 처리
		
		switch(size) {
		case SALL: System.out.println("작은거"); break; 
		case MEDIUM: System.out.println("중간거"); break;
		case LARGE: System.out.println("큰거"); break; 
		}
		
		/*
		 * small : 1, medium : 2, large : 3으로 프로그램 처리 
		 */
//		int size = 1; //화면에서 넘어오는 값 상상하기 
//		
//		switch(size) {
//		case 1: System.out.println("작은거"); break; 
//		case 2: System.out.println("중간거"); break;
//		case 3: System.out.println("큰거"); break; 
//		}

	}

}
