package com.kh.operator;

import java.util.Scanner;

public class A_LogicalNegation
{
    
    // �� ���� ������ : !
    // �� ���� �ݴ�� �ٲٴ� ������
    public void method1() 
    {
        System.out.println("true�� ���� : " + !true);
        System.out.println("false�� ���� : " + !false);
        
        boolean bool1 = false;
        boolean bool2 = true;
        
        System.out.println("bool1 : " + bool1);
        System.out.println("!bool1 : " + !bool1);
        System.out.println("bool2 : " + bool2);
        System.out.println("!bool2 : " + !bool2);
    }
    
    
    // �Է��� ������ 0���� ū ����̸� true�ƴϸ� false ���
    public void method2() 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("���� �Ѱ� �Է� : ");
        int num = sc.nextInt();
        
        System.out.println("�Է��� ������ ����ΰ�? " + (num>0) );
        
        //�ٸ����
        System.out.println("�Է��� ������ ����ΰ�? " + !(num<0) );
        
        
        
    }
    
}
