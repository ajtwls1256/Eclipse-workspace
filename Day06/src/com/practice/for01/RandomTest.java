package com.practice.for01;

import java.util.Random;
import java.util.Scanner;

public class RandomTest
{
 
    
    public void randomTest1()
    {
        Random r= new Random();
//        int num = r.nextInt(100); // 0~99������ ������
//        System.out.println("���� �� : " + num);
        
        //1~9 ������ ���� �� ����
//        int num2 = r.nextInt(9) + 1;
//        System.out.println("���� �� : " + num2);
        
        //20~35
        int num3 = r.nextInt(16) + 20;
        System.out.println("���� �� : " + num3);
        
        //0 �Ǵ� 1
        int num4 = r.nextInt(2);
        System.out.println("���� �� : " + num4);
        
    }
    
    
    Scanner sc = new Scanner(System.in);
    
    
    public void exam1()
    {
        //���� �յ� ���߱�
        
        System.out.println("==== ���� ��/�� ���߱� ====");
        System.out.print("���ڸ� �Է����ּ���(1.�ո� / 2.�޸�) : ");
        int userN = sc.nextInt();
        
        Random r = new Random();
        int random = r.nextInt(2);
        
        if(userN == random + 1)
        {
            System.out.println("����!!");
        }
        else
        {
            System.out.println("��!!!!!!!");
        }
    }
    
    
    public void exam2()
    {
        // ���������� ����
        
        while(true)
        {
        System.out.println("=== ���� ���� �� ���� ===");
        System.out.println("���ڸ� �����ϼ���(1.����/2.����/3.��) : ");
        int userN = sc.nextInt();
        
        Random r = new Random();
        int comN = r.nextInt(3) + 1;
        
        String result = "";
        
        if(userN == comN)
        {
            result = "�����ϴ�.";
        }
        else if((userN - 1  == comN) || (userN + 2 == comN))
        {
            result = "�̰���ϴ�.";
        }
        else
        {
            result = "�����ϴ�.";
        }
        
        
       
        String userS = "";
        String comS = "";
        
        String tempS = "";
        
        
        if(userN == 1)
            userS = "����";
        else if(userN == 2)
            userS = "����";
        else if(userN == 3)
            userS = "��";
        
        if(comN == 1)
            comS = "����";
        else if(comN == 2)
            comS = "����";
        else if(comN == 3)
            comS = "��";
        
//        for(int i = 0; i < 2; i++)
//        {
//            int tempN;
//          
//            if(i == 0)
//            {
//                tempN = userN;
//                tempS = userS;
//            }
//            else
//            {
//                tempN = comN;
//                tempS = comS;
//            }
//            
//            
//            if(tempN == 1)
//                tempS = "����";
//            else if(tempN == 2)
//                tempS = "����";
//            else if(tempN == 3)
//                tempS = "��";
//            
//        }
        
        
        System.out.println("====== ��� ======");
        System.out.println("����� " + userS + "�� �½��ϴ�.");
        System.out.println("��ǻ�ʹ� " + comS + "�� �½��ϴ�.");
        
       
        System.out.println("==================");
        System.out.println(result);
        }
        
    }
    
    
    
    public void test()
    {
        // String ���� ��� test
        // ���ͷ��� ���� �� ���� ���ڿ��� ������ ������ �ּҰ��� ��ȯ�Ѵ�.
        
        
        //String temp1 = new String("abc");
//        String temp1 = "abc";
//        String temp2 = "abc";
        //String temp2 = new String("abc");
        
        String temp1 = sc.nextLine();
        //sc.nextLine();
        String temp2 = sc.nextLine();
   
        
        System.out.println(temp1 == temp2);
        System.out.println(temp1.equals(temp2));
    }
    
    
}
