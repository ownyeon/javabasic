package c_control;

public class Ex05_for_개념 {

	public static void main(String[] args) {

		/*
		int result = 0;
		for(int a=1; a<=10; a++ ) {
//			System.out.println(a);
			
			result = result + a;
		}
		System.out.println("결과:" + result);
		*/
		
		//1부터 10까지의 홀수(odd)의 합과 짝수(even)의 합 구하기 
		int odd =0, even=0;
		
		for(int i=1; i<=10; i++) {
			//2로 나누었을 때 나머지가 1이면 홀수, 아니면 짝수 
			if(i%2==1) {
				odd += i; //홀수
			}else {
				even += i; //짝수 
			}
				}
//		for(int i=1; i<=10; i+=2) {
//			odd += i;
//			even += (i+1);
//		}
		
		System.out.println("홀수의 합: " +odd);
		System.out.println("짝수의 합: "+ even);
		
		
		
//		for(int a=10; a > 0; a=a-2) {
//			System.out.println(a);
//		}
//		
//		for(char a='Z'; a >= 'A'; a--) {
//			System.out.println(a);
//		}
		
//		for(char ch='A'; ch<='Z'; ch++) {
//			System.out.print(ch);
//		}
//		for(char ch='가'; ch<='힣'; ch++) {
//			System.out.print(ch);
//		}
	}

}
