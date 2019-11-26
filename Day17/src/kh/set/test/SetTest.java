package kh.set.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest
{
    public void main()
    {
        HashSet<Integer> data = new HashSet<Integer>();
        
        System.out.println(data.add(10));       // add하면 true/false 반환
        System.out.println(data);
        System.out.println(data.add(20));
        System.out.println(data);
        System.out.println(data.add(30));
        System.out.println(data);
        System.out.println(data.add(10));       // false
        System.out.println(data);               // 넣는 순서가있는것 같지만 데이터를 많이넣으면 순서가 없어짐 = 순서없음
        

        Iterator<Integer> iteratorData = data.iterator();       // data의 HashSet값을 Iterator로 복사하여 넘겨줌
        iteratorData.hasNext();         // 꺼내올 데이터가 있으면 true, 없으면 false
        int num1 = iteratorData.next(); // 값 한개 꺼내오고 iterator에서 삭제

        // 전체 조회
        while(iteratorData.hasNext())
        {
            System.out.println(iteratorData.next());
        }
        
        // 정렬해서 출력하고싶으면 ArrayList에 넣고 정렬
        ArrayList<Integer> al = new ArrayList<Integer>(data);
        Collections.sort(al);
        System.out.println(al);
        
    }
}
