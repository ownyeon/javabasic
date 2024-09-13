package 주석문과제어문;

public class ContinueEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		label: //레이블 설정
			for(int i=0; i < 5; i++) {
				for(int j=0; j<5; j++) {
					if(j==3) {
						continue label;
					}
					System.out.println("i값:" + i + " j값: " + j);
				}
			}
			
	}

}
