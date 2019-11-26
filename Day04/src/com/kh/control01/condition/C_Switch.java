package com.kh.control01.condition;

import java.util.Scanner;

public class C_Switch
{
    // swtich�� if���� ���� ���ǹ��̴�.
    
    // �ٸ� if������ ��������
    // if���� ������ ������ ������ �� �־���.
    // ������ switch���� Ȯ���� ���� �����̿��� �Ѵ�.
    
    //switch��
    //
    // switch(���� ���� �����){
    // case ��1 : �����ڵ�1; break;
    // case ��2 : �����ڵ�2; break;
    //
    // ...
    // default : �����ڵ�3
    // }
    
    // ���� ����� == ��1, �����ڵ�1�� �����ϰ� break�� �޾� �������´�.
    
    Scanner sc = new Scanner(System.in);
    
    public void method1()
    {
        System.out.println("1~3 ������ ������ �Է��ϼ���: ");
        int num = sc.nextInt();
        
        switch(num)
        {
            case 1: System.out.println("������ �Դϴ�.");
            break;
            case 2: System.out.println("�Ķ��� �Դϴ�.");
            break;
            case 3: System.out.println("�ʷϻ� �Դϴ�.");
            break;
            
            default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
        }
    
    }
    
    public void method2()
    {
        System.out.println("���� �ΰ��� �����ȣ�� �Է��ϼ���: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        //sc.nextLine();
        char op = sc.nextLine().charAt(1);
        
        switch(op)
        {
            case '+': System.out.println("num1" + op + "num2 = " + (num1+num2));
                break;
            case '-': System.out.println("num1" + op + "num2 = " + (num1-num2));
                break;
            case '*': System.out.println("num1" + op + "num2 = " + (num1*num2));
                break;
            case '/': System.out.println("num1" + op + "num2 = " + (num1/num2));
                break;
            case '%': System.out.println("num1" + op + "num2 = " + (num1%num2));
                break;
                
            default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
        }
        
    }
    
    public void method3()
    {
        System.out.println("���� �Է��ϼ���: ");
        int month = sc.nextInt();
        int ��;
        
        switch(month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: �� = 31;
                break;
                
            case 4: case 6: case 9: case 11: �� = 30;
                break;
            case 2: �� = 29;
                break;
            default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
        }
        
        System.out.println(month + "���� �ϼ��� " + �� + "�� �Դϴ�.");
            
    }
    
    
    
    
    
    
    
}
