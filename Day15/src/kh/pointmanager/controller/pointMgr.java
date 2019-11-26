package kh.pointmanager.controller;

import kh.pointmanager.vo.Grade;

public class pointMgr
{
    Grade [] member = new Grade[20];
    int mIndex = 0;
    
    
    public void insert(Grade g)
    {
        this.member[mIndex++] = g;
    }
    
    public Grade[] getMember()
    {
        return member;
    }
    
    public int getMemberIndex()
    {
        return mIndex;
    }
    
    public int search(String name)
    {
        for(int i =0; i<mIndex; i++)
        {
            if(name.equals(member[i].getName()))
            {
                return i;
            }
        }
        
        return -1;

    }
    
    public void update(Grade g, int index)
    {
        this.member[index] = g;
    }
    
    public void delete(int index)
    {
        for(int i =index; i<mIndex; i++)
        {
            member[i] = member[i+1];
        }
        
        member[--mIndex] = null;
    }
    
}
