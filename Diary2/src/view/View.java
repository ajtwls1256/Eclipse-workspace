package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import controller.Controller;
import vo.Content;

public class View
{
    Scanner sc = new Scanner(System.in);
    
    Content content = new Content();
    
    Controller controller = new Controller();
    
    public void main()
    {
        while (true)
        {
            System.out.println("========다이어리=========");
            System.out.println("1. 쓰기");
            System.out.println("2. 1일 보기");
            System.out.println("3. 전체 출력");
            System.out.println("4. 삭제");
            System.out.print("선택 >");
            switch (sc.nextInt())
            {
                case 1:
                    add();
                    break;
                case 2:
                    printOne();
                    break;
                case 3:
                    printAll();
                    break;
                case 4:
                    deleteDiary();
                    break;
            }
        }
    }
    
    public void add()
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("첫번째글 입니다");
        arr.add("두번째글 입니다");
        Content c1 = new Content(1, arr);
        Content c2 = new Content(1, arr);
        Content c3 = new Content(1, arr);
        
        ObjectOutputStream oos = null;
        try
        {
            FileOutputStream fos = new FileOutputStream(
                    "C:\\Users\\user1\\Desktop\\" + "12.txt");
            oos = new ObjectOutputStream(fos);
            ArrayList<Content> list = new ArrayList<Content>();
            
            list.add(c1);
            list.add(c2);
            list.add(c3);
            oos.writeObject(list);
            System.out.println("저장완료");
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
                oos.close();
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public void printOne()
    {
        System.out.print("월 검색 > ");
        String month = sc.next();
        System.out.print("일 검색 > ");
        int day = sc.nextInt();
        
        ArrayList<Content> list = controller.searchMonthList(month);
        
        System.out.println("------------------------");
        System.out.println(month + "월" + day + "일");
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getDay() == day)
            {
                System.out
                        .println((i + 1) + ". " + list.get(i).getList().get(i));
            }
        }
        System.out.println("------------------------");
    }
    
    public void printAll()
    {
        System.out.print("월 검색 > ");
        String month = sc.next();
        
        ArrayList<Content> list = controller.searchMonthList(month);
        for (Content c : list)
        {
            System.out.println("------------------------");
            System.out.println(month + "월" + c.getDay() + "일");
            for (int i = 0; i < c.getList().size(); i++)
            {
                System.out.println(i + ". " + c.getList().get(i));
            }
            System.out.println("------------------------");
        }
    }
    
    public void deleteDiary()
    {
        ObjectOutputStream oos = null;
        
        System.out.print("월 검색 > ");
        String month = sc.next();
        System.out.print("일 검색 > ");
        int day = sc.nextInt();
        
        FileOutputStream fos;
        try
        {
            fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\" + month +".txt");
            oos = new ObjectOutputStream(fos);
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
        
        ArrayList<Content> list = controller.searchMonthList(month);
        
        System.out.println("------------------------"); // 날짜 할 일 출력
        System.out.println(month + "월" + day + "일");
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getDay() == day)
            {
                System.out.println((i + 1) + ". "
                        + list.get(i).getList().get(i));
            }
        }
        System.out.println("------------------------");
        
        System.out.print("삭제 할 일정 선택 > ");
        int input = sc.nextInt();
        
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getDay() == day)
            {
                list.get(i).getList().remove(input - 1);
            }
        }
        
        try
        {
            oos.writeObject(list);
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
                oos.close();
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        System.out.println("삭제를 완료하였습니다.");
    }
    
}
