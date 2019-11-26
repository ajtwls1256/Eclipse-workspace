package kh.fileTest.test;

import java.io.File;
import java.util.Scanner;

public class FileTest
{
    Scanner sc = new Scanner(System.in);
    
    public void main()
    {
        // File Ŭ����
        // ������ �ٷ�µ� ���Ǵ� Ŭ����
        // ���� �޼ҵ�� ������ ������ �޾ƿ� �� ����
        
        System.out.print("���ϸ� �Է� : ");
        String fileName = sc.next();
        
        File file = new File("C:\\Users\\user1\\eclipse-workspace\\" + fileName); // ������ �ִ��� ������ ���� üũ�ϱ⶧���� ����ó�� ���ص���
        
        if(file.exists())
        {
            System.out.println("���ϸ� : " + file.getName());
            System.out.println("���� ����� : " + file.getPath());  // ������Ʈ ���� ��ġ����
            System.out.println("���� ������ : " + file.getAbsolutePath());  // C����̺� ���� ���
            System.out.println("���� ũ�� : " + file.length() + "Byte");     // byte ������ ����ũ��
        }
        else
        {
            System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
        }
        
        

        
    
    }
    
    
}
