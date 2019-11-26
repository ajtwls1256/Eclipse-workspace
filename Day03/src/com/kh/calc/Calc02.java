package com.kh.calc;

import java.util.Scanner;

public class Calc02
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("첫번째 정수를 입력하세요 : ");
        int first = scanner.nextInt();
        
        System.out.println("두번째 정수를 입력하세요 : " );
        int second = scanner.nextInt();
        
        System.out.println("더하기 결과 : " + (first + second));
        System.out.println("빼기 결과 : " + (first - second));
        System.out.println("곱하기 결과 : " + (first * second));
        System.out.println("나누기 결과 : " + (first / second));
        System.out.println("나머지 결과 : " + (first % second));
                
    }
    
}
