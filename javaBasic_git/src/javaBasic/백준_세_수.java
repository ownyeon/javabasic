package javaBasic;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_세_수 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int arr[] = {input.nextInt(), input.nextInt(), input.nextInt()};
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
		
		

	}

}
