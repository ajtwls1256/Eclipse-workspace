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
        System.out.print("������ ���ϸ� �Է� : ");
        String fileName = sc.next();
        sc.nextLine();
        
        try
        {
            fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\" + fileName);       // �̶� ���� ����
            System.out.println("[" + fileName + "] ���Ͽ� ����� ���� �Է�");
            System.out.println("����� 'exit'�� �Է��ϼ���");
            int lineNumber = 1;
            while(true)
            {
                System.out.print((lineNumber++) + " : ");
                String str = sc.nextLine() + "\r\n"; //  \r\n = ������ ����ó�� ����(�������� \n)
                
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
                fos.close();            // stream ��ȯ
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
        System.out.print("������ ���� �� �Է� : ");
        String fileName = sc.next();
        sc.nextLine();
        
        DataOutputStream dos = null;
        
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\" + fileName);
            dos = new DataOutputStream(fos);    // ������Ʈ���� �ֽ�Ʈ���� �Ű������� �־������
            System.out.println("[" + fileName + "] ���Ͽ� ������ ���� �Է�");
            int lineNumber = 1;
            
            while(true)
            {
                System.out.print((lineNumber++) + " : ");
                String str = sc.nextLine();     // ������Ʈ���� ������ ���๮�� �ȳ־��൵��
                
                if(str.equals("exit"))
                {
                    break;
                }
                
                dos.writeChars(str);            // writeChars �޼ҵ带 �̿��� byte�迭�� �ƴ� ��Ʈ�� �״�� �Է�

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
                dos.close();            // ���������� �ֽ�Ʈ���� �˾Ƽ� ����
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    
    
    
    
    
    
    }
    
    
}
