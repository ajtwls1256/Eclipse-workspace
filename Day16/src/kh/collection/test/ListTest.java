package kh.collection.test;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest
{
    public void exam()
    {
        String [] arr = new String[3];  //���̰� 3�� �迭�� ����
        arr[0] = "Hello";
        arr[1] = "Hi";
        arr[2] = "Bye";
        
        System.out.println("�迭 ���");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
        
        
        
        ArrayList<String> al = new ArrayList<String>();
        // ����
        al.add("Hello");
        al.add("Hi");
        al.add("Bye");
        
        // ����
        al.set(1, "����");
        
        // ����
        al.remove(2);
        
        // ��ȸ
        System.out.println("ArrayList ���");
        for(int i=0; i < al.size(); i++)
        {
            System.out.println(al.get(i));
        }
        
        
        System.out.println();
        
        // for each����
        for(String str : al)
        {
            System.out.println(str);
        }
        
        
        // ��ü ����
//        al.clear();
//        for(int i=0; i < al.size(); i++)
//        {
//            System.out.println(al.get(i));
//        }
        
        
        
        
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(100);
        al2.add(90);
        al2.add(30);
        al2.add(50);
        
        System.out.println("���� �� ");
        for(Integer i : al2)
        {
            System.out.println(i);
        }
        
        Collections.sort(al2);          // ��������
        Collections.reverse(al2);       // �ݴ�� ����
        
        
        System.out.println("���� �� ");
        for(Integer i : al2)
        {
            System.out.println(i);
        }
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
