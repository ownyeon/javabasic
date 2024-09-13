package javaBasic;

import java.util.Calendar;
import java.util.Scanner;

public class 만나이구하기 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 사용자로부터 생년월일 입력 받기
        System.out.print("출생 연도: ");
        int birthYear = input.nextInt();
        System.out.print("출생 월: ");
        int birthMonth = input.nextInt();
        System.out.print("출생 일: ");
        int birthDay = input.nextInt();
        
        // 현재 날짜를 얻기
        Calendar current = Calendar.getInstance();
        int currentYear  = current.get(Calendar.YEAR);
        int currentMonth = current.get(Calendar.MONTH) + 1; // Calendar.MONTH는 0부터 시작함
        int currentDay   = current.get(Calendar.DAY_OF_MONTH);
        
        // 현재 날짜 출력
        System.out.println("현재 년: " + currentYear);
        System.out.println("현재 월: " + currentMonth);
        System.out.println("현재 일: " + currentDay);

        // 만나이 계산
        int age = currentYear - birthYear;

        // 생일이 아직 지나지 않았으면 나이 조정
        if (birthMonth > currentMonth || (birthMonth == currentMonth && birthDay > currentDay)) {
            age--;
        }

        // 결과 출력
        System.out.println("만나이: " + age);
    }
}
