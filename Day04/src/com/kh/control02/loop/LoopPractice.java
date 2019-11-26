package com.kh.control02.loop;

import java.util.Scanner;

public class LoopPractice
{
    
    
    Scanner sc = new Scanner(System.in);
    
    public void practice1()
    {
        // 정수 입력 : 4
        //    *
        //   **
        //  ***
        // ****
        
        System.out.println(" 정수 입력 : ");
        int user = sc.nextInt();
        
        for(int r = 1; r <= user; r++)
        {
            for(int c = user; c >= 1; c--)
            {
               
                if(c - r > 0)
                {
                    System.out.print(" ");  
                }
                else
                {
                    System.out.print("*");
                                  
                }   
            }   
            
//            for(int i = 0; i < r-1; i++)
//                System.out.print("*");
            
            System.out.println();
        }
    }
    
    
    
    
    public void practice2()
    {
        int sum = 0;
//        int totalsum = 0;
        
        for(int i = 1; i <= 10 ; i++)
        {
            for(int j = 1; i - j >= 0; j++)
            {
                sum += j;
            }
        }
        
//        for(int i = 1; i <= 10 ; i++)
//        {
//            
//            sum += i;
//            totalsum += sum;
//            
//        }
        
        System.out.println(sum);
        
    }
    
    
    public void practice3()
    {
        int op1 = 0;
        int op2 = 0;
        
        for(int i = 1; i <= 6 ; i++)
        {
            for(int j = 1; j <= 6; j++)
            {
                if(i + j == 6)
                {
                    System.out.println(i + " + " + j + " = " + '6');
                }
            }
        }
        
        
    }
    
    
    public void practice4()
    {
        // Math.random()을 이용해서 1부터 6까지의 임의의 정수를 value 에 저장
        int value = 0;
        int flag = 0;
        
//        for(int i = 0; flag == 0; i++)
//        {
//            value = (int)(Math.random() * 10) + 1;
//            
//            if(value <= 6)
//                flag = 1;
//        }
        
        value = (int)(Math.random()*6 + 1); // 이게 더 낫다
        
    
        System.out.println(value);
      
        
    }
    
    
    public void practice5()
    {
        // 정수 입력 : 3
        // *
        // **
        // ***
        // **
        // *
        
        System.out.println("정수를 입력하세요 : ");
        int user = sc.nextInt();
        
        
        for(int i = 1; i <= user * 2 -1; i++)
        {
            if(i <= user)
            {
                for(int j = 1;  i >=j; j++)
                {
                    System.out.print("*");   
                }
            }
            else
            {
                for(int j = user * 2 - 1; j - i >= 0; j--)
                {
                    System.out.print("*"); 
                }
            }
            System.out.println();
        }
        
        
        
    }
    
    
}
