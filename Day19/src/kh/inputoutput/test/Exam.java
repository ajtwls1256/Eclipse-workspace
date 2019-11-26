package kh.inputoutput.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exam
{
    Scanner sc = new Scanner(System.in);
    
    public void main()
    {
        while(true)
        {
            System.out.println("\n======= My Note =======");
            System.out.println("1. ��Ʈ ���� �����");
            System.out.println("2. ��Ʈ ����");
            System.out.println("3. ��Ʈ ��� �����ϱ�");
            System.out.println("4. ������");
            System.out.print("��ȣ �Է� : ");
            int sel = sc.nextInt();
            sc.nextLine();
            
            switch(sel)
            {
                case 1: fileSave();
                // ���� �Է¹޾Ƽ� text���Ϸ� ����
                    break;
                case 2: fileLoad();
                // ���� �ҷ��ͼ� ���
                    break;
                case 3: fileEdit();
                // ������ �ҷ��ͼ� ���� �߰�
                    break;
                case 4: return;
            }
        }
    }
    
    public void fileSave()
    {
        System.out.print("���Ͽ� ������ ������ �Է��ϼ���[���� �� exit �Է�]\n");

        StringBuilder contents = new StringBuilder();
        

        while(true)
        {
            String line = sc.nextLine() + "\r\n";
            
            if(line.equals("exit\r\n"))
            {
                break;
            }
            
            contents.append(line);
            
        }
        
        System.out.print("�����Ͻðڽ��ϱ�?(y/n) : ");
        char yORn = sc.next().charAt(0);
        
        if(yORn == 'n')
        {
            System.out.println("������ ����߽��ϴ�.");
            return;
        }
        
        System.out.print("������ ���� �� �Է� : ");
        String fileName = sc.next();
        
     
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)))
        {
            bw.write(contents.toString());
            
            System.out.println(fileName + "�� ���������� �����Ͽ����ϴ�.");
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    public void fileLoad()
    {
        System.out.print("���� �� ���ϸ� �Է� : ");
        String fileName = sc.next();
        
        System.out.println();
        
        try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            while(true)
            {
                String line = br.readLine();
                
                if(line == null)
                {
                    break;
                }
                
                System.out.println(line);
            }
            
            System.out.println("\n" + fileName + "�� �ִ� �����͸� �о�Խ��ϴ�.");
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e1)
        {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
    }
    
    public void fileEdit()
    {
        System.out.print("������ ���ϸ� �Է� : ");
        String fileName = sc.next();
        sc.nextLine();
        
        try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            StringBuilder contents = new StringBuilder();
            
            while(true)
            {
                String line = br.readLine();
                
                if(line == null)
                {
                    break;
                }
                
                contents.append(line + "\r\n");
            }
            
            System.out.println(contents.toString());
            
            System.out.print("���Ͽ� �߰��� ������ �Է��ϼ���. [���� �� exit �Է�]\n");
            
            while(true)
            {
                String line = sc.nextLine() + "\r\n";
                
                if(line.equals("exit\r\n"))
                {
                    break;
                }
                
                contents.append(line);
            }
            
            
            System.out.print("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�?(y/n) : ");
            char yORn = sc.next().charAt(0);
            
            if(yORn == 'n')
            {
                System.out.println("������ ����߽��ϴ�.");
                return;
            }
            
           
            
            System.out.println(contents.toString());
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(contents.toString());

            System.out.println(fileName + "�� ������ ����Ǿ����ϴ�.");
            
            bw.close();
            
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    public void finallyTest()
    {
        try
        {
            System.out.println("finally�� return�� �Ǿ ������ �ɱ�?");
            return;
        }
        catch(Exception e)
        {
            
        }
        finally
        {
            System.out.println("finally�� return�� �Ǿ ������ �ȴ�.");
        }
    }
    
}
