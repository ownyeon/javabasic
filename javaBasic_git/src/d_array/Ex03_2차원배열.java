package d_array;

public class Ex03_2차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [][] alpha = new char[3][4]; //4칸을 뜻하는 애를 3줄로 만들고 싶은 거임. 
	
		
		char ch = 'A';
		
		//값 입력 , 배열이 2개면 for문도 2개여야 함. 
		for(int i=0; i<alpha.length; i++) {
			for(int j=0; j<alpha[i].length; j++) { //i번째에 j값이니까. 타고타고 들어가면 저렇게 쓰면 된다. 원래는 값이 4(칸) 
				alpha[i][j] = ch;
				ch++;
			}
		}
		
		//값 출력
		for(int i=0; i<alpha.length; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(alpha[i][j] + " ");
				}
			System.out.println();
		}

		
	}

}
