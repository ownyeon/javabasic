package b_operator;

public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
//		System.out.println("A=" + a + ", B=" + b);
//		System.out.println("A=" + a + 1 + ", B=" + b + 1); //그냥 문자열 더하기를 한 것임 
//						//  A=51 
//		System.out.println("A=" + (a+1) + ", B=" + (b+1)); //[주의] 

//아래 연산자 3개 다 같은 코딩임 
//		a = a + 1;
//		b = b - 1;
//		System.out.println("A=" + a + ", B=" + b);
//		
		//증가감소연산자
		a++;
		b--;
		System.out.println("A=" + a + ", B=" + b);

		++a;
		--b;
		System.out.println("A=" + a + ", B=" + b);
		
		
		
		//-----------------------------------------------
		int z = 10, y = 10; 
		int result = ++z;
		System.out.println(result); //앞에 있으면 먼저 계산, z=z+1; int result = z;
		
		int result2 = y++; 
		System.out.println(result2); //뒤에 있으면 늦게 계산 int result2 = y; y=y+1; y를 대입하고 계산. 대입한게 먼저 출력 되니까 10. 
		
		System.out.println("Z="+ z + ",Y=" +y); //11, 11
		
		System.out.println("Z="+ ++z + ",Y=" + --y); //12, 10 
		System.out.println("Z="+ z++ + ",Y=" + y--); //12, 10
		
		System.out.println("Z="+ z + ",Y=" + y); 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
