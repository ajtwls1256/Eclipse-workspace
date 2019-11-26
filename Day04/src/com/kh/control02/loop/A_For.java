package com.kh.control02.loop;

import java.util.Scanner;

public class A_For
{
    // 1. for문 (단일 for문)
    // for (초기식 ; 조건식 ; 증감식){
    //        ...실행코드...;
    // }
    
    // 1회전(첫회전 시)
    // 초기식 -> 조건식 확인 -> (조건식이 true일 때) 실행코드 실행 -> 증감식 수행
    
    // 2회전 이후
    // 조건식 확인 -> (조건식이 true일 때) 실행코드 실행 -> 증감식 수행
    
    // 조건식의 결과가 false가 될때까지 반복
    
    Scanner sc = new Scanner(System.in);
    
    public void method1()
    {
        // 1부터 5까지 출력
        
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(i + "번째 반복문 수행");
        }
    }
    
    
    public void method2()
    {
        // 5부터 1까지 출력
        
        for(int i = 5; i >= 1; i--)
        {
            System.out.println(i + "번째 반복문 수행");
        }
    }
    
    
    public void method3()
    {
        for(int i = 1; i <= 10; i++)
        {
            if(i%2 == 1)
                System.out.println(i);
        }
    }
    
    
    public void method4()
    {

        System.out.println("1~9 사이의 정수를 입력하세요 : ");
        int num = sc.nextInt();
        
        if(num < 1 || num > 9) 
        {
            System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
            return;
        }
        
        for(int i = 1; i <= 9; i++)
        {
            System.out.println(num + " * " + i + " = " + num*i );
        }
        
    }
    
    
    public void method5()
    {
        System.out.println("정수 두개를 입력하세요 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        
        if(num1 > num2)
        {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        for(int i = num1; i <= num2; i++)
        {
            sum += i;
        }
        
        System.out.println("입력받은 정수 " + num1 + " 과" + num2 + " 까지의 모든 정수의 합은 " + sum + "입니다.");

        
    }
    
    
    
    // ========================================================================= //
    
    // 2. 중첩 for문
    
    public void method7()
    {
        // 중첩 for문 예시
        // 1부터 5까지 출력되는 문장을 5줄 출력하기
        
        
//        for(int i = 1; i < 6; i++)
//        {
//            for(int j = 0; j < 5 ; j++)
//            {
//                System.out.print(i);
//            }
//            
//            System.out.println();
//        }
        
        
        
        // 중첩 for문 예시
        // 1부터 5까지 출력되는 문장을 5줄 출력하기
      for(int i = 1; i < 6; i++)
      {
          for(int j = 1; j < 6 ; j++)
          {
              System.out.print(j);
          }
          
          System.out.println();
      }
 
        
    }
    
    
    public void method8()
    {
        // 0시 0분부터 23시 59분까지 출력하기
        
        for(int i = 0; i < 24; i++)
        {
            for(int j = 0; j < 60; j++)
            {
                System.out.printf("%d시 %d분\n", i, j);
            }
            
            System.out.println();
        }
        
    }
    
    
    
    public void method9()
    {
        // 한줄에 별표가 5번 출력하는데
        // 사용자가 입력한 수 만큼 줄을 출력
        
        System.out.println("줄 수를 입력하세요 : ");
        int num = sc.nextInt();
        
        for(int i = 0; i < num; i++)
        {
            for(int j=0; j < 5; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
    
    
    
    public void method10()
    {
        System.out.println("줄과 칸 수를 입력하세요 : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
   
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= col; j++)
            {
                
              if(i == j)
              {
                  System.out.print(i);
              }
              else
              {
                  System.out.print("*");
              }
                
            }
   
            System.out.println();
        }
        

    }
    
    
    
    public void method11()
    {
        // 0.0 ~ 1.0 사이의 실수 난수 구하기
        
//        for(int i = 1; i <= 20; i++)
//        {
//            System.out.println( Math.random() );
//        }
        
        // 1 ~ 10 까지의 정수 난수 구하기
//        for(int i = 1; i <= 20; i++)
//        {
//            System.out.println( (int)(Math.random()*10) + 1 );
//        }
        
//        // 0 ~ 10 까지의 정수 난수 구하기
//        for(int i = 1; i <= 20; i++)
//        {
//            System.out.println( (int)(((float)(Math.random()) + 0.5)*10));
//        }
//        
        
    }
    
    public void method12()
    {
        // 1부터 10사이의 임의의 난수를 정해
        // 1부터 난수까지의 정수 합계
        
        
        double random = Math.random();
        int num = (int)(random * 10) + 1;
        int sum = 0;
        
        for(int i = 1; i <= num; i++)
        {
            sum += i;
        }
        
        System.out.println("입력된 난수 : " + random + ", 1부터 난수+1 까지의 합은 : " + sum);
        
        
    }
    
    
    
}
