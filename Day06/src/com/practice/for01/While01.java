package com.practice.for01;

import java.util.Scanner;

public class While01
{
//    while(���ǹ�)
//    {
//        �����ڵ�
//    }
//    �ݺ����� Ƚ���� ���������� �ʰ� Ư�� ������ �ɶ����� ���ѹݺ��� ����ϱ� ���� �ַ� ���
    
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
            System.out.print("���� ���� �Է��ϼ��� : ");
            int temp = sc.nextInt();
            
            sum += temp;
            
            i++;
        }
        
        System.out.println("�Է��� " + i + "���� ������ ���� : " + sum);
        
    }
    
    
    public void method2()
    {
        // while���� �̿��Ͽ� 1~100������ �� �߿� ¦������ ���� ���
        // ¦������ ���� : 2550
        
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
              
        System.out.println("¦������ ���� : " + sum);*/

        
        
        
        // �Է��� �������� ¦������ ���� ���
        
        System.out.print("n�� ���� �Է� : ");
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
        
        System.out.println("¦������ ���� : " + sum);

        
    }
    
    
    
    
    
}

