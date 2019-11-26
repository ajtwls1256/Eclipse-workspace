package kh.generic.run;

import kh.generic.test.Animal;
import kh.generic.test.Animal2;
import kh.generic.test.GenericEx;
import kh.generic.test.Lion;
import kh.generic.test.Panther;

public class Start
{
    
    public static void main(String[] args)
    {
        /*GenericEx<String,Integer> ge = new GenericEx<String,Integer>("Hello", 100);
        GenericEx<Integer, String> ge1 = new GenericEx<Integer, String>(10, "Bye");
        //GenericEx<int> ge2 = new GenericEx<int>(10);          // �������� ����
        
        
        
        System.out.println(ge.getData());
        System.out.println(ge.getData2());
        System.out.println(ge1.getData());
        System.out.println(ge1.getData2());*/
        
       
        
        
        
        Animal a1 = new Animal(new Panther(100));
        Animal a2 = new Animal(new Lion(200));
        
        // �������� �θ�Ÿ�Ժ����� �ڽİ�ü�� �ּҸ� ������ �� �ִ�.
        // ������ -> �������� �̿��ϸ� �ڽ�Ÿ�Կ��� �ִ� ������� ������ �� ����. -> �ٿ�ĳ����
       
        System.out.println( ((Lion)a2.data).hp );
        System.out.println( ((Panther)a1.data).hp );
        
        
        Animal2<Panther> a3 = new Animal2<Panther>(new Panther(100));
        Animal2<Lion> a4 = new Animal2<Lion>(new Lion(200));
        
        System.out.println(a3.data.hp);
        System.out.println(a4.data.hp);
        
    }
    
}
