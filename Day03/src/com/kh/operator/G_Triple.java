package com.kh.operator;

import java.util.Scanner;

public class G_Triple
{
    // �׸��� 3�� : (���ǽ�) ? ���� �� ����� �� : ������ �� ����� ��
    // ���ǽ��� �ݵ�� ����� true �Ǵ� false�� ������ �ۼ�
    // ��/�������� �ַ� ���
    
    public void method()
    {
        // �Է� ���� ������ Ȧ������ ¦������ �Ǻ� �� ���
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("���� �ϳ� �Է� : ");
        int num = sc.nextInt();
        
        String result = (num % 2 == 0) ? "¦��" : "Ȧ��";
        System.out.println(num + " �� " + result + " �̴�.");
    }
    
    
    public void method2()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("���� �ϳ� �Է� : ");
        int num = sc.nextInt();
        
        // ���� ������ : ���ǽ� ? ��1 : ��2 ;
        
        String result = (num > 0) ? "����̴�" : "����� �ƴϴ�";
        
        System.out.println(num + " ��/�� " + result);

    }
    
    public void method3()
    {
        // ���� ������ ��ø ���
        
        // �Է¹��� ������ ���, 0, ���� ���� �Ǻ� �� ���
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("���� �ϳ� �Է� : ");
        int num = sc.nextInt();
        
        String result = num == 0 ? "0" :(num > 0) ? "���" : "����";
        
        System.out.println(num + " ��/�� " + result);
        
    }
    
    public void method4()
    {
        // �� �� �� '+', �Ǵ� '-'�� �Է¹޾� �˸��� ��� ��� ����ϱ�
        // ��, '+', '-' ������ ������ �Է½� "�߸� �Է��ϼ̽��ϴ�." ���
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ù ��° �� :");
        int num1 = sc.nextInt();
        
        System.out.println("�� ��° �� :");
        int num2 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("������ �Է� (+ or -) : ");
        char op = sc.nextLine().charAt(0);
        
        String result = (op == '+') ? (num1 + num2 + "") : (op == '-') ? (num1 - num2 + "") : "�߸� �Է��ϼ̽��ϴ�.";
        
        System.out.println("��� : " + result);
    }
    
    
}
