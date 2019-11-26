package kh.inout.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InOut
{
    Scanner sc = new Scanner(System.in);
    
    StringBuilder data = new StringBuilder();
    
    public void main()
    {
        while(true)
        {
            System.out.println();
            
            System.out.println("1.���� �Է�");
            System.out.println("2.���� ���");
            System.out.println("3.���� ����");
            System.out.println("4.���� �ҷ�����");
            System.out.println("0.����");
            System.out.print("���� > ");
            int sel = sc.nextInt();
            sc.nextLine();
            
            switch(sel)
            {
                case 1: insertData();
                break;
                case 2: printData();
                break;
                case 3: saveData();
                break;
                case 4: loadData();
                break;
                case 0: System.out.println("���α׷��� �����մϴ�."); return;
            }
        }
        
        
    }
    
    public void insertData()
    {
        System.out.println();
        
        System.out.print("�̸� �Է� : ");
        String name = sc.next();
        System.out.print("���� �Է� : ");
        int age = sc.nextInt();
        System.out.print("�ּ� �Է� : ");
        sc.nextLine();
        String addr = sc.nextLine();
        
        data.delete(0, data.length());
        data.append(name + "/" + age + "/" + addr);
        
        System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
    }
    
    
    public void printData()
    {
        System.out.println();
        
        if(data.length() <= 0)
        {
            System.out.println("���� ������ �����ϴ�.");
            return;
        }
        
        StringTokenizer st = new StringTokenizer(data.toString(), "/");
        System.out.println("�̸� : " + st.nextToken());
        System.out.println("���� : " + st.nextToken());
        System.out.println("�ּ� : " + st.nextToken());

    }
    
    
    public void saveData()
    {
        System.out.println();
        
        if(data.length() <= 0)
        {
            System.out.println("���� ������ �����ϴ�.");
            return;
        }
        
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter("C:\\Users\\user1\\Desktop\\data.txt"));
            bw.write(data.toString());
            
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
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
    
    
    public void loadData()
    {
        System.out.println();
        
        BufferedReader br = null;
        
        try
        {
            br = new BufferedReader(new FileReader("C:\\Users\\user1\\Desktop\\data.txt"));
            
            String contents = br.readLine();
            
    
            data.delete(0, data.length());
            data.append(contents);
            
            System.out.println("�ҷ����Ⱑ �Ϸ�Ǿ����ϴ�.");
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
