package com.kh.operator;

import java.util.Scanner;

public class E_Logical
{
   /*
    *  - �� �� �ΰ��� ���ϴ� ������
    AND : &&(�׸���, ~�鼭)
    OR : ||(�Ǵ�, ~�ų�)
    ���� && ����, ���� || ����
    */
    
    public void �Լ�1()
    {
        // �Է��� �������� 1~100������ �������� Ȯ���ϱ�
        
        Scanner ��ĳ�� = new Scanner(System.in);
        
        System.out.println("���� �ϳ� �Է� : ");
        int ����1 = ��ĳ��.nextInt();
        
        // && : �ΰ��� ������ ��� true���� && ������ ������� true
        //      �ϳ��� ������ false�� �Ǹ� &&������ ������� false
        
        boolean ���̳� = (����1 >= 1) && (����1 <= 100);
        
        System.out.println("1���� 100�������� Ȯ�� : " + ���̳�);
        
        
    }
    
    public void �Լ�2()
    {
        // �Է��� ���� ���� �빮������ Ȯ��
        
        Scanner ��ĳ�� = new Scanner(System.in);
        
        //���� �ϳ� �Է� �ޱ�
        System.out.println("���� �ϳ� �Է� : ");
        char ����1 = ��ĳ��.nextLine().charAt(0);
        
        boolean ������ = (����1 >= 'A') && (����1 <= 'Z');
        System.out.println("���� �빮�� Ȯ�� : " + ������);
        
        System.out.println("��� �Ͻ÷��� yȤ�� Y�� �Է��ϼ��� : ");
        char ����2 = ��ĳ��.next().charAt(0);
        
        System.out.println("������ y���� Ȯ�� : " + (����2 == 'y' || ����2 == 'Y'));

        
        
    }
    
    public void �Լ�3()
    {
        // &&�� ||�� ���� ����� ���������� ���� �ڸ� ���� ���ϱ⵵ ��
        // ���� && ���� : ���� ����� false�̸� �ڸ� ���� ���ϰ�
        // ���� || ���� : ���� ����� true�̸� �ڸ� ���� ����
        
        int ����1 = 10;
        
        System.out.println("&& ���� �� num : " + ����1);
        
        boolean ���1 = false && ++����1 >0;
        
        System.out.println("result1 Ȯ�� : " + ���1);
        
        System.out.println("&& ���� �� num : " + ����1);
        
        System.out.println();
        
        System.out.println("|| ���� �� num : " + ����1);
        boolean ���2 = true || ++����1 > 0;
        System.out.println("result2 Ȯ�� : " + ���2);
        
        System.out.println("|| ���� �� num : " + ����1);
        
    }
    
    public void �Լ�4()
    {
        int ����1 = 2;
        int ����2 = 3;
        
        boolean ��1 = ����1 > ����2;                // false
        boolean ��2 = ++����1 <= ����2++;           // true ����1 = 3, ����2 = 3->4
        
        System.out.println("(a % b ) == 1 : " + ((����1 % ����2) == 1));                    //false
        System.out.println("(a == 3) && (b == 4) : " + ((����1 == 3) && (����2 == 4)));     //true
        System.out.println("!d || (a - b) > 0 : " + (!��2 || (����1 - ����2) > 0));       //false
        
        System.out.println();
        
        System.out.println("!(c == d) && ((a * b) == 10) || (b % 2 == 0)) : " + (!(��1 == ��2) && ((����1 *  ����2) == 10) || (����2 % 2 == 0)));
        // true
        
    }
    
    
    
    
}
