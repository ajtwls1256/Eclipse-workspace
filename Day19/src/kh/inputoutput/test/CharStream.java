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
        System.out.print("���� �� ���ϸ� �Է� : ");
        String fileName = sc.next();
        sc.nextLine();
        
        try
        {
            fw = new FileWriter(fileName);
            System.out.println("[" + fileName + "] ���Ͽ� �Է��� ���� �Է�");
            int lineNumber = 1;
            
            while(true)
            {
                System.out.print((lineNumber++) + " : ");
                String str = sc.nextLine();
                
                if(str.equals("exit"))
                {
                    break;
                }
                
                fw.write(str + "\r\n");     // FileWriter�� byte�迭�� �ƴ� ���ڿ��� ���� �� �ֱ⶧����
                                            // \r\n�� ����Ʈ�迭�� ��ȯ���� �ʾƵ��Ǽ� ���ٶ� �߰����൵�ȴ�.
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
        System.out.print("���� �� ���ϸ� �Է� : ");
        String fileName = sc.next();
        sc.nextLine();
        
        BufferedWriter bw = null;
       
        try
        {
            FileWriter fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            
            System.out.println("[" + fileName + "] ���Ͽ� �Է��� ���� �Է�");
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
                bw.newLine();           // ����ó���� �޼ҵ�ȭ �Ǿ�����.
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
    
    // ������Ʈ���� �̿��� ���� �б�
    public void readFile()
    {
        System.out.print("�ε��� ���ϸ� �Է� : ");
        String fileName = sc.next();
        
        BufferedReader br = null;
        try
        {
            FileReader fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            int lineNumber = 1;
            
            while(true)
            {
                String line = br.readLine();    // ������ �о�� �о�� ���� ������ null�� return
            
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
