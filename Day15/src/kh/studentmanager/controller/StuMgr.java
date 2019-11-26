package kh.studentmanager.controller;

import kh.studentmanager.vo.Student;

public class StuMgr
{
    private Student[] s = new Student[10];
    private int index = 0;
    
    
    public StuMgr()
    {
        super();
        // TODO Auto-generated constructor stub
    }
   
    
    public void insert(String name, int age, String addr)
    {
        s[index++] = new Student(name, age, addr);
        
    }
    
    public void insert(Student s)
    {
        this.s[index++] = s;
        
    }
    
    public Student[] printAll()
    {
        return s;
    }
    
    public int getCount()
    {
        return index;
    }
    
    public int search(String name)
    {
        for(int i =0; i<index; i++)
        {
            if(s[i].getName().equals(name))
                return i;
        }
        
        return -1;
    }
    
    public Student printOne(int result)
    {
        return s[result];
    }
    
    public void updateStudent(Student s, int result)
    {
        this.s[result] = s;
    }
    
    public void deleteStudent(int result)
    {
        for(int i =result; i<index-1;i++)
        {
            s[i] = s[i+1];
        }
        
        s[--index] = null;
    }
    
    
}
