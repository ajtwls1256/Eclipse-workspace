package com.kh.operator;

import java.util.Scanner;

public class A_LogicalNegation
{
    
    // 논리 부정 연산자 : !
    // 논리 값을 반대로 바꾸는 연산자
    public void method1() 
    {
        System.out.println("true의 부정 : " + !true);
        System.out.println("false의 부정 : " + !false);
        
        boolean bool1 = false;
        boolean bool2 = true;
        
        System.out.println("bool1 : " + bool1);
        System.out.println("!bool1 : " + !bool1);
        System.out.println("bool2 : " + bool2);
        System.out.println("!bool2 : " + !bool2);
    }
    
    
    // 입력한 정수가 0보다 큰 양수이면 true아니면 false 출력
    public void method2() 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("정수 한개 입력 : ");
        int num = sc.nextInt();
        
        System.out.println("입력한 정수가 양수인가? " + (num>0) );
        
        //다른방법
        System.out.println("입력한 정수가 양수인가? " + !(num<0) );
        
        
        
    }
    
}
