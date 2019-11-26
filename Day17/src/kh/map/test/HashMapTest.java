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
        System.out.println(map.put("one",1));   // 중복이없으면 null, 있으면 기존값반환
        System.out.println(map.size());
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);
        map.put("four", 4);
        System.out.println(map);
        
        map.put("four", 5);             // key중복으로 four = 5
        System.out.println(map);
        
        map.put("six", 1);              // 값 중복은 상관없으므로 가능
        System.out.println(map);
        
        // 조회
        System.out.println(map.get("three"));     
        System.out.println(map.get("4"));       // null
        
        
        // 삭제
        map.remove("one");
        System.out.println(map);
        
        // 수정은 put을이용해 덮어쓰기사용
        map.put("four", 4);
        System.out.println(map);
        
        //키 값이 존재하는지 확인
        System.out.println(map.containsKey("six"));     // true
        
        // 키 값 전체를 Set타입에 넣어서 반환
        Set<String> h = map.keySet();
        Iterator<String> iter = h.iterator();
        
        
        // 전체탐색
        while(iter.hasNext())
        {
            String key = iter.next();
            System.out.println(key + "=" + map.get(key));
        }
        
        // 이것도 되네
        ArrayList<String> al = new ArrayList<>(map.keySet());
        for(String s : al)
        {
            System.out.println(s + "=" + map.get(s));
        }
      

        
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "첫번째");
        map1.put(2, "두번째");
        map1.put(3, "세번째");
        
     
        
        
    }
    
    
    
}
