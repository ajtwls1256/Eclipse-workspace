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
    UserInfo user = new UserInfo("������","1234", 20, "����");
    
    ArrayList<UserInfo> users = new ArrayList<>();
    
    public SerializableTest()
    {
        users.add(new UserInfo("������1", "1234", 21, "����1"));
        users.add(new UserInfo("������2", "1234", 22, "����2"));
        users.add(new UserInfo("������3", "1234", 23, "����3"));
        users.add(new UserInfo("������4", "1234", 24, "����4"));
        users.add(new UserInfo("������5", "1234", 25, "����5"));
    }
    
    
    public void main()
    {
        while(true)
        {
            System.out.println("1. ���� ���� ��������");
            System.out.println("2. ���� �о����");
            System.out.print("���� > ");
            
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
            System.out.println("����Ϸ�");
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
            ArrayList<UserInfo> al = (ArrayList<UserInfo>)ois.readObject();   // readObject�� ��ȯ���� Object�̹Ƿ� �ٿ�ĳ����
            
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
