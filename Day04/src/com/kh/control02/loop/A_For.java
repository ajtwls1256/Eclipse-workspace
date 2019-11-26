package com.kh.control02.loop;

import java.util.Scanner;

public class A_For
{
    // 1. for�� (���� for��)
    // for (�ʱ�� ; ���ǽ� ; ������){
    //        ...�����ڵ�...;
    // }
    
    // 1ȸ��(ùȸ�� ��)
    // �ʱ�� -> ���ǽ� Ȯ�� -> (���ǽ��� true�� ��) �����ڵ� ���� -> ������ ����
    
    // 2ȸ�� ����
    // ���ǽ� Ȯ�� -> (���ǽ��� true�� ��) �����ڵ� ���� -> ������ ����
    
    // ���ǽ��� ����� false�� �ɶ����� �ݺ�
    
    Scanner sc = new Scanner(System.in);
    
    public void method1()
    {
        // 1���� 5���� ���
        
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(i + "��° �ݺ��� ����");
        }
    }
    
    
    public void method2()
    {
        // 5���� 1���� ���
        
        for(int i = 5; i >= 1; i--)
        {
            System.out.println(i + "��° �ݺ��� ����");
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

        System.out.println("1~9 ������ ������ �Է��ϼ��� : ");
        int num = sc.nextInt();
        
        if(num < 1 || num > 9) 
        {
            System.out.println("1~9 ������ ����� �Է��Ͽ��� �մϴ�.");
            return;
        }
        
        for(int i = 1; i <= 9; i++)
        {
            System.out.println(num + " * " + i + " = " + num*i );
        }
        
    }
    
    
    public void method5()
    {
        System.out.println("���� �ΰ��� �Է��ϼ��� : ");
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
        
        System.out.println("�Է¹��� ���� " + num1 + " ��" + num2 + " ������ ��� ������ ���� " + sum + "�Դϴ�.");

        
    }
    
    
    
    // ========================================================================= //
    
    // 2. ��ø for��
    
    public void method7()
    {
        // ��ø for�� ����
        // 1���� 5���� ��µǴ� ������ 5�� ����ϱ�
        
        
//        for(int i = 1; i < 6; i++)
//        {
//            for(int j = 0; j < 5 ; j++)
//            {
//                System.out.print(i);
//            }
//            
//            System.out.println();
//        }
        
        
        
        // ��ø for�� ����
        // 1���� 5���� ��µǴ� ������ 5�� ����ϱ�
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
        // 0�� 0�к��� 23�� 59�б��� ����ϱ�
        
        for(int i = 0; i < 24; i++)
        {
            for(int j = 0; j < 60; j++)
            {
                System.out.printf("%d�� %d��\n", i, j);
            }
            
            System.out.println();
        }
        
    }
    
    
    
    public void method9()
    {
        // ���ٿ� ��ǥ�� 5�� ����ϴµ�
        // ����ڰ� �Է��� �� ��ŭ ���� ���
        
        System.out.println("�� ���� �Է��ϼ��� : ");
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
        System.out.println("�ٰ� ĭ ���� �Է��ϼ��� : ");
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
        // 0.0 ~ 1.0 ������ �Ǽ� ���� ���ϱ�
        
//        for(int i = 1; i <= 20; i++)
//        {
//            System.out.println( Math.random() );
//        }
        
        // 1 ~ 10 ������ ���� ���� ���ϱ�
//        for(int i = 1; i <= 20; i++)
//        {
//            System.out.println( (int)(Math.random()*10) + 1 );
//        }
        
//        // 0 ~ 10 ������ ���� ���� ���ϱ�
//        for(int i = 1; i <= 20; i++)
//        {
//            System.out.println( (int)(((float)(Math.random()) + 0.5)*10));
//        }
//        
        
    }
    
    public void method12()
    {
        // 1���� 10������ ������ ������ ����
        // 1���� ���������� ���� �հ�
        
        
        double random = Math.random();
        int num = (int)(random * 10) + 1;
        int sum = 0;
        
        for(int i = 1; i <= num; i++)
        {
            sum += i;
        }
        
        System.out.println("�Էµ� ���� : " + random + ", 1���� ����+1 ������ ���� : " + sum);
        
        
    }
    
    
    
}
