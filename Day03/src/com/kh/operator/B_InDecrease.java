package com.kh.operator;

public class B_InDecrease
{
    // ++ : 1증가, ++값(전위 연산자), 값++(후위 연산자)로 사용한다.
    // -- : 1감소, --값(전위 연산자), 값--(후위 연산자)로 사용한다.
    
    
    
    public void method1()
    {
        // 전위 증감 연산자
        
        int num1 = 10;
        
        System.out.println("증감 연산자 적용 전 : " + num1);
        System.out.println("++num을 1회 수행 후 결과 : " + (++num1) );
        System.out.println("++num을 2회 수행 후 결과 : " + (++num1) );
        System.out.println("++num을 3회 수행 후 결과 : " + (++num1) );
        System.out.println("++num을 4회 수행 후 결과 : " + (++num1) );
        System.out.println("++num을 5회 수행 후 결과 : " + (++num1) );
        System.out.println("전위 증감 연산 수행 후 num1의 값 " + num1 );
        
        
        // 경계선 출력
        System.out.println("=======================================");
        
        
        //후위 증감 연산자
        
        int num2 = 10;
        
        System.out.println("후위 증감 연산자 적용 전 : " + num2);
        System.out.println("num2++을 1회 수행 후 결과 : " + (num2++) );
        System.out.println("num2++을 2회 수행 후 결과 : " + (num2++) );
        System.out.println("num2++을 3회 수행 후 결과 : " + (num2++) );
        System.out.println("num2++을 4회 수행 후 결과 : " + (num2++) );
        System.out.println("num2++을 5회 수행 후 결과 : " + (num2++) );
        System.out.println("후위 증감 연산 수행 후 num2의 값 " + num2 );
        
    }
    
    public void method2()
    {
        int age = 20;
        
        System.out.println("현재 나이는 ? " + age);
        
        System.out.println("++age는 ? " + ++age);
        
        System.out.println("age++는 ?" + age++);
        
        System.out.println("--age는 ? " + --age);
        
        System.out.println("age--는 ? " + age--);
        
        System.out.println("현재 나이는 ? " + age);
    
    }
    
    public void method3()
    {
        int num1 =20;
        int result = num1++ * 3;
        
        System.out.println("result : " + result);
        System.out.println("num1 : " + num1);
        
        int num2 = 20;
        
        int result2 = ++num2 * 3;
        
        System.out.println("result2 : " + result2);
        System.out.println("num2 : " + num2);
        
        
    }
    
    public void method4()
    {
        int a = 10;
        int b = 20;
        int c = 30;
        
        System.out.println(a++);
        
        System.out.println((++a) + (b++));
   
        System.out.println( (a++) + (--b) + (--c) );
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        
    }
    
    
}
