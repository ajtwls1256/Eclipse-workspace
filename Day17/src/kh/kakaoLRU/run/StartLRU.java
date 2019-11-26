package kh.kakaoLRU.run;

import kh.kakaoLRU.lru.LRU;

public class StartLRU
{
    
    public static void main(String[] args)
    {
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        String[] cities2 = {"Jeju", "Pangyo", "NewYork", "newyork"};
        String[] cities3 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        String[] cities4 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        
        String[] cities5 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        String[] cities6 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        
        LRU lru = new LRU();
       
        System.out.println( lru.insert(0, cities) );
        System.out.println( lru.insert(2, cities2) );
        System.out.println( lru.insert(5, cities3) );
        System.out.println( lru.insert(2, cities4) );
        System.out.println( lru.insert(3, cities5) );
        System.out.println( lru.insert(3, cities6) );
        
    }
    
}
