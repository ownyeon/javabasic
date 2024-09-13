package e_method;

public class 연습문제recursive {

	public static void main(String[] args) {

		
//		f(4); // 4,3,2,1
//		g(4); // 0,1,2,3,4
//		h(4); //4 2 0 0 2 4 
//		hh(4); //1 2 3 4
		abc(78);
	}

	// 1. f(4)를 호출한다면?
	public static void f ( int N ) {
		System.out.println(N);
		if( N > 0 ) f ( N-1);
		
		//4출력
		// f(N-1)실행
		// f(3)호출, 3
		// f(2)호출, 2
		// f(1)호출, 1
		// f(0)호출, 0
		
	}

	// 2. g(4)를 호출한다면?
	public static void g ( int N) {
		if( N > 0 ) g( N-1);
		System.out.println(N);
		//g(4) -> g(3) 실행
		//g(3) -> g(2) 실행
		//g(2) -> g(1) 실행
		//g(1) -> g(0) 실행
		// 프린트 실행
		// System.out.println(0)
		// 1
		// 2
		// 3
		// 4 
		
	}
//
	// 3. h(4)를 호출한다면?
	public static void h ( int N ) {
		System.out.println(N);
		if( N > 0 ) h ( N -2 );
		System.out.println(N);
		//h(4) 실행 
		//h(4) -> h(2)
		//h(2) -> h(0)
		//h(0)
		//System.out.println(2)
		//System.out.println(4) 
		
		
	}

	// 4. hh(4)를 호출한다면?
	public static void hh ( int N ) {
		if( N > 0 ) {
			hh ( N-1);
			System.out.println(N);
		}
		//hh(4) -> hh(3)실행
		//hh(3) -> hh(2)실행
		//hh(2) -> hh(1)실행
		//hh(1) -> hh(0)실행 
		//프린트 실행
		//0
		//1
		//2
		//3
		//4
	}

	// 5. abc(78)을 호출한다면?
	public static void abc( int N) {
		int r = N % 2; // 78을 나누면 나머지는 0 
		System.out.println("*");
		if( N >= 2 ) abc ( N/2);
		System.out.printf("%d", r);
		return; 
		//78의 나머지 0 
		//1. * 출력
		//78 나누기 2 = 39, abc(39) 호출
		// 0 출력
		
		//39의 나머지 1
		//2. *출력
		//39 나누기 2 = 19, abc(19) 호출
		//39의 나머지 1  출력
		
		//19의 나머지 1
		//3. *출력
		//19 나누기 2 = 9, abc(9) 호출
		//19의 나머지 1 출력
		
		//9의 나머지 1 
		// 4. *출력
		//9 나누기 2 = 4, abc(4) 호출
		//9의 나머지 1 출력
		
		//4의 나머지 0
		// 5. *출력
		//4 나누기 2 = 2, abc(2) 호출
		//4의 나머지 0 출력
		
		//2의 나머지 0
		// 6. *출력
		// 2나누기 2는 = 0 , abc(0)호출
		//2의 나머지 0출력
		
		//0의 나머지 0
		// 7. *출력
		// 0나누기 2는 = 0.
		// 0의 나머지 0 출력 
	}
	
	
//
//	// 6. test ("110100111", 4 )호출한다면?
//	public static  int test( String s, int last ) {
//		if( last < 0 ) return 0;
//		if( s.charAt(last) == '0') return 2 * test ( s, last -1 );
//		return 1 + 2 * test ( s, last - 1);
//	}
//
//	// 7. 무엇을 계산하는 함수인가???
//	public static void t ( int N ) {
//		if( N > 0 ) t ( N/2);
//		System.out.println( N % 2);
//	}

}
