package kh.vo;

import java.util.Scanner;

public class ChangeChar
{
    // �빮�� �Է½� -> �ҹ���
    // �ҹ��� �Է½� -> �빮��
    
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("������ �Է� : ");
        char ch = sc.next().charAt(0);
  

        
        
        
        System.out.println("===== ��ȯ =====");
        
        
        
        char ch2 = change2(ch);
        
        
        System.out.println(ch2);
        
        
        
        
        
        
        
        
        
        

        
       /* int [] arr = {1,2,3,4,5};
        
       
        
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // arr -> ������ -> �ּҰ�
        // arr[0] -> 1 ����

        
        // �� �ѱ��
        test1(arr[0]); // 1
  
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        
        // �ּ� �ѱ��
        test2(arr);
        
        
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();*/
        
        
    }
    
    
    
    public void test1(int num)
    {
        num++;
        System.out.println("test1 �޼ҵ� ����");
        System.out.println(num);
    }
    
   
    
    public void test2(int [] array)
    {
        array[0] = 2;
        System.out.println("test2 �޼ҵ� ����");
        System.out.println(array[0]);
    }
    
    
    
    
    
    public char change2(char c)
    {
        char result = ' ';
        
        int gap = 'a' - 'A'; // 32
        
        // �ҹ����϶�
        if(c >= 'a' && c <= 'z')
        {
            // �빮�ڷ� �ٲ���      
            result = (char)(c - gap);
       
            
            //return (char)(c-32);
        }
        
        
            
        // �빮���϶�
        if(c >= 'A' && c <= 'Z')
        {
            result = (char)(c + gap);
        }
        
        return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    char change(char ch)
    {
        char result = ' ';
        int gap = 'a' - 'A';
        
        
        if(ch >= 'a' && ch <= 'z')
        {
            // �ҹ��� �� ���
            result = (char)(ch - gap);
        }
        else
        {
            // �빮�� �� ���
            result = (char)(ch + gap); 
        }
        
        return result;
        
        
        //�Ʒ��� �� �ڵ�
        //return (char)(ch^32); //�����ڴ� 32�� xor�ϸ� �˾Ƽ� ��/�빮�ڰ� �ٲ��� ���µ�
    }
    
    
}
