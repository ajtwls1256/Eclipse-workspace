package kh.run;

import kh.PointMgrPjt.controller.PointMgr;
import kh.vo.Animal;
import kh.vo.Cat;
import kh.vo.Tiger;

public class Run
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        
     /*   PointMgr pmg = new PointMgr();
        pmg.main();*/
        
//        Animal t = new Tiger();
//        t.eating();
//        ((Tiger)t).eating();
//        ((Tiger)t).hunting();
//        
//        
//        Animal a = new Animal();
//        a.eating();
//        a = t;
//        a.eating();
        
//        Animal a = new Animal();
//        a.eating();
//        
//        Tiger g = new Tiger();
//        g.hunting();
//        g.eating();
        
        // 다형성
        // 부모는 자식타입을 받아줄수있다. 자식은 부모를 받지못함

        // 오버라이딩
        // 부모의 메소드를 재정의해서 사용할 수 있다.
        Animal a = new Animal();
        
        Tiger t = new Tiger();
        Cat c = new Cat();
        
        a.hunting();
        t.hunting();
        c.hunting();
        
        a = c;
        a.hunting();
        a = t;
        a.hunting();
        
      
        
        
        
        

        

        
        
    }
    

    

    
}
