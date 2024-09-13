package d_array;

public class Ex99_정렬 {

	public static void main(String[] args) {

	//두 변수의 값 맞바꾸기 (swapping) 
		/*
		 * int a = 5, b= 6; 
		 * int temp = a; 
		 * a=b;
		 * b = temp;
		 * 
		 */
		int [] lotto = {45, 2, 15,27, 10, 42};
		
		//버블정렬 
		for(int i=lotto.length -1; i>0; i--) {// 5 4 3 2 1 
			for(int j=0; j< i; j++) { //앞에서부터 비교, 5 4 3 2 1 한 값을 5보다 작을 동안 j가 도는 거임 
				if(lotto[j] > lotto[j+1]){
					//앞에있는애가 바로 뒤에있는 애보다 크면 맞바꿀 것임 
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp; 
					// 0번째와 1번째를 비교해서 0번째가 더 크면 맞바꿔야함. 
				}
			}
		}
	
		
		
		
		for(int a=0; a<lotto.length; a++) {
			System.out.print(lotto[a] + " ");
		}
		
		
		
		
	}

}

/*[예시] bubble sort
 * 정보처리기사를 시험볼 거면 같이 공부 
 *[원리] insert sort
 * 		select sort 
 * 
 * 
 * 
 */
