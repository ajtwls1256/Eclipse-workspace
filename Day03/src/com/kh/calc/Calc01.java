package com.kh.calc;

import java.util.Scanner;

public class Calc01
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        // 1��
        /*int a,b,c;
        
        System.out.println("a,b,c �� �Է�");
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        a++;
        System.out.println("a�� " + a);
        
        b = (--a) + b;
        System.out.println("b�� " + b);
        
        c = (a++) + (--b);
        System.out.println("c�� " + c);*/
        
        
        //2��
       /* boolean flag = true;
        System.out.println("flag�� " + !!!!flag);*/
        
        
        //3��
        /*int x,y,z;
        x = 100;
        y = 33;
        z = 0;
        
        x--;
        z = x-- + --y;
        x = 99 + x++ + x;
        y = y-- + y + ++y;
        
        System.out.println("x�� " + x + " y�� " + y + " z�� " + z);*/
        
        
        
        int test = 1;
        int result = 0;
        
//        result = test++ + test++ + test++; 
        result = test++ + test++;
        
        
        System.out.println(result);
        
        
        
        
        
        
        
    }
    
}
