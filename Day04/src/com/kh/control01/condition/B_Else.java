package com.kh.control01.condition;

import java.util.Scanner;

public class B_Else
{
    // if-else��
    // if (���ǽ�) {
    // .. �����ڵ�1 ..;
    // } else {
    // .. �����ڵ�2 ..;
    // }
    
    // ���ǽ��� ����� true�� ��� �����ڵ�1 ����
    // ���ǽ��� ����� false�� ��� �����ڵ�2 ����
    
    // if-else-if��
    
    // if(���ǽ�) {
    // .. �����ڵ�1 ..;
    // } else if(���ǽ�2) {
    // .. �����ڵ�2 ..;
    // } else {
    // .. �����ڵ�3 ..;
    // }
    
    // ���ǽ�1�� ����� true�� ��� �����ڵ�1�� �����ϰ�
    // if-else-if���� ����������.
    // ������ ���ǽ�1�� ����� false�� ��� �����ڵ�2�� ����
    // ���ǽ�2�� ����� false�� ��� �����ڵ�3�� ����
    
    // ���ǽ�1, ���ǽ�2 ��� false�̸� else ������ �ڵ尡 ����
   
    Scanner sc = new Scanner(System.in);
    
    public void practice1()
    {
        System.out.println("���ڸ� �� �� �Է��ϼ���: ");
        int num = sc.nextInt();
        
        if (num > 0)
        {
            if (num % 2 == 0)
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
    
    
    public void practice3()
    {
        System.out.println("�߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϼ��� : ");
        int mScore = sc.nextInt();
        int fScore = sc.nextInt();
        int hScore = sc.nextInt();
        int �⼮ȸ�� = sc.nextInt();
        
        int �Ѱ���ȸ�� = 20;
        String result;
        
        float mRatio = 0f;
        float fRatio = 0f;
        float hRatio = 0f;
        float �⼮Ratio = 0f;
        float lRatio = 0f;
        
        
        mRatio = mScore * 0.2f;
        fRatio = fScore * 0.3f;
        hRatio = hScore * 0.3f;
        �⼮Ratio = �⼮ȸ��;
        
        lRatio = mRatio + fRatio + hRatio + �⼮Ratio;
        
        
        System.out.println("==============���===============");
        System.out.println("�߰���� ����(20) : " + mRatio);
        System.out.println("�⸻��� ����(30) : " + fRatio);
        System.out.println("���� ����    (30) : " + hRatio);
        System.out.println("�⼮ ����    (20) : " + �⼮Ratio);
        System.out.println("���� : " + lRatio);
        
        
        if((float)�⼮ȸ��/�Ѱ���ȸ�� < 0.7f && lRatio < 70)
            System.out.print("Fail [�⼮�̴�] [�����̴�]");
        else if((float)�⼮ȸ��/�Ѱ���ȸ�� < 0.7f)
            System.out.print("Fail [�⼮�̴�] ");
        else if(lRatio < 70)
            System.out.print("Fail [�����̴�] ");
        else
            System.out.print("PASS");
    
        
    }
    
    
    
    
    
}
