package 메소드;


public class MethodEx {

	int var1, var2; //멤버 변수들
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx me = new MethodEx();
		int res = me.sum(1000, -10);
		System.out.println("res="+ res);
		
	}

}
