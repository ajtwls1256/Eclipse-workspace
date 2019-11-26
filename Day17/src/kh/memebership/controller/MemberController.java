package kh.memebership.controller;

import java.util.ArrayList;
import java.util.HashMap;

import kh.memebership.vo.Member;

public class MemberController
{
    private HashMap<String, Member> member = new HashMap<>();
    
    public boolean memberJoin(Member m)
    {
        // 이미 아이디가 있으면
        if(member.containsKey(m.getUserId()))
        {
            return false;
        }
        
        member.put(m.getUserId(), m);
        return true;
    }
    
    public boolean memberCheck(String userId)
    {
        return member.containsKey(userId);
    }
    
    public Member memberSelect(String userId)
    {
        ArrayList<String> al = new ArrayList<>(member.keySet());
        
        for(String s : al)
        {
            if(userId.equals(s))
            {
                return member.get(s);
            }
        }
        
        return null;
    }
    
    public boolean memberModify(Member m)
    {
        member.put(m.getUserId(), m);
        return true;
    }
    
    public boolean memberDelete(String userId)
    {
        if(!member.containsKey(userId))
        {
            return false;
        }
        
        member.remove(userId);
        return true;
    }
    
    
}
