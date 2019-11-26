package com.kh.scan;

import java.util.Scanner;

public class MyScanner
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("int를 입력해주세요 : ");
        int i = sc.nextInt();

        
        //System.out.println("입력한 값은 : " + i);
        
        System.out.println("float를 입력해주세요 :");
        float f = sc.nextFloat();
        
        System.out.println("double을 입력해주세요 : ");
        double d = sc.nextDouble();
        
        System.out.println("char를 입력해주세요 : ");
        char ch = sc.next().charAt(0);
        
        sc.nextLine(); // 버퍼비우기
        
        System.out.println("String을 입력해주세요 : ");
        String str = sc.nextLine();
        
        
        System.out.println("입력한 int 값은 : " + i);
        System.out.println("입력한 float 값은 : " + f);
        System.out.println("입력한 double 값은 : " + d);
        System.out.println("입력한 char 값은 : " + ch);
        System.out.println("입력한 String 값은 : " + str);
        
    }   
    
}
