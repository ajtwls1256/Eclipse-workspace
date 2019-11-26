package kh.inputoutput.test;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest
{
    Scanner sc = new Scanner(System.in);
    
    public void primaryStream()
    {
        FileOutputStream fos = null;
        System.out.print("저장할 파일명 입력 : ");
        String fileName = sc.next();
        sc.nextLine();
        
        try
        {
            fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\" + fileName);       // 이때 파일 생성
            System.out.println("[" + fileName + "] 파일에 저장될 내용 입력");
            System.out.println("종료는 'exit'를 입력하세요");
            int lineNumber = 1;
            while(true)
            {
                System.out.print((lineNumber++) + " : ");
                String str = sc.nextLine() + "\r\n"; //  \r\n = 윈도우 개행처리 문자(리눅스는 \n)
                
                if(str.equals("exit\r\n"))
                {
                    break;
                }
                
                try
                {
                    fos.write(str.getBytes());
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally 
        {
            try
            {
                fos.close();            // stream 반환
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public void subStream()
    {
        System.out.print("저장할 파일 명 입력 : ");
        String fileName = sc.next();
        sc.nextLine();
        
        DataOutputStream dos = null;
        
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\" + fileName);
            dos = new DataOutputStream(fos);    // 보조스트림은 주스트림을 매개변수로 넣어줘야함
            System.out.println("[" + fileName + "] 파일에 저장할 내용 입력");
            int lineNumber = 1;
            
            while(true)
            {
                System.out.print((lineNumber++) + " : ");
                String str = sc.nextLine();     // 보조스트림은 윈도우 개행문자 안넣어줘도됨
                
                if(str.equals("exit"))
                {
                    break;
                }
                
                dos.writeChars(str);            // writeChars 메소드를 이용해 byte배열이 아닌 스트링 그대로 입력

            }
            
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        finally
        {
            try
            {
                dos.close();            // 보조닫으면 주스트림은 알아서 닫힘
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    
    
    
    
    
    
    }
    
    
}
