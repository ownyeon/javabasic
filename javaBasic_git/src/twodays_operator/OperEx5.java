package twodays_operator;

public class OperEx5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//우선적으로 &&연산자의 왼쪽에 있는 조건부터 연산에 참여한다. 
		//((a+=12 >b)가 true일 경우 && 연산자의 오른쪽 조건을 수행하여 그 결과값이 true가 아니면 false를 변수 c에 대입하지만
		//만약 선조건에서 false이면 &&연산자의 오른쪽 조건을 절대 수행하지 않고 변수 c에 false를 대입하고 끝난다. 
		boolean c = ((a+=12) > b) && (a==(b+=2)); //a=22, b=22 
		System.out.println("c=" + c); //true
		
		System.out.println("a="+  a); //22
		
		System.out.println("b=" + b); //22

	}

}
