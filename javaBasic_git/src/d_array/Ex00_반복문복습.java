package d_array;

public class Ex00_반복문복습 {

	public static void main(String[] args) {
		//계산된 상태에서 얘를 정수로 만들어주고 싶은거임 
		//1부터 45라고 한다면 * 45를 하면 된다. 지금은 1부터 10까지. 
//		//for문
//		for(int i=0; i<6; i++) {
//			int temp =  (int)(Math.random() * 45) +1; // 0.0 <= 랜덤값 < 1.0
//			System.out.print(temp + "/");
//		}
		
		//while문 변경
		
//		int a = 0;
//		while(a<6) {
//			int temp =  (int)(Math.random() * 45) +1; // 0.0 <= 랜덤값 < 1.0
//			System.out.print(temp + "/");
//			a++;
//		}
//		
		
		int k=0;
		//do~while문 변경 
		do {
			
			int temp =  (int)(Math.random() * 45) +1; // 0.0 <= 랜덤값 < 1.0
			System.out.print(temp + "/");
			k++;
			
		}while(k<6);
	}

}
