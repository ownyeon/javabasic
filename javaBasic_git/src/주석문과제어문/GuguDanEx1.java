package 주석문과제어문;

import java.util.Scanner;

public class GuguDanEx1 {

	public static void main(String[] args) {
		System.out.println("인수입력: ");
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		System.out.println(dan + "단");
		System.out.println("------------------");
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
			
		}
	}

}
