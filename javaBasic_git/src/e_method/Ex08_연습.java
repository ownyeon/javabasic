package e_method;
//오버로딩 연습 

public class Ex08_연습 {

	public static void main(String[] args) {
		
		multiple(2,3);
		multiple(4, 'ㅋ');
		multiple(2, 3, 'ㅋ');

	}
	static void multiple(int a, int b) {
		System.out.println(a*b);
	}
	static void multiple(int a, char ch) {
		for(int i=0; i<a; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	static void multiple(int n, int m, char ch) {
		//ㅋㅋㅋ
		//ㅋㅋㅋ
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
