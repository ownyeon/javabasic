package twodays_operator;

public class FloatEx2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		boolean c = a<b;
		System.out.println("a<b: " + c);
		
		c = a != b; 
		System.out.println("a != b: " +c); //초기화. 이미 선언된 변수 c에 a값과 b값이 서로 다르다면 true 값을 대입하고 그렇지 않을 경우에는 false값을 변수 c에 대입한다. 
	}

}
