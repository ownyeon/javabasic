package 주석문과제어문;

public class WhileEx1 {

	public static void main(String[] args) {
		int sum,su;
		sum = su = 0;
		
		while(su <= 100) {
			sum+= su;
			su++;
		}
		System.out.println("1~100까지의 합:" + sum);
	}
}
