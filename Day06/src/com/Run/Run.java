package com.Run;

import java.util.Scanner;

import com.game.BaskinRobbins31;
import com.game.Dice;
import com.game.UpAndDown;
import com.practice.for01.For01;
import com.practice.for01.RandomTest;
import com.practice.for01.While01;

public class Run
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
//        For01 for01 = new For01();
//        for01.method2();
        
//        While01 while01 = new While01();
//        while01.method2();
        
//        RandomTest random = new RandomTest();
//        random.test();
        
//        UpAndDown up = new UpAndDown();
//        up.main();
        
//        BaskinRobbins31 br = new BaskinRobbins31();
//        br.main();
        
//        Dice dc = new Dice();
//        dc.main();
        
        Scanner sc = new Scanner(System.in);
        
        boolean bool = true;
        
        
        while(bool)
        {
            
            System.out.println("<<<<< �ǽ����� >>>>>");
            System.out.println("1. �ǽ�����4 <Up & Down>");
            System.out.println("2. �ǽ�����5 <Baskin Robbins>");
            System.out.println("3. �ǽ�����6 <Dice>");
            System.out.println("0. ���α׷� ����");
            System.out.print("��ȣ ���� [0 ~ 4] : ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 0 : bool = false;
                    break;
                    
                case 1 :       
                    UpAndDown up = new UpAndDown();
                    up.main();
                    break;
                    
                case 2 :
                    BaskinRobbins31 br = new BaskinRobbins31();
                    br.main();
                    break;
                    
                case 3 :
                    Dice dc = new Dice();
                    dc.main();
                    break;
            }
            
     
        }
    }
    
 
    
}
