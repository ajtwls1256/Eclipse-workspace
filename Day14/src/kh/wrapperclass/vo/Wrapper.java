package kh.wrapperclass.vo;

import java.util.Random;

public class Wrapper
{
    public void main()
    {
        boolean bool = true;
        Random r = new Random();
        
        // 박싱
        Boolean bool2 = new Boolean(true);
        Character c = new Character('O');
        Integer i = new Integer(5);
        Byte b = new Byte((byte)5);     // 10, 1, 2 -> 기본적으로 int
        Short s = new Short((short)5);
        Long l = new Long(5L);           
        Float f = new Float(0.5f);
        Double d = new Double(1.5);
        
        // 오토박싱
        Integer num = 10;       // new Integer(10) 이 묵시적으로 진행됨
        // 오토 언박싱
        int num2 = num;         // num.intValue() 가 묵시적으로 진행됨
        System.out.println(num + "\t" + num2);  // 10   10
       
        
        // 문자열을 기본자료형으로 변환
        String data = "999";
        System.out.println(data+1);     // 9991
        int num3 = Integer.parseInt(data);
        System.out.println(num3 + 1);   // 1000
        
        String data1 = "10.5";
        double num4 = Double.parseDouble(data1);
        System.out.println(num4 + 1);       // 11.5
        
        
        // 기본자료형 -> 문자열로 변환
        int num5 = 999;
        String data2 = Integer.valueOf(num5).toString();
        String data3 = String.valueOf(num5);
        System.out.println(data2+1);    //9991
        System.out.println(data3+1);    //9991
        
        
        
        
        
        
        
        
        
        
        
    }
}
