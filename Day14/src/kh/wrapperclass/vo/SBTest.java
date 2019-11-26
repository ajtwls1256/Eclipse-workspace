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
        
        // 실제 저장된 문자열 길이
        System.out.println(sb.length());
        // 할당된 문자열 저장소 크기
        System.out.println(sb.capacity());
        
        
        sb.append("D-Class ");
        sb.append("Hello");
        System.out.println(sb);
        
        sb.insert(2, "Hi");
        System.out.println(sb);
        
        sb.replace(0,2, "aaaaa");       // 앞에는 포함, 뒤는 불포함
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
        String str = "이윤수/서울/KH";
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
        // StringTokenizer 를 이용해서 char[]배열에 저장 후
        // 모두 대문자로 변환하여 출력
        // -> 수행결과 JAVAPROGRAM
        
        
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
        System.out.println(Math.abs(-10));      // 절대값
        System.out.println(Math.ceil(2.5));     // 올림
        System.out.println(Math.floor(2.5));    // 버림
        System.out.println(Math.max(1, 2));     // 큰 값 리턴
        System.out.println(Math.pow(2, 5));
    }
    
    
    public void date()
    {
        Calendar today = Calendar.getInstance();
  
        System.out.println(today.get(Calendar.YEAR));
        System.out.println(today.get(Calendar.MONTH)+1);      // MONTH가 0~11 이라서그럼..
        System.out.println(today.get(Calendar.DATE));
        System.out.println(today.get(Calendar.DAY_OF_WEEK));    //1 = 일요일, 7= 토요일
        System.out.println(today.get(Calendar.AM_PM));          //0 = 오전 , 1 = 오후
        System.out.println(today.get(Calendar.HOUR));
        System.out.println(today.get(Calendar.MINUTE));
        System.out.println(today.get(Calendar.SECOND));
        
   
        //today.set(Calendar.YEAR, 2020);
        //System.out.println(today.get(Calendar.YEAR));
        
        // 날짜 계산 시 사용
        System.out.println(today.getTimeInMillis());            // 1970.01.01 로부터 현재까지 몇 ms가 지났는지 표현

     
        
        
        Date today2 = new Date();
        Date today3 = new Date(123455678L);
        Date today4 = new Date(today.getTimeInMillis());
        
        System.out.println(today2);
        System.out.println(today3);
        System.out.println(today4);
        
 
        
         Date today5 = new Date();
         System.out.println(today5);
         SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");      // 소문자m쓰면 왜 8이 15가 되누
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
            case 1: day2 = "일요일";
                break;
            case 2: day2 = "월요일";
                break;
            case 3: day2 = "화요일";
                break;
            case 4: day2 = "수요일";
                break;
            case 5: day2 = "목요일";
                break;
            case 6: day2 = "금요일";
                break;
            case 7: day2 = "토요일";
                break;  
        }
        
        System.out.println(y + "년 " + m + "월 " + date + "일 " + day2 +" "+ h + "시 " + minute + "분 " + s + "초 ");
        
    }
    
    public void exam3()
    {
        System.out.println("====================== D-Day 계산기 ======================");
        System.out.print("D-Day [년도] 입력 : ");
        int year = sc.nextInt();
        System.out.print("D-Day [월] 입력 : ");
        int month = sc.nextInt() - 1;
        System.out.print("D-Day [일] 입력 : ");
        int date = sc.nextInt();
        
        Calendar todayC = Calendar.getInstance();
        Long today = todayC.getTimeInMillis();
        
        System.out.println("오늘 날짜 : " + todayC.get(Calendar.YEAR) + "년 " + (todayC.get(Calendar.MONTH)+1) + "월 " + todayC.get(Calendar.DATE) + "일");
        
        //Calendar destC = Calendar.getInstance();
        todayC.set(year, month, date);
        Long destination = todayC.getTimeInMillis();
        System.out.println("D-Day 날짜 : " + todayC.get(Calendar.YEAR) + "년 " + (todayC.get(Calendar.MONTH)+1) + "월 " + todayC.get(Calendar.DATE) + "일");
        
        long dayGap = (today - destination)/(1000*60*60*24);
        
        
        if(dayGap == 0)
        {
            System.out.println("D-Day 입니다.");
        }
        else if(dayGap < 0)
        {
            System.out.println(-dayGap + "일 남았습니다.");
        }
        else
        {

            System.out.println(dayGap + "일 지났습니다.");
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
