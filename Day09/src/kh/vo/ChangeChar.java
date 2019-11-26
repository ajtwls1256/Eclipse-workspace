package kh.vo;

import java.util.Scanner;

public class ChangeChar
{
    // 대문자 입력시 -> 소문자
    // 소문자 입력시 -> 대문자
    
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("영문자 입력 : ");
        char ch = sc.next().charAt(0);
  

        
        
        
        System.out.println("===== 변환 =====");
        
        
        
        char ch2 = change2(ch);
        
        
        System.out.println(ch2);
        
        
        
        
        
        
        
        
        
        

        
       /* int [] arr = {1,2,3,4,5};
        
       
        
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // arr -> 참조형 -> 주소값
        // arr[0] -> 1 숫자

        
        // 값 넘기기
        test1(arr[0]); // 1
  
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        
        // 주소 넘기기
        test2(arr);
        
        
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();*/
        
        
    }
    
    
    
    public void test1(int num)
    {
        num++;
        System.out.println("test1 메소드 수행");
        System.out.println(num);
    }
    
   
    
    public void test2(int [] array)
    {
        array[0] = 2;
        System.out.println("test2 메소드 수행");
        System.out.println(array[0]);
    }
    
    
    
    
    
    public char change2(char c)
    {
        char result = ' ';
        
        int gap = 'a' - 'A'; // 32
        
        // 소문자일때
        if(c >= 'a' && c <= 'z')
        {
            // 대문자로 바꾸자      
            result = (char)(c - gap);
       
            
            //return (char)(c-32);
        }
        
        
            
        // 대문자일때
        if(c >= 'A' && c <= 'Z')
        {
            result = (char)(c + gap);
        }
        
        return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    char change(char ch)
    {
        char result = ' ';
        int gap = 'a' - 'A';
        
        
        if(ch >= 'a' && ch <= 'z')
        {
            // 소문자 일 경우
            result = (char)(ch - gap);
        }
        else
        {
            // 대문자 일 경우
            result = (char)(ch + gap); 
        }
        
        return result;
        
        
        //아래는 쌤 코드
        //return (char)(ch^32); //영문자는 32랑 xor하면 알아서 소/대문자가 바껴서 나온데
    }
    
    
}
