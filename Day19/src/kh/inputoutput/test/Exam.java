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
            System.out.println("1. 노트 새로 만들기");
            System.out.println("2. 노트 열기");
            System.out.println("3. 노트 열어서 수정하기");
            System.out.println("4. 끝내기");
            System.out.print("번호 입력 : ");
            int sel = sc.nextInt();
            sc.nextLine();
            
            switch(sel)
            {
                case 1: fileSave();
                // 새로 입력받아서 text파일로 저장
                    break;
                case 2: fileLoad();
                // 파일 불러와서 출력
                    break;
                case 3: fileEdit();
                // 파일을 불러와서 내용 추가
                    break;
                case 4: return;
            }
        }
    }
    
    public void fileSave()
    {
        System.out.print("파일에 저장할 내용을 입력하세요[종료 시 exit 입력]\n");

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
        
        System.out.print("저장하시겠습니까?(y/n) : ");
        char yORn = sc.next().charAt(0);
        
        if(yORn == 'n')
        {
            System.out.println("저장을 취소했습니다.");
            return;
        }
        
        System.out.print("저장할 파일 명 입력 : ");
        String fileName = sc.next();
        
     
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)))
        {
            bw.write(contents.toString());
            
            System.out.println(fileName + "에 성공적으로 저장하였습니다.");
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    public void fileLoad()
    {
        System.out.print("열어 볼 파일명 입력 : ");
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
            
            System.out.println("\n" + fileName + "에 있는 데이터를 읽어왔습니다.");
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
        System.out.print("수정할 파일명 입력 : ");
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
            
            System.out.print("파일에 추가할 내용을 입력하세요. [종료 시 exit 입력]\n");
            
            while(true)
            {
                String line = sc.nextLine() + "\r\n";
                
                if(line.equals("exit\r\n"))
                {
                    break;
                }
                
                contents.append(line);
            }
            
            
            System.out.print("변경된 내용을 파일에 추가하시겠습니까?(y/n) : ");
            char yORn = sc.next().charAt(0);
            
            if(yORn == 'n')
            {
                System.out.println("변경을 취소했습니다.");
                return;
            }
            
           
            
            System.out.println(contents.toString());
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(contents.toString());

            System.out.println(fileName + "의 내용이 변경되었습니다.");
            
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
            System.out.println("finally는 return이 되어도 실행이 될까?");
            return;
        }
        catch(Exception e)
        {
            
        }
        finally
        {
            System.out.println("finally는 return이 되어도 실행이 된다.");
        }
    }
    
}
