package kh.inputoutput.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStream
{
    Scanner sc = new Scanner(System.in);
    
    public void primaryStream()
    {
        FileWriter fw = null;
        System.out.print("저장 할 파일명 입력 : ");
        String fileName = sc.next();
        sc.nextLine();
        
        try
        {
            fw = new FileWriter(fileName);
            System.out.println("[" + fileName + "] 파일에 입력할 내용 입력");
            int lineNumber = 1;
            
            while(true)
            {
                System.out.print((lineNumber++) + " : ");
                String str = sc.nextLine();
                
                if(str.equals("exit"))
                {
                    break;
                }
                
                fw.write(str + "\r\n");     // FileWriter도 byte배열이 아닌 문자열로 받을 수 있기때문에
                                            // \r\n을 바이트배열로 변환하지 않아도되서 써줄때 추가해줘도된다.
            }
  
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
                fw.close();
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
        System.out.print("저장 할 파일명 입력 : ");
        String fileName = sc.next();
        sc.nextLine();
        
        BufferedWriter bw = null;
       
        try
        {
            FileWriter fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            
            System.out.println("[" + fileName + "] 파일에 입력할 내용 입력");
            int lineNumber = 1;
            
            while(true)
            {
                System.out.print((lineNumber++) + " : ");
                String str = sc.nextLine();
                
                if(str.equals("exit"))
                {
                    break;
                }
                
                bw.write(str); 
                bw.newLine();           // 개행처리가 메소드화 되어있음.
            }
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
                bw.close();
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    // 보조스트림을 이용한 파일 읽기
    public void readFile()
    {
        System.out.print("로드할 파일명 입력 : ");
        String fileName = sc.next();
        
        BufferedReader br = null;
        try
        {
            FileReader fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            int lineNumber = 1;
            
            while(true)
            {
                String line = br.readLine();    // 한줄을 읽어옴 읽어올 값이 없으면 null을 return
            
                if(line == null)
                {
                    break;
                }
                
                System.out.println((lineNumber++) + " : " + line);
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
                br.close();
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
