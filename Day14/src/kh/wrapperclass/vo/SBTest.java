package kh.wrapperclass.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SBTest
{
    Scanner sc = new Scanner(System.in);
    
    public void main()
    {
        StringBuffer sb = new StringBuffer();
        
        // ���� ����� ���ڿ� ����
        System.out.println(sb.length());
        // �Ҵ�� ���ڿ� ����� ũ��
        System.out.println(sb.capacity());
        
        
        sb.append("D-Class ");
        sb.append("Hello");
        System.out.println(sb);
        
        sb.insert(2, "Hi");
        System.out.println(sb);
        
        sb.replace(0,2, "aaaaa");       // �տ��� ����, �ڴ� ������
        System.out.println(sb);
    
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        
        
        sb.delete(0, 4);
        System.out.println(sb);
        
        sb.delete(7, 8);
        System.out.println(sb);
        
    }
    
    public void token()
    {
        String str = "������/����/KH";
        StringTokenizer sT = new StringTokenizer(str, "/");
        
        
        while(sT.hasMoreTokens())
        {
            System.out.println(sT.countTokens());
            System.out.println(sT.nextToken());
        }
        
        
//        System.out.println(sT.countTokens());
//        System.out.println(sT.nextToken());
//        
//        System.out.println(str);
//        System.out.println(sT.countTokens());
//        
//        System.out.println(sT.nextToken());
//        System.out.println(sT.countTokens());
//        System.out.println(sT.nextToken());
//        System.out.println(sT.countTokens());
    
    }
    
    public void exam1()
    {
        String str = "J a v a P r o g r a m";
        // StringTokenizer �� �̿��ؼ� char[]�迭�� ���� ��
        // ��� �빮�ڷ� ��ȯ�Ͽ� ���
        // -> ������ JAVAPROGRAM
        
        
        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());
        
        char [] result = new char[st.countTokens()];
        int rIndex = 0;
        StringBuffer sb = new StringBuffer();
        
        while(st.hasMoreElements())
        {
            String c = st.nextToken();
            result[rIndex++] = c.toUpperCase().charAt(0);
            sb.append(c.toUpperCase());
        }
        
    
        
        for(int i=0; i<rIndex; i++)
        {
            System.out.print(result[i]);
        }  
        
        System.out.println("\n" + sb);
        
    }
    
    
    
    public void math()
    {
        System.out.println(Math.abs(-10));      // ���밪
        System.out.println(Math.ceil(2.5));     // �ø�
        System.out.println(Math.floor(2.5));    // ����
        System.out.println(Math.max(1, 2));     // ū �� ����
        System.out.println(Math.pow(2, 5));
    }
    
    
    public void date()
    {
        Calendar today = Calendar.getInstance();
  
        System.out.println(today.get(Calendar.YEAR));
        System.out.println(today.get(Calendar.MONTH)+1);      // MONTH�� 0~11 �̶󼭱׷�..
        System.out.println(today.get(Calendar.DATE));
        System.out.println(today.get(Calendar.DAY_OF_WEEK));    //1 = �Ͽ���, 7= �����
        System.out.println(today.get(Calendar.AM_PM));          //0 = ���� , 1 = ����
        System.out.println(today.get(Calendar.HOUR));
        System.out.println(today.get(Calendar.MINUTE));
        System.out.println(today.get(Calendar.SECOND));
        
   
        //today.set(Calendar.YEAR, 2020);
        //System.out.println(today.get(Calendar.YEAR));
        
        // ��¥ ��� �� ���
        System.out.println(today.getTimeInMillis());            // 1970.01.01 �κ��� ������� �� ms�� �������� ǥ��

     
        
        
        Date today2 = new Date();
        Date today3 = new Date(123455678L);
        Date today4 = new Date(today.getTimeInMillis());
        
        System.out.println(today2);
        System.out.println(today3);
        System.out.println(today4);
        
 
        
         Date today5 = new Date();
         System.out.println(today5);
         SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");      // �ҹ���m���� �� 8�� 15�� �Ǵ�
         String ftToday = ft.format(today5);
         
         System.out.println(ftToday);
        
         SimpleDateFormat ft2 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
         String ft2Today = ft2.format(today5);
         
         System.out.println(ft2Today);
         
    }
    
    
    public void exam2()
    {
        Calendar c = Calendar.getInstance();
        
        int y = c.get(Calendar.YEAR);
        int m = c.get(Calendar.MONTH) +1;
        int date = c.get(Calendar.DATE);
        int day = c.get(Calendar.DAY_OF_WEEK);
        int h = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int s = c.get(Calendar.SECOND);
        
        String day2 = null;
        switch(day)
        {
            case 1: day2 = "�Ͽ���";
                break;
            case 2: day2 = "������";
                break;
            case 3: day2 = "ȭ����";
                break;
            case 4: day2 = "������";
                break;
            case 5: day2 = "�����";
                break;
            case 6: day2 = "�ݿ���";
                break;
            case 7: day2 = "�����";
                break;  
        }
        
        System.out.println(y + "�� " + m + "�� " + date + "�� " + day2 +" "+ h + "�� " + minute + "�� " + s + "�� ");
        
    }
    
    public void exam3()
    {
        System.out.println("====================== D-Day ���� ======================");
        System.out.print("D-Day [�⵵] �Է� : ");
        int year = sc.nextInt();
        System.out.print("D-Day [��] �Է� : ");
        int month = sc.nextInt() - 1;
        System.out.print("D-Day [��] �Է� : ");
        int date = sc.nextInt();
        
        Calendar todayC = Calendar.getInstance();
        Long today = todayC.getTimeInMillis();
        
        System.out.println("���� ��¥ : " + todayC.get(Calendar.YEAR) + "�� " + (todayC.get(Calendar.MONTH)+1) + "�� " + todayC.get(Calendar.DATE) + "��");
        
        //Calendar destC = Calendar.getInstance();
        todayC.set(year, month, date);
        Long destination = todayC.getTimeInMillis();
        System.out.println("D-Day ��¥ : " + todayC.get(Calendar.YEAR) + "�� " + (todayC.get(Calendar.MONTH)+1) + "�� " + todayC.get(Calendar.DATE) + "��");
        
        long dayGap = (today - destination)/(1000*60*60*24);
        
        
        if(dayGap == 0)
        {
            System.out.println("D-Day �Դϴ�.");
        }
        else if(dayGap < 0)
        {
            System.out.println(-dayGap + "�� ���ҽ��ϴ�.");
        }
        else
        {

            System.out.println(dayGap + "�� �������ϴ�.");
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
