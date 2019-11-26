package kh.object.run;

import kh.object.test.CloneTest;
import kh.object.test.TestObject;

public class Start
{
    
    public static void main(String[] args)
    {
        /*TestObject o = new TestObject();
        
        System.out.println(o);
        System.out.println(o.toString());
       
        TestObject o2 = new TestObject();
        System.out.println(o2);
        
        System.out.println(o.hashCode());
        System.out.println(o2.hashCode());*/
    

        CloneTest c1 = new CloneTest(10);
        CloneTest c2;
        
        c2 = (CloneTest) c1.clone();
        
        System.out.println(c1.getData());
        System.out.println(c2.getData());
       
        System.out.println(c1);
        System.out.println(c2);
        
        if(c1.equals(c2))
        {
            System.out.println("같다");   // 출력안됨
        }
            
        
    }
    
}
