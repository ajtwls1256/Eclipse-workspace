package com.kh.calc;

import java.util.Scanner;

public class Calc01
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        // 1번
        /*int a,b,c;
        
        System.out.println("a,b,c 를 입력");
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        a++;
        System.out.println("a는 " + a);
        
        b = (--a) + b;
        System.out.println("b는 " + b);
        
        c = (a++) + (--b);
        System.out.println("c는 " + c);*/
        
        
        //2번
       /* boolean flag = true;
        System.out.println("flag는 " + !!!!flag);*/
        
        
        //3번
        /*int x,y,z;
        x = 100;
        y = 33;
        z = 0;
        
        x--;
        z = x-- + --y;
        x = 99 + x++ + x;
        y = y-- + y + ++y;
        
        System.out.println("x는 " + x + " y는 " + y + " z는 " + z);*/
        
        
        
        int test = 1;
        int result = 0;
        
//        result = test++ + test++ + test++; 
        result = test++ + test++;
        
        
        System.out.println(result);
        
        
        
        
        
        
        
    }
    
}
