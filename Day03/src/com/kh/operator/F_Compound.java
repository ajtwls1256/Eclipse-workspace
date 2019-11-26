package com.kh.operator;

public class F_Compound
{
    // 복합 대입 연산자
    // 다른 연산자와 대입연산자를 함께 사용하는 연산자를 말함
    // 산술대입연산자 : +=, -=, *=, /=, %=
    // 연산처리 속도가 훨씬 빠르므로 사용 권장함
    
    // 증감 연산자(++, --)와 비슷해 보이지만 증감연산자는 값을 1씩만 증감시킨다.
    // 하지만 복합대입연산자는 내가 원하는 숫자만큼 증감시킬 수 있다.
    
    public void method()
    {
        int num = 12;
        System.out.println("num : " + num);
        
        //num을 3 증가시키기
        num = num + 3;
        System.out.println("num + 3 : " + num);
        
        num += 3;
        System.out.println("num += 3 : " + num);
                                      
        num -= 5;                     
        System.out.println("num -= 5 : " + num);
                                      
        num *= 6;                    
        System.out.println("num *= 6 : " + num);
                                     
        num /= 2;                     
        System.out.println("num /= 2 : " + num);
                                      
        num %= 4;                    
        System.out.println("num %= 4 : " + num);
        
    }
    
}
