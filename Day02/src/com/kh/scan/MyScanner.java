package com.kh.scan;

import java.util.Scanner;

public class MyScanner
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("int�� �Է����ּ��� : ");
        int i = sc.nextInt();

        
        //System.out.println("�Է��� ���� : " + i);
        
        System.out.println("float�� �Է����ּ��� :");
        float f = sc.nextFloat();
        
        System.out.println("double�� �Է����ּ��� : ");
        double d = sc.nextDouble();
        
        System.out.println("char�� �Է����ּ��� : ");
        char ch = sc.next().charAt(0);
        
        sc.nextLine(); // ���ۺ���
        
        System.out.println("String�� �Է����ּ��� : ");
        String str = sc.nextLine();
        
        
        System.out.println("�Է��� int ���� : " + i);
        System.out.println("�Է��� float ���� : " + f);
        System.out.println("�Է��� double ���� : " + d);
        System.out.println("�Է��� char ���� : " + ch);
        System.out.println("�Է��� String ���� : " + str);
        
    }   
    
}
