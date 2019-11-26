package com.game;

import java.util.Random;
import java.util.Scanner;

public class BaskinRobbins31
{
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    
    // score üũ�� ����
    int myScore = 0;
    int comScore = 0;
    
    
    public void main()
    {
 
        boolean bool = true;
        
        
        while(bool)
        {
            System.out.println();
            System.out.println(" === Baskin Robbins31 Game === ");
            System.out.println("1. Game Start");
            System.out.println("2. Game Score");
            System.out.println("3. End Game");
            System.out.print("���� > ");
            
            int sel = sc.nextInt();
            switch(sel)
            {
                case 1: 
                    // ���� ���� ���� �ۼ�
                    GameStart();
                    break;
                case 2: 
                    // ���� ��� �� ����ȭ������
                    System.out.println("<< ����� ���� >>");
                    System.out.println("WIN : " + myScore);
                    System.out.println("LOSE : " + comScore);
                    break;
                
                case 3: bool = false; 
                    break;
            }
            
        }
        
    }
    
    
    public void GameStart()
    {
        System.out.println("<< Game Start >>");
        System.out.println();
        
        int startNum = 0;
        int isEnd = 0;
        
        while(true)
        {
            // �� ����
            System.out.println("<<Your Turn>>");
            System.out.print("Input Number (1~3) : ");
            int userN = sc.nextInt();
            
            if(userN < 1 || userN > 3)
            {
                System.out.println("1~3 ������ ���� �Է����ּ���.");
                continue;
            }
            
           
            for(int i = 0; i < userN; i++)
            {
                startNum++;
                System.out.println(startNum + "!");
                
                if(startNum >= 31)
                {
                    isEnd = 1;
                    comScore++;
                    
                    System.out.println("����� �й��߽��ϴ�.");
                    System.out.println();
                    break;
                }  
            }
            
            System.out.println();
            
            if(isEnd == 1)
                break;
            
            // ��ǻ�� ����
            System.out.println("<<Computer Trun>>");
           
            int comN = 0;
      
                
            comN = r.nextInt(3) + 1;
            
            
            // �¸����� : startNum �� 26�̸� ������ ����.
            // 26 �Ʒ� �� �϶��� ��뿡�� 26�� �ְ��ϰ�
            // 27 �̻��϶� 30�� ���� ��븦 ���� �Ѵ�.
            if(startNum >= 23 && startNum <= 25)
            {
                comN = 26 - startNum;
            }
            else if(startNum >= 27 && startNum <= 29)
            {
                comN = 30 - startNum;
            }
          
                
            for(int i = 0; i < comN; i++)
            {
                startNum++;
                System.out.println(startNum + "!");
                
                if(startNum >= 31)
                {
                    isEnd = 1;
                    myScore++;              
                    
                    System.out.println("����� �¸��߽��ϴ�.");
                    System.out.println();
                    break;
                }  
            }
            
            System.out.println();
            
            if(isEnd == 1)
                break;
        
        }
        
     
        
        
    }
    
    
}
