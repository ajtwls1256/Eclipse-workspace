package com.kh.calc;

import java.util.Scanner;

public class Calc04
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ù��° �� �Է� : ");
        int a = scanner.nextInt();
        
        System.out.println("�ι�° �� �Է� : ");
        int b = scanner.nextInt();
        
//        if(a != b)
//        {
//            System.out.println("�� �Դϴ�.");
//        }
//        
//        if(b >= a)
//        {
//            System.out.println("�� �Դϴ�.");
//        }
//        
//        if(a == b)
//        {
//            System.out.println("���� �Դϴ�.");
//        }
//        
//        if(b <= a)
//        {
//            System.out.println("���� �Դϴ�.");
//        }
        
        if(a % 2 == 0)
        {
            System.out.println("a�� 2�� ����Դϴ�.");
        }
        else
        {
            System.out.println("a�� 2�� ����� �ƴմϴ�.");
        }
    
        if(b % 3 == 0)
        {
            System.out.println("b�� 3�� ����Դϴ�.");
        }
        else
        {
            System.out.println("b�� 3�� ����� �ƴմϴ�.");
        }
        
     
        
        
    }
    
}
