package com.game;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown
{
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    
    int highScore = Integer.MAX_VALUE;
    int score = 0;
    
    public void main()
    {
 
        boolean bool = true;
        
        
        while(bool)
        {
            System.out.println();
            System.out.println(" === Up & Down Game === ");
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
                    // ���� Ƚ�� ��� �� ����ȭ������ (�� ������ �������)
                    if(score == 0)
                    {
                        System.out.println("���� ����� �����ϴ�. ������ �������ּ���!");
                    }
                    else
                    {
                        if(highScore <= 0)
                        {
                            System.out.println("���� ������ ������ �����ϴ�. ������ �������ּ���!");
                            System.out.println();
                        }
                        else
                        {
                            System.out.println("����� �ְ����� " + highScore + "�� °�� ������ϴ�.");
                            System.out.println();
                        }
                    }
                    break;
                
                case 3: bool = false; 
                    break;
            }
            
        }
        
    }
    
    public void GameStart()
    {
  
        // �˻�� ���� ���
        int answer = r.nextInt(99) + 1;
        System.out.println(answer);
        
        
        score = 0;
        System.out.println("<< Game Start >>");
        
        while(true)
        {
            System.out.println();
            System.out.println("<< " + (++score) + "ȸ�� >>");
            System.out.print("Input Number: ");
            int userN = sc.nextInt();
       
            
            if(userN == answer)
            {
                System.out.println();
                System.out.println("<< ���� >>");
                
                if(score < highScore)
                {
                    highScore = score;
                }
                
                break;
            }
            else if(userN > answer)
            {
                System.out.println();
                System.out.println("<< D O W N >>");
            }
            else if(userN < answer)
            {
                System.out.println();
                System.out.println("<< U P >>");
            }  
            
        }
  
    }
    
    
}
