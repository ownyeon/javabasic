package e_method;

public class Ex05_리턴타입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] result = add();
		int sum = result[0] + result[1];
		System.out.println("합:" + sum);
	}
	static int [] add() { //void 자리에 int [] 를 넣어줘야 함. add()의 괄호 안에 파라미터를 넣으려면 위 main에서 값을 가지고 올 때이다. 
		
		int a = 10, b = 20; 
		
		//a,b값을 호출한 곳으로 넘긴다면? 
		int [] data = {a,b};
		return data; //리턴할떄는 딱 하나밖에 가지고가지 못하기 때문에 배열로 가지고 간다. , 이 data 값이 add()안에 들어감 
	}

}
