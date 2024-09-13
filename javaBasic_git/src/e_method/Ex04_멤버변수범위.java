package e_method;

public class Ex04_멤버변수범위 {

	static int a= 10, b = 20; //main밖에서 하면 범위 안에서 다 쓸 수 있음.  
	static int sum; //자동초기화 (전역변수) 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(); 
		System.out.println("합: " + sum);
	
	}
	static void add() {
		//인자를 보내서 파라미터를 받고, 리턴값을 받음. 
		sum =  a+ b; 
	}

}
