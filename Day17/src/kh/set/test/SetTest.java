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
        
        System.out.println(data.add(10));       // add�ϸ� true/false ��ȯ
        System.out.println(data);
        System.out.println(data.add(20));
        System.out.println(data);
        System.out.println(data.add(30));
        System.out.println(data);
        System.out.println(data.add(10));       // false
        System.out.println(data);               // �ִ� �������ִ°� ������ �����͸� ���̳����� ������ ������ = ��������
        

        Iterator<Integer> iteratorData = data.iterator();       // data�� HashSet���� Iterator�� �����Ͽ� �Ѱ���
        iteratorData.hasNext();         // ������ �����Ͱ� ������ true, ������ false
        int num1 = iteratorData.next(); // �� �Ѱ� �������� iterator���� ����

        // ��ü ��ȸ
        while(iteratorData.hasNext())
        {
            System.out.println(iteratorData.next());
        }
        
        // �����ؼ� ����ϰ������ ArrayList�� �ְ� ����
        ArrayList<Integer> al = new ArrayList<Integer>(data);
        Collections.sort(al);
        System.out.println(al);
        
    }
}
