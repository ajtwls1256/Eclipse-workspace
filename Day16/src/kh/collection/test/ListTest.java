package kh.collection.test;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest
{
    public void exam()
    {
        String [] arr = new String[3];  //길이가 3인 배열을 선언
        arr[0] = "Hello";
        arr[1] = "Hi";
        arr[2] = "Bye";
        
        System.out.println("배열 출력");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
        
        
        
        ArrayList<String> al = new ArrayList<String>();
        // 삽입
        al.add("Hello");
        al.add("Hi");
        al.add("Bye");
        
        // 수정
        al.set(1, "변경");
        
        // 삭제
        al.remove(2);
        
        // 조회
        System.out.println("ArrayList 출력");
        for(int i=0; i < al.size(); i++)
        {
            System.out.println(al.get(i));
        }
        
        
        System.out.println();
        
        // for each문법
        for(String str : al)
        {
            System.out.println(str);
        }
        
        
        // 전체 삭제
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
        
        System.out.println("정렬 전 ");
        for(Integer i : al2)
        {
            System.out.println(i);
        }
        
        Collections.sort(al2);          // 오름차순
        Collections.reverse(al2);       // 반대로 뒤집
        
        
        System.out.println("정렬 후 ");
        for(Integer i : al2)
        {
            System.out.println(i);
        }
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
