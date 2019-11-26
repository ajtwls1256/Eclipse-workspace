package com.kh.calc;

public class Calc03
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        int x = 10;
        int y = 12;
        
        System.out.println("x = \t" + toBinaryString(x));
        System.out.println("y = \t" + toBinaryString(y));
        
        System.out.println("x|y = \t" + toBinaryString(x|y));
        System.out.println("x&y = \t" + toBinaryString(x&y));
        System.out.println("x^y = \t" + toBinaryString(x^y));
        System.out.println("~x = \t" + toBinaryString(~x));
        
        
    }
    
    
    static String toBinaryString(int number)
    {
        String zero = "00000000000000000000000000000000";
        String binary = zero + Integer.toBinaryString(number);
        
        return binary.substring(binary.length() - 32);
    }
    
}
