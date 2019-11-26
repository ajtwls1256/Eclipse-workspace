package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import kh.java.test.UserInfo;
import vo.DateList;

public class ControllerDiary
{
    ArrayList<DateList> alm = new ArrayList<DateList>(); 
    
    
    public void search(int month, int day) {
        String fileName = month + "월";
        boolean bool = false;
        boolean bool2 = true;
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        BufferedWriter bw = null;
        StringBuffer sb = new StringBuffer();
        
        try
        {
            FileReader fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            while(true) { // StringBuffer에 1일 할 일 저장
                
                String line = br.readLine();
                
                if(line.equals(day+1+"일") && bool) {
                    break; 
                }
                
                if(line.equals(day + "일")) {
                    bool = true;
                }
                if(bool) {
                    sb.append(line+"\r\n");
                }
               
            }
            
            sc.nextLine();
            
            System.out.print("수정할 내용 입력 : ");
            String str = sc.nextLine();
            
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            
        }
    }
    
    
    public void updateDiary(int month, int day) {
        String fileName = month + "월";
        boolean bool = false;
        boolean bool2 = true;
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        BufferedWriter bw = null;
        StringBuffer sb = new StringBuffer();
        
        try
        {
            FileReader fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            while(bool2) { // StringBuffer에 1일 할 일 저장
                String line = br.readLine();
                
                if(line == day + "일") {
                    bool = true;
                }
                if(bool) {
                    sb.append(line+"\r\n");
                }
                
                if(line == null && bool) {
                    bool = false;
                    bool2 = false; 
                }
            }
            
            sc.nextLine();
            
            System.out.print("수정할 내용 입력 : ");
            String str = sc.nextLine();
           
            
            
            
           
            
            
            
            
            
            
            
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            
        }
        
        
      
        
        
        
    }
    public void searchDiary(int month,int date) {
        
    } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
    } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
    } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
    }
        
        
        
        
        
    }
    
    
    public void deleteDiary(int month, int date) {
        
        for(int i = 0; i < mlist.size(); i++) {
            if(mlist.get(i).date == date) {
                for(int j = 0; j < nlist.size();j++) {
                    mlist.get(i).get(j)
                }
            }
        }
        
        
       for(int i = 0; i < list.size(); i ++) {
           if(list.get(i).get(1))
           
           
           
       }
        
        
        
        
        
        
        
        
        
        
    }
}
