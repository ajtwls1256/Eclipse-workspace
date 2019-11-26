package com.practice.for01;

import java.util.Scanner;

public class While01
{
//    while(조건문)
//    {
//        실행코드
//    }
//    반복문의 횟수가 정해져있지 않고 특정 조건이 될때까지 무한반복을 사용하기 위해 주로 사용
    
    public void whileTest()
    {
        int i = 0;
        
//        while(i < 3)
//        {
//            System.out.println("hi");
//            
//            i++;
//        }
        
        /*do{
            System.out.println("hi");
          
            i++;
        }while(i < 3);*/

        
    }
    
    Scanner sc = new Scanner(System.in);
    
    
    public void method1()
    {
        int i = 0;
        int sum = 0;
        
        while(i < 5)
        {
            System.out.print("정수 값을 입력하세요 : ");
            int temp = sc.nextInt();
            
            sum += temp;
            
            i++;
        }
        
        System.out.println("입력한 " + i + "개의 정수의 합은 : " + sum);
        
    }
    
    
    public void method2()
    {
        // while문을 이용하여 1~100까지의 수 중에 짝수들의 합을 출력
        // 짝수들의 합은 : 2550
        
        /*int i = 1;
        int sum = 0;
        
        while(i < 101)
        {
            if( i % 2 == 0)
            {
                sum += i;
            }
                  
            i++;
        }
              
        System.out.println("짝수들의 합은 : " + sum);*/

        
        
        
        // 입력한 수까지의 짝수들의 합을 출력
        
        System.out.print("n의 수를 입력 : ");
        int userN = sc.nextInt();
        
        int i = 1;
        int sum = 0;
        
        while(i <= userN)
        {
            if( i % 2 == 0)
            {
                sum += i;
            }
                  
            i++;
        }
        
        System.out.println("짝수들의 합은 : " + sum);

        
    }
    
    
    
    
    
}

