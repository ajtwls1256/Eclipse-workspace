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
            System.out.print("선택 > ");
            
            int sel = sc.nextInt();
            switch(sel)
            {
                case 1: 
                    // 실제 게임 로직 작성
                    GameStart();
                    break;
                case 2: 
                    // 맞춘 횟수 출력 후 선택화면으로 (몇 번만에 맞췄는지)
                    if(score == 0)
                    {
                        System.out.println("아직 기록이 없습니다. 게임을 진행해주세요!");
                    }
                    else
                    {
                        if(highScore <= 0)
                        {
                            System.out.println("아직 진행한 게임이 없습니다. 게임을 진행해주세요!");
                            System.out.println();
                        }
                        else
                        {
                            System.out.println("당신의 최고기록은 " + highScore + "번 째에 맞췄습니다.");
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
  
        // 검사용 정답 출력
        int answer = r.nextInt(99) + 1;
        System.out.println(answer);
        
        
        score = 0;
        System.out.println("<< Game Start >>");
        
        while(true)
        {
            System.out.println();
            System.out.println("<< " + (++score) + "회차 >>");
            System.out.print("Input Number: ");
            int userN = sc.nextInt();
       
            
            if(userN == answer)
            {
                System.out.println();
                System.out.println("<< 정답 >>");
                
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
