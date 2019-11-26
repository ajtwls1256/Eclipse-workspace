package com.game;

import java.util.Random;
import java.util.Scanner;

public class Dice
{
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    
    // score ��� ����
    int winScore = 0;
    int drawScore = 0;
    int loseScore = 0;
    
    // ��
    int startMoney = 10000;
    
    public void main()
    {
 
        boolean bool = true;
        
        
        while(bool)
        {
            System.out.println();
            System.out.println(" === Dice Game === ");
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
                    // ���� ���
                    System.out.println("<< ����� ���� >>");
                    System.out.println("WIN : " + winScore);
                    System.out.println("LOSE : " + loseScore);
                    System.out.println("DRAW : " + drawScore);
                    break;
                
                case 3: bool = false; 
                    break;
            }
            
        }
        
    }
    
    
    public void GameStart()
    {
        
        System.out.println();
        System.out.println("<<Game Start>>");
        System.out.println();

        int turn = 0;
        
        // ����
        while(true)
        {
     
            turn++;
            System.out.println("<<< " + turn + "ȸ�� >>>");
            
            int userSum = 0;
            // �ֻ��� 3ȸ �� ���
            for(int i=0 ; i<3 ; i++)
            {
                int temp = r.nextInt(6) + 1;
                
                userSum += temp;
            }
            
            System.out.println("����� �ֻ��� 3ȸ�� : " + userSum);
            
            
            char userSel = ' ';
            sc.nextLine();
            
            while(true)
            {
                System.out.print("�����Ͻðڽ��ϱ� <y/n> ");
                userSel = sc.nextLine().charAt(0);
                
                if(userSel != 'y' && userSel != 'n')
                {
                    System.out.println("\"y/n\" �� �Է����ּ���");
                    continue;
                }
                else
                    break;
            
            }
            
            if(userSel == 'n')
            {
                break;
            }
            else if(userSel == 'y')
            {
                System.out.println("���� ������ " + startMoney + "��");
                System.out.print("���ñݾ� > ");
                int userBetting = sc.nextInt();
                
                if(startMoney < userBetting)
                {
                    System.out.println("�������� ���ڶ��ϴ�.");
                    System.out.println("�޴��� ���ư��ϴ�.");
                    break;
                }
                
                int comSum = 0;
                // ��ǻ�� 3ȸ �� ���
                for(int i=0 ; i<3 ; i++)
                {
                    int temp = r.nextInt(6) + 1;
                    
                    comSum += temp;
                }
                
                System.out.println("=======================");
                System.out.println("��ǻ�� �ֻ��� 3ȸ �� : " + comSum);
                
                // ��� ��� �� ���
                System.out.println();
                System.out.println("<<���� ���>>");
                
                if(userSum == comSum)
                {
                    drawScore++;
                    
                    System.out.println("�����ϴ�.");
                }
                else if(userSum > comSum)
                {
                    startMoney += userBetting;
                    winScore++;
                    
                    
                    System.out.println("����� �̰���ϴ�.");
                }
                else if(userSum < comSum)
                {
                    startMoney -= userBetting;
                    loseScore++;
                    
                    System.out.println("����� �����ϴ�.");
                    
                    if(startMoney == 0)
                        break;
                }
                
                System.out.println();
            }
           

        }
        
        
    }
    
    
    
}
