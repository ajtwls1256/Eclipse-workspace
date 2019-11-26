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

        // �빮�ڷ� ��ȯ
        for(int i=0; i<cities.length; i++)
        {
            upperCiteis[i] = cities[i].toUpperCase();
        }
        
        
        
        for(int i=0; i<upperCiteis.length;i++)
        {
            String changeKey = null;
            int changeValue = 0;
            
            // �� ȸ������ ������ �ִ� value���� 1�� ����
            ArrayList<String> al = new ArrayList<>(cache.keySet());
            for(int j=0; j<al.size(); j++)
            {
                int newValue = cache.get(al.get(j)) + 1;
                cache.put(al.get(j), newValue);
                
                
                // ���� value���� ū(= �ֱٱ��� �������ʴ�) ��ġ�� Ű���� ����
                if(changeValue < newValue)
                {
                    changeValue = newValue; 
                    changeKey = al.get(j);
                }
                
            }
            
            
            // ĳ�ÿ� ���� �����Ҷ�
            if(cache.containsKey(upperCiteis[i]))
            {
                cache.put(upperCiteis[i], 0);
                runTime += cacheHit;
            }
            // �������� ������
            else
            {
                // ĳ�ð� ��á���� �����ϰ� 
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
