package kh.setLotto.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LottoController
{
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    
    public void main()
    {
        HashSet<Integer> myLotto = new HashSet<>();
        
        
        System.out.println("\n===== 로또 프로그램 =====");
        
        while(myLotto.size() < 6)
        {
            System.out.print((myLotto.size()+1) + "번째 번호 입력 : ");
            int sel = sc.nextInt();
            
            if(sel < 1 || sel > 45)
            {
                System.out.println("1~45 사이의 수만 입력해주세요!");
                continue;
            }
            
            if(!myLotto.add(sel))
            {
                System.out.println("중복된 숫자입니다!");
                continue;
            }
        }
        
        int count = 0;
        int round = 1;
        
        while(count != 6)
        {
            count = 0;
            
            HashSet<Integer> comLotto = new HashSet<>();
            
            while(comLotto.size() < 6)
            {
                int sel = r.nextInt(45) + 1;
                
                if(sel < 1 || sel > 45)
                {
                    System.out.println("컴퓨터 범위 밖 숫자발생 random범위조정");
                    continue;
                }
                
                if(!comLotto.add(sel))
                {
//                    System.out.println("컴퓨터 중복된 숫자발생");
                    continue;
                }
            }
            
            
            ArrayList<Integer> my = new ArrayList<>(myLotto);
            ArrayList<Integer> com = new ArrayList<>(comLotto);
            
        
            
            for(int i=0; i<com.size(); i++)
            {
                for(int j=0; j<my.size(); j++)
                {
                    if(com.get(i) == my.get(j))
                    {
                        count++;
                        break;
                    }
                }
            }
            
            
            for(int i =0; i<my.size(); i++)
                System.out.print(my.get(i) + " ");
            
            System.out.println();
            
            for(int i =0; i<com.size(); i++)
                System.out.print(com.get(i) + " ");
            
            
            System.out.println(round + "회차 맞은 갯수 : " + count);
            round++;
        }
        
        
    }
}
