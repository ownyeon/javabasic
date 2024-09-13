package d_array;

public class Ex03_로또 {

	public static void main(String[] args) {

		int lotto[][] = new int [5][6]; //5줄에 6칸
		
		//값지정: 임의의 값, 중복값 배제 
		for(int i=0; i<lotto.length; i++) {
			DESC: for(int j=0; j<lotto[i].length;j++) { 
			//2차원배열이니까 임의의 값 지정
			lotto[i][j] = (int)(Math.random()*45) +1; //1번부터 45번
			
			//중복체크, j로 비교해주고 있는 거임 
			for(int k=0; k<j; k++) {
				if(lotto[i][j] == lotto[i][k]) {
					j--;
					continue DESC;
				}
			}
		}
	}
		
		
		
		//값 출력
		for(int i=0; i<lotto.length; i++) { // 행 
			for(int j=0; j<lotto[i].length;j++) { 
				System.out.print(lotto[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
	}

}
