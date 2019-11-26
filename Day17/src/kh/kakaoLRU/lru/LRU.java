package kh.kakaoLRU.lru;

import java.util.ArrayList;
import java.util.HashMap;

public class LRU
{
    public int insert(int cacheSize, String[] cities)
    {
        int cacheHit = 1;
        int cacheMiss = 5;
        
        int runTime = 0;
       
        
        HashMap<String, Integer> cache = new HashMap<>(cacheSize);
       
        String [] upperCiteis = new String[cities.length];

        // 대문자로 변환
        for(int i=0; i<cities.length; i++)
        {
            upperCiteis[i] = cities[i].toUpperCase();
        }
        
        
        
        for(int i=0; i<upperCiteis.length;i++)
        {
            String changeKey = null;
            int changeValue = 0;
            
            // 각 회차마다 기존에 있던 value값을 1씩 증가
            ArrayList<String> al = new ArrayList<>(cache.keySet());
            for(int j=0; j<al.size(); j++)
            {
                int newValue = cache.get(al.get(j)) + 1;
                cache.put(al.get(j), newValue);
                
                
                // 가장 value값이 큰(= 최근까지 사용되지않는) 위치의 키값을 저장
                if(changeValue < newValue)
                {
                    changeValue = newValue; 
                    changeKey = al.get(j);
                }
                
            }
            
            
            // 캐시에 값이 존재할때
            if(cache.containsKey(upperCiteis[i]))
            {
                cache.put(upperCiteis[i], 0);
                runTime += cacheHit;
            }
            // 존재하지 않을때
            else
            {
                // 캐시가 꽉찼으면 삭제하고 
                if(cache.size() == cacheSize)
                {
                    cache.remove(changeKey);
                }
                
                cache.put(upperCiteis[i], 0);
                runTime += cacheMiss;
            }
        }
        
        return runTime;
        
    }
}
