package com.kh.calc;

import java.util.Scanner;

public class Calc04
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("첫번째 수 입력 : ");
        int a = scanner.nextInt();
        
        System.out.println("두번째 수 입력 : ");
        int b = scanner.nextInt();
        
//        if(a != b)
//        {
//            System.out.println("참 입니다.");
//        }
//        
//        if(b >= a)
//        {
//            System.out.println("참 입니다.");
//        }
//        
//        if(a == b)
//        {
//            System.out.println("거짓 입니다.");
//        }
//        
//        if(b <= a)
//        {
//            System.out.println("거짓 입니다.");
//        }
        
        if(a % 2 == 0)
        {
            System.out.println("a는 2의 배수입니다.");
        }
        else
        {
            System.out.println("a는 2의 배수가 아닙니다.");
        }
    
        if(b % 3 == 0)
        {
            System.out.println("b는 3의 배수입니다.");
        }
        else
        {
            System.out.println("b는 3의 배수가 아닙니다.");
        }
        
     
        
        
    }
    
}
