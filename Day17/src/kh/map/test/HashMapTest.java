package kh.map.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest
{
    public void main()
    {
        
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(map.put("one",1));   // �ߺ��̾����� null, ������ ��������ȯ
        System.out.println(map.size());
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);
        map.put("four", 4);
        System.out.println(map);
        
        map.put("four", 5);             // key�ߺ����� four = 5
        System.out.println(map);
        
        map.put("six", 1);              // �� �ߺ��� ��������Ƿ� ����
        System.out.println(map);
        
        // ��ȸ
        System.out.println(map.get("three"));     
        System.out.println(map.get("4"));       // null
        
        
        // ����
        map.remove("one");
        System.out.println(map);
        
        // ������ put���̿��� �������
        map.put("four", 4);
        System.out.println(map);
        
        //Ű ���� �����ϴ��� Ȯ��
        System.out.println(map.containsKey("six"));     // true
        
        // Ű �� ��ü�� SetŸ�Կ� �־ ��ȯ
        Set<String> h = map.keySet();
        Iterator<String> iter = h.iterator();
        
        
        // ��üŽ��
        while(iter.hasNext())
        {
            String key = iter.next();
            System.out.println(key + "=" + map.get(key));
        }
        
        // �̰͵� �ǳ�
        ArrayList<String> al = new ArrayList<>(map.keySet());
        for(String s : al)
        {
            System.out.println(s + "=" + map.get(s));
        }
      

        
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "ù��°");
        map1.put(2, "�ι�°");
        map1.put(3, "����°");
        
     
        
        
    }
    
    
    
}
