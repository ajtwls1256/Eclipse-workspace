package kh.vo;

import java.util.Scanner;

public class Motel
{
    Scanner sc = new Scanner(System.in);
    
    int [] room = new int[10];
    boolean [] room2 = new boolean[10];
    
    
    public void main()
    {
        boolean bool = true;
        
        while(bool)
        {
            System.out.println("= = = = = ���� ���� ���α׷� v.10 = = = = =");
            System.out.println("1.�Խ�    2.���    3.�溸��    4.����");
            System.out.print("���� > ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1:
                    entrance();
                    break;
                case 2:
                    departure();
                    break;
                case 3:
                    roomCheck();
                    break;
                case 4: bool = false;
                    break;
            }
           
        }
        
    }
    
    
    
    public void entrance()
    {
        System.out.print("����濡 �Խ��Ͻðڽ��ϱ�? ");
        int sel = sc.nextInt() - 1;
        
        if(room2[sel] == true)
        {
            System.out.println((sel+1) +"���濡�� ���� �մ��� �ֽ��ϴ�.");
        }
        else
        {
            room2[sel] = true;
        }
    }
    
    
    public void departure()
    {
        System.out.print("����濡�� ����Ͻðڽ��ϱ�? ");
        int sel = sc.nextInt() - 1;
        
        if(room2[sel] == false)
        {
            System.out.println((sel+1) +"������ ���� ����ֽ��ϴ�.");
        }
        else
        {
            room2[sel] = false;
        }
    }
    
    public void roomCheck()
    {
        for(int i=0;i<10; i++)
        {
            if(room2[i] == true)
            {
                System.out.println((i+1) + "���濡�� ���� �մ��� �ֽ��ϴ�.");
            }
            else
            {
                System.out.println((i+1) + "������ ���� ����ֽ��ϴ�.");
            }
        }
    }
    
    
    
}
