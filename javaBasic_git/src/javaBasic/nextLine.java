package javaBasic;

import java.util.Scanner;

public class nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(); // 5 입력 후 엔터
		
		System.out.println("Enter a string: ");
		String text = input.nextLine(); //남아있는 엔터를 읽어버림 

	}

}
