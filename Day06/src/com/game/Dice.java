package com.game;

import java.util.Random;
import java.util.Scanner;

public class Dice
{
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    
    // score 계산 변수
    int winScore = 0;
    int drawScore = 0;
    int loseScore = 0;
    
    // 돈
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
            System.out.print("선택 > ");
            
            int sel = sc.nextInt();
            switch(sel)
            {
                case 1: 
                    // 실제 게임 로직 작성
                    GameStart();
                    break;
                case 2: 
                    // 전적 출력
                    System.out.println("<< 당신의 전적 >>");
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
        
        // 시작
        while(true)
        {
     
            turn++;
            System.out.println("<<< " + turn + "회차 >>>");
            
            int userSum = 0;
            // 주사위 3회 합 계산
            for(int i=0 ; i<3 ; i++)
            {
                int temp = r.nextInt(6) + 1;
                
                userSum += temp;
            }
            
            System.out.println("당신의 주사위 3회합 : " + userSum);
            
            
            char userSel = ' ';
            sc.nextLine();
            
            while(true)
            {
                System.out.print("배팅하시겠습니까 <y/n> ");
                userSel = sc.nextLine().charAt(0);
                
                if(userSel != 'y' && userSel != 'n')
                {
                    System.out.println("\"y/n\" 만 입력해주세요");
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
                System.out.println("현재 소지금 " + startMoney + "원");
                System.out.print("배팅금액 > ");
                int userBetting = sc.nextInt();
                
                if(startMoney < userBetting)
                {
                    System.out.println("소지금이 모자랍니다.");
                    System.out.println("메뉴로 돌아갑니다.");
                    break;
                }
                
                int comSum = 0;
                // 컴퓨터 3회 합 계산
                for(int i=0 ; i<3 ; i++)
                {
                    int temp = r.nextInt(6) + 1;
                    
                    comSum += temp;
                }
                
                System.out.println("=======================");
                System.out.println("컴퓨터 주사위 3회 합 : " + comSum);
                
                // 결과 계산 후 출력
                System.out.println();
                System.out.println("<<게임 결과>>");
                
                if(userSum == comSum)
                {
                    drawScore++;
                    
                    System.out.println("비겼습니다.");
                }
                else if(userSum > comSum)
                {
                    startMoney += userBetting;
                    winScore++;
                    
                    
                    System.out.println("당신이 이겼습니다.");
                }
                else if(userSum < comSum)
                {
                    startMoney -= userBetting;
                    loseScore++;
                    
                    System.out.println("당신이 졌습니다.");
                    
                    if(startMoney == 0)
                        break;
                }
                
                System.out.println();
            }
           

        }
        
        
    }
    
    
    
}
