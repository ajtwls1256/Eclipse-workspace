package com.kh.control01.condition;

import java.util.Scanner;

public class A_If
{
    // ���α׷��� ������ ���������� ����ȴ�.
    // ������ �� �������� �帧�� �ٲ� ��
    // "���" �̶�� �� �̿��Ѵ�.
    
    // <���ǹ�>
    // ���ǽ��� ���� ���̳� �����̳ĸ� �Ǵ��ؼ�
    // �ش� ������ �����ϴ� ��� �׿� �ش��ϴ� ����
    
    // ���׿����ڵ� ���ǹ���
    
    // ���ǹ��� ũ�� if���̶� switch������ ������.
    
    // if���� ���� 3����
    // 1. �ܵ� if��
    // 2. if else��
    // 3. if else if��
    
    
    // �ܵ� if��
    // if ( ���ǽ� ) {
    //     .. ������ �ڵ� ..;
    // }
 
    // ���ǽ��� ��� ���� true(��)�̸� �߰�ȣ({}) ���� �ڵ带 ����
    // ���ǽ��� ��� ���� false(����)�̸� �ڵ带 �����ϰ� �Ѿ��.
    
    
    Scanner sc = new Scanner(System.in);
    
    public void practice1()
    {
    
        System.out.println("���ڸ� �� �� �Է��ϼ���: ");
        int num = sc.nextInt();
        
        if(num > 0)
        {
            if(num % 2 == 0)
                System.out.println("¦����.");
            else
                System.out.println("Ȧ����.");
        }
        else
            System.out.println("����� �Է����ּ���.");
           
        
    }
    
    public void practice2()
    {
        System.out.println("1.�Է� 2.���� 3.��ȸ 4.���� 7.����");
        System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
        int num = sc.nextInt();
        
        if(num == 1)
            System.out.println("�Է� �޴��Դϴ�.");
        else if(num == 2)
            System.out.println("���� �޴��Դϴ�.");
        else if(num == 3)
            System.out.println("��ȸ �޴��Դϴ�.");
        else if(num == 4)
            System.out.println("���� �޴��Դϴ�.");
        else if(num == 7)
            System.out.println("���α׷��� ����˴ϴ�.");
        else
            System.out.println("�߸��� �Է��Դϴ�.");
        
        
        
    }
    
    
    
    
}
