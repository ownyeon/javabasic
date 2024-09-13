package javaBasic;

import java.util.Scanner;

//윤년이란? 
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이다.
//하지만 2000년은 300의 배수이기 때문에 윤년이다. 

//1. 4로 나누어 떨어지면 우선 윤년으로 판단하고, 그 중 400이 아닌 100으로만 나누어 떨어지는 경우를 평년으로 판단한다. 
//2. 윤년이면 1, 아니면 2를 출력한다. 

public class 윤년 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int y = in.nextInt();
        
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            System.out.println("1");  // 윤년일 경우
        } else {
            System.out.println("0");  // 평년일 경우
        }

        in.close();
    }
}