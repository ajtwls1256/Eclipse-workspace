package kh.collectionstudent.controller;

import java.util.ArrayList;

import kh.collectionstudent.vo.Student;

public class StudentController
{
    private ArrayList<Student> s = new ArrayList<Student>();

    public StudentController()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public StudentController(ArrayList<Student> s)
    {
        super();
        this.s = s;
    }
    
    public ArrayList<Student> selectAll()
    {
        return s;
    }
    
    public Student selectOne(int classNumber)
    {
        int index = search(classNumber);
        
        if(index == -1)
        {
            return null;
        }
        
        return s.get(index);
    }
    
    public void insertStudent(Student s)
    {
        this.s.add(s);
    }
    
    public void updateStudent(Student oldStudent, Student newStudent)
    {
        //int index = search(oldStudent.getClassNumber());
        //s.set(index, newStudent);
        
        for(int i=0; i<s.size();i++)
        {
            if(s.get(i).equals(oldStudent))
            {
                s.set(i, newStudent);
            }
        }
        
   
    }
    
    public void updateStudent(int index, Student newStudent)
    {
        s.set(index, newStudent);
    }
    
    public void deleteStudent(int classNumber)
    {
        int index = search(classNumber);
        
        if(index == -1)
        {
            System.out.println("�������� �ʴ� �л��Դϴ�!");
            return;
        }
        
        s.remove(index);
        System.out.println("�л� ���� ������ �Ϸ�Ǿ����ϴ�!");
    }
    
    
    
    
    
    
    
    
    
    
    public int search(int classNumber)
    {
        for(int i=0; i<s.size(); i++)
        {
            if(classNumber == s.get(i).getClassNumber())
                return i;
        }
        
        return -1;

    }
    
    
    
}
