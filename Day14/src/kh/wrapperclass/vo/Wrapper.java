package kh.wrapperclass.vo;

import java.util.Random;

public class Wrapper
{
    public void main()
    {
        boolean bool = true;
        Random r = new Random();
        
        // �ڽ�
        Boolean bool2 = new Boolean(true);
        Character c = new Character('O');
        Integer i = new Integer(5);
        Byte b = new Byte((byte)5);     // 10, 1, 2 -> �⺻������ int
        Short s = new Short((short)5);
        Long l = new Long(5L);           
        Float f = new Float(0.5f);
        Double d = new Double(1.5);
        
        // ����ڽ�
        Integer num = 10;       // new Integer(10) �� ���������� �����
        // ���� ��ڽ�
        int num2 = num;         // num.intValue() �� ���������� �����
        System.out.println(num + "\t" + num2);  // 10   10
       
        
        // ���ڿ��� �⺻�ڷ������� ��ȯ
        String data = "999";
        System.out.println(data+1);     // 9991
        int num3 = Integer.parseInt(data);
        System.out.println(num3 + 1);   // 1000
        
        String data1 = "10.5";
        double num4 = Double.parseDouble(data1);
        System.out.println(num4 + 1);       // 11.5
        
        
        // �⺻�ڷ��� -> ���ڿ��� ��ȯ
        int num5 = 999;
        String data2 = Integer.valueOf(num5).toString();
        String data3 = String.valueOf(num5);
        System.out.println(data2+1);    //9991
        System.out.println(data3+1);    //9991
        
        
        
        
        
        
        
        
        
        
        
    }
}
