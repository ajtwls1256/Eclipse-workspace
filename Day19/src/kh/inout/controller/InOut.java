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
            
            System.out.println("1.정보 입력");
            System.out.println("2.정보 출력");
            System.out.println("3.정보 저장");
            System.out.println("4.정보 불러오기");
            System.out.println("0.종료");
            System.out.print("선택 > ");
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
                case 0: System.out.println("프로그램을 종료합니다."); return;
            }
        }
        
        
    }
    
    public void insertData()
    {
        System.out.println();
        
        System.out.print("이름 입력 : ");
        String name = sc.next();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("주소 입력 : ");
        sc.nextLine();
        String addr = sc.nextLine();
        
        data.delete(0, data.length());
        data.append(name + "/" + age + "/" + addr);
        
        System.out.println("입력이 완료되었습니다.");
    }
    
    
    public void printData()
    {
        System.out.println();
        
        if(data.length() <= 0)
        {
            System.out.println("현재 정보가 없습니다.");
            return;
        }
        
        StringTokenizer st = new StringTokenizer(data.toString(), "/");
        System.out.println("이름 : " + st.nextToken());
        System.out.println("나이 : " + st.nextToken());
        System.out.println("주소 : " + st.nextToken());

    }
    
    
    public void saveData()
    {
        System.out.println();
        
        if(data.length() <= 0)
        {
            System.out.println("현재 정보가 없습니다.");
            return;
        }
        
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter("C:\\Users\\user1\\Desktop\\data.txt"));
            bw.write(data.toString());
            
            System.out.println("저장이 완료되었습니다.");
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
            
            System.out.println("불러오기가 완료되었습니다.");
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
