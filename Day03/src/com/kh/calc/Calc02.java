package com.kh.calc;

import java.util.Scanner;

public class Calc02
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ù��° ������ �Է��ϼ��� : ");
        int first = scanner.nextInt();
        
        System.out.println("�ι�° ������ �Է��ϼ��� : " );
        int second = scanner.nextInt();
        
        System.out.println("���ϱ� ��� : " + (first + second));
        System.out.println("���� ��� : " + (first - second));
        System.out.println("���ϱ� ��� : " + (first * second));
        System.out.println("������ ��� : " + (first / second));
        System.out.println("������ ��� : " + (first % second));
                
    }
    
}
