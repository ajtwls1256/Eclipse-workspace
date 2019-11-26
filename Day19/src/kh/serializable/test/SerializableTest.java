package kh.serializable.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import kh.serializable.vo.UserInfo;

public class SerializableTest
{
    Scanner sc = new Scanner(System.in);
    UserInfo user = new UserInfo("이윤수","1234", 20, "서울");
    
    ArrayList<UserInfo> users = new ArrayList<>();
    
    public SerializableTest()
    {
        users.add(new UserInfo("이윤수1", "1234", 21, "서울1"));
        users.add(new UserInfo("이윤수2", "1234", 22, "서울2"));
        users.add(new UserInfo("이윤수3", "1234", 23, "서울3"));
        users.add(new UserInfo("이윤수4", "1234", 24, "서울4"));
        users.add(new UserInfo("이윤수5", "1234", 25, "서울5"));
    }
    
    
    public void main()
    {
        while(true)
        {
            System.out.println("1. 유저 정보 내보내기");
            System.out.println("2. 파일 읽어오기");
            System.out.print("선택 > ");
            
            switch(sc.nextInt())
            {
                case 1: objectOutput();
                    break;
                case 2: readObject();
                    break;
            }
        }
    }
    
    public void objectOutput()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
            oos.writeObject(users);
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
    
    public void readObject()
    {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt")))
        {
            ArrayList<UserInfo> al = (ArrayList<UserInfo>)ois.readObject();   // readObject의 반환형은 Object이므로 다운캐스팅
            
            for(UserInfo ui : al)
            {
                System.out.println(ui.getName());
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
        catch (ClassNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
