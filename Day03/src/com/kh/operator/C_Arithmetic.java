package com.kh.operator;

public class C_Arithmetic
{
    // 계산할 때 사용되는 연산자들
    // 사칙연산에 %(modulurs)가 추가
    
    public void method1()
    {
        int num1 = 10;
        int num2 = 3;
        
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        
        // '/' 연산자 : 나누었을 때 몫을 구하는 연산자
        System.out.println("num1 / num2 = " + (num1 / num2));
        
        // '%' 연산자 : 나누었을 때 나머지를 구하는 연산자
        System.out.println("num1 % num2 = " + (num1 % num2));
        
        
        // '%' 연산자를 주로 사용하는 경우
        // 값 % 배수 == 0
        // 짝수? ==> 값 % 2 == 0 or 값 % 2 != 1
        // 홀수? ==> 값 % 2 == 1 or 값 % 2 != 0
        // 5의 배수 ==> 값 % 5 == 0
        
    }
    
    public void method2()
    {
        double dNum1 = 35;
        double dNum2 = 10;
        
        System.out.println("dNum1 = " + dNum1);
        System.out.println("dNum2 = " + dNum2);
        
        double add = dNum1 + dNum2;
        System.out.println("dNum1 + dNum2 = " + add);
        
        double sub = dNum1 - dNum2;
        System.out.println("dNum1 - dNum2 = " + sub);
        
        double mul = dNum1 * dNum2;
        System.out.println("dNum1 * dNum2 = " + mul);
        
        double div = dNum1 / dNum2;
        System.out.println("dNum1 / dNum2 = " + div);
        
        double mod = dNum1 % dNum2;
        System.out.println("dNum1 % dNum2 = " + mod);
        
        double dNum3 = 27;
        System.out.println("dNum3 = " + dNum3);
        
        double result = dNum1 + dNum1 * dNum2 % dNum3 - dNum1 / dNum2;
        
        System.out.println("result = " + result);
        
        
    }

    public void method3() 
    {
        int a = 5;
        int b = 10;
        
        int c = (++a) + b; // c =16
        int d = c / a;     // d = 2
        
        int e = c % a;     // e = 4
        
        int f = e++;      // f = 4
        
        int g = (--b) + (d--); // g = 11
        
        int h = 2;
        
        int i = a++ + b / (--c / f) * (g-- - d) % (++e + h); // 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
                                                             // 6 + 9 / 3 * 10 % 8
                                                             // 6 + 6 =12
                                                             
        
        System.out.println("a : " + a); // 7
        System.out.println("b : " + b); // 9
        System.out.println("c : " + c); // 15
        System.out.println("d : " + d); // 1
        System.out.println("e : " + e); // 6
        System.out.println("f : " + f); // 4
        System.out.println("g : " + g); // 10
        System.out.println("h : " + h); // 2
        System.out.println("i : " + i); // 7
        
    }
    
    
}
