package c_control;

/*
 * break : 블럭을 벗어나는 문장 
 * continue : 블럭의 끝으로 이동하는 문장 
 * 
 * 
 */


public class Ex10_BreakContunue {

	public static void main(String[] args) {

		//바깥에 있는 for문을 한꺼번에 벗어나고 싶으면
		//END: 라벨이 부착되어져 있는 반복문 통으로 벗어남
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				if(j==1) continue; //break END; 
				System.out.printf("< %d, %d > \n", i, j);
			}
			System.out.println("데이타");
		}
		
		//i값이 0일때 내부j값은0 j==1이 거짓이기 때문에 <0,0> 출력, 그리고 1일때 continue로 출력하지 않고 2일때 출때 출력 <0,2> 데이타 
		//i값이 1일때 내부j값이0, j==1이 거짓이기 떄문에 <1,0> 출력, 그리고 1일때 continue (블록 끝으로 이동)출력하지 않고 2일때 출력<1,2> 데이타 
		
		
		
		
		//---- break; 
		//출력 <0,0>
		//	  데이타
		//   <1,1>
		//	 데이타 
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<3; j++) {
//				if(j==1) break; //break END; 
//				System.out.printf("< %d, %d > \n", i, j);
//			}
//			System.out.println("데이타");
//		}
		
		//첫번째 for문 
		//i값이 0일때 j값도 0 j=1이 거짓이므로 <0,0> 출력, 그 다음 j는 1이 된다. 
		// j=1이 되어, 조건 j=1이 참이므로 break; 실행, j루프를 빠져 나오고 데이타 출력 
		
		//두번째 for문
		//i값이 1일때 내부 for문이 새롭게 시작되기 때문에 j는 다시 0으로 초기화된다. 
		//j값이 0, j==1 거짓이기 떄문에 출력문 실행 <1,0>, j는 1이 됨. 
		//j루프를 빠져 나오고 데이타가 출력 
		
		//세번째 for문은 2보다 작기 때문에 실행되지 않음.
		
		
		
		
	}

}
