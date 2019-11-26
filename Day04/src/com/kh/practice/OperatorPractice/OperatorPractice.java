package com.kh.practice.OperatorPractice;

import java.util.Scanner;

public class OperatorPractice
{
    Scanner sc = new Scanner(System.in);
    
    public void practice1()
    {
       
        System.out.println("���� �ϳ��� �Է��ϼ��� : ");
        int num = sc.nextInt();
        
        String result = num > 0 ? "����Դϴ�." : "����� �ƴմϴ�.";
        
        System.out.println("�Է¹��� ���� " + num + " ��/�� " + result);
        
    }
    
    public void practice2()
    {
        System.out.println("���� �ϳ��� �Է��ϼ��� : ");
        int num = sc.nextInt();
        
        String result = num > 0 ? "����Դϴ�." : num == 0 ? "0�Դϴ�." : "�����Դϴ�.";
        
        System.out.println("�Է¹��� ���� " + num + " ��/�� " + result);
    }
    
    public void practice3()
    {
        System.out.println("���� �ϳ��� �Է��ϼ��� : ");
        int num = sc.nextInt();
        
        String result = num % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
        
        System.out.println("�Է¹��� ���� " + num + " ��/�� " + result);
    }
    
    public void practice4()
    {
        System.out.println("�ο� ���� ���� ������ �Է��ϼ��� : ");
        int pNum = sc.nextInt();
        int cNum = sc.nextInt();
        
        int p1Candy = cNum / pNum;
        int lCandy = cNum % pNum;
        
        System.out.println("1�δ� ���� ���� : " + p1Candy);
        System.out.println("���� ���� ���� : " + lCandy);
    }
    
    public void practice7()
    {
        System.out.println("���� ���� ���� ������ �Է��ϼ��� : ");
        int kScore = sc.nextInt();
        int eScore = sc.nextInt();
        int mScore = sc.nextInt();
        
        int sum = kScore + eScore + mScore;
        float ave = sum / 3.0f;
        
        String result = (kScore >= 40 && eScore >= 40 && mScore >= 40) && ave >= 60 ? "�հ�" : "���հ�"; 
        
        System.out.println("�հ� : " + sum);
        System.out.println("��� : " + ave);
        System.out.println(result);
        
    }
    
    public void practice8()
    {
        System.out.println("�ֹ� ��ȣ�� �Է��ϼ���(- ����) : ");
        String pNum = sc.nextLine();
        
        String sNum = pNum.substring(pNum.lastIndexOf("-")+1,pNum.lastIndexOf("-")+2);
        
        
        String result = Integer.parseInt(sNum) == 1 || Integer.parseInt(sNum) == 3 ? "����" : "����";
        
        
        System.out.println(result);
        
        
        
    }
    
    public void practice10()
    {
        System.out.println("3���� ���� �Է��ϼ��� : ");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        boolean result = num == num2 ? (num2 == num3 ? true : false) : false;
        
        System.out.println("�Է�1 : " + num);
        System.out.println("�Է�2 : " + num2);
        System.out.println("�Է�3 : " + num3);
        
        System.out.println(result);
    }
    
}
