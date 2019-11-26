package kh.run;

import kh.callbyvalue.Person;

public class Run
{
    
/*    public static void changeName(Person p)
    {
        p = new Person("Bob");
    }
    
    public static void changeName2(Person p)
    {
        p.setName("Bob");
    }*/
    
    
    public static void main(String[] args)
    {
       /* Person sam = new Person("Sam");
        
        changeName(sam);
        System.out.println(sam.getName());       
        
        changeName2(sam);
        System.out.println(sam.getName());  */   
    
        
        
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        
        int result = 0;
        
        
        //메소드 오버로딩
        
        result = sum(a,b);
        System.out.println(result);
        
        result = sum(a,b,c);
        System.out.println(result);
        
        result = sum(a,b,c,d);
        System.out.println(result);
        

    }
    
    
    // 메소드 오버로딩은
    // 메소드 매개변수의 개수나 타입이 다르면 같은 메소드명을 사용해도 된다.
    
    public static int sum(int a, int b)
    {
        return a + b;
    }
    
    public static int sum(double a, int b)
    {
        return (int)(a + b);
    }
    
    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }
    
    public static int sum(int a, int b, int c, int d)
    {
        return a + b + c + d;
    }
    
   
    
    
    
}
