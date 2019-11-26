package com.kh.operator;

import java.util.Scanner;

public class G_Triple
{
    // 항목이 3개 : (조건식) ? 참일 때 사용할 식 : 거짓일 때 사용할 식
    // 조건식은 반드시 결과가 true 또는 false가 나오게 작성
    // 비교/논리연산자 주로 사용
    
    public void method()
    {
        // 입력 받은 정수가 홀수인지 짝수인지 판별 후 출력
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("정수 하나 입력 : ");
        int num = sc.nextInt();
        
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(num + " 은 " + result + " 이다.");
    }
    
    
    public void method2()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("정수 하나 입력 : ");
        int num = sc.nextInt();
        
        // 삼항 연산자 : 조건식 ? 식1 : 식2 ;
        
        String result = (num > 0) ? "양수이다" : "양수가 아니다";
        
        System.out.println(num + " 은/는 " + result);

    }
    
    public void method3()
    {
        // 삼항 연산자 중첩 사용
        
        // 입력받은 정수가 양수, 0, 음수 인지 판별 후 출력
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("정수 하나 입력 : ");
        int num = sc.nextInt();
        
        String result = num == 0 ? "0" :(num > 0) ? "양수" : "음수";
        
        System.out.println(num + " 은/는 " + result);
        
    }
    
    public void method4()
    {
        // 두 수 와 '+', 또는 '-'를 입력받아 알맞은 계산 결과 출력하기
        // 단, '+', '-' 이이의 연산자 입력시 "잘못 입력하셨습니다." 출력
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("첫 번째 수 :");
        int num1 = sc.nextInt();
        
        System.out.println("두 번째 수 :");
        int num2 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("연산자 입력 (+ or -) : ");
        char op = sc.nextLine().charAt(0);
        
        String result = (op == '+') ? (num1 + num2 + "") : (op == '-') ? (num1 - num2 + "") : "잘못 입력하셨습니다.";
        
        System.out.println("결과 : " + result);
    }
    
    
}
