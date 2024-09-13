package javaBasic;

import java.util.Scanner;

public class 선택문제 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2개의 숫자 입력받기
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // num1이 더 크면 두 값을 교환
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // 구구단 출력
        for (int i = 1; i <= 9; i++) {
            for (int j = num1; j >= num2; j--) {
                System.out.printf("%d * %d = %2d   ", j, i, j * i);  // 구구단 사이 공백 3칸
            }
            
            System.out.println();  // 줄 바꿈
        }
    }
}
