package com.kh.operator;

public class D_Comparison
{
    // 비교 연산자 ( 관계 연산자)
    // 두 값을 비교하는 연산자, 다른 말로 관계 연산자 라고도 함
    // 비교 언산자는 조건을 만족하면 true, 아니면 false 를 반환함
    
    public void method1()
    {
        int a = 10;
        int b = 25;
        
        boolean result1, result2, result3;
        
        result1 = (a == b);
        result2 = (a <= b);
        result3 = ( a > b );
        
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        
        System.out.println("b는 짝수인가? " + ((b%2) == 0));
        System.out.println("a는 홀수인가? " + ((a%2) == 1));
        
    }
}
