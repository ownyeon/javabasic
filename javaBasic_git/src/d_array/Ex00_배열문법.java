package d_array;

public class Ex00_배열문법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 번수 선언
//		int [] kor = null; // 초기화 
//		//배열 객체 생성, 참조형은 무조건 new라고 하는 연산자를 통해서 메모리를 확보함. 
//		kor = new int[3];
//		
//		kor[0] = 100;
//		kor[1] = 200;
//		kor[2] = 300; 
		
		
//		int [] kor = new int[3];
//		
//		kor[0] = 100;
//		kor[1] = 200;
//		kor[2] = 300; 
		
		
		//배열 초기화: 배열 변수 선언 + 객체 생성 + 값지정
//		int []kor = new int[] {100,200,300};
		int []kor = {100,200,300};
		
		//총점구하기
		int total = 0; 
		for(int i=0; i<kor.length; i++) {
			total += kor[i];
		}
		System.out.println("총점:" + total);
		

	}

}
