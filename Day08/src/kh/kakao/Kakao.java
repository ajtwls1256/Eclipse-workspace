package kh.kakao;

import java.util.Scanner;

public class Kakao
{
    public void main()
    {
        int [] arr1 = {9, 20, 28, 18, 11};
        int [] arr2 = {30, 1, 21, 17, 28};
        
        kakao(5, arr1, arr2);
        
        System.out.println();
        
        int [] arr3 = {46, 33, 33, 22, 31, 50};
        int [] arr4 = {27, 56, 19, 14, 14, 10};
        kakao(6, arr3, arr4);
 
        System.out.println();
        
        kakaoInsert();
    }
    
    
    public void kakao(int n, int[] arr1, int[] arr2)
    {
        int DIGIT = n;
        
        int [][] result = new int[DIGIT][DIGIT];
        

        for(int i = 0;i < arr1.length; i++)
        {
            int arr1Num = arr1[i];
            int arr2Num = arr2[i];
            
            
            // 2진수 배열 계산
            for(int j = DIGIT-1; j >= 0; j--)
            {
                // 1번 배열
                int left = arr1Num % 2;
                arr1Num /= 2;

                
                // 2번 배열      
                int left2 = arr2Num % 2;
                arr2Num /= 2;
                
                // 둘이 & 연산
                if(left == 1 || left2 == 1)
                {
                    result[i][j] = 1;
                }
            }

        }
        
        for(int i = 0;i < result.length; i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(int i = 0;i < result.length; i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                if(result[i][j] == 1)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    
    
    public void kakaoInsert()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("배열 크기 입력 : ");
        int digit = sc.nextInt();
        
        int [] arr1 = new int[digit];
        int [] arr2 = new int[digit];
        
        System.out.println("= = = = = 첫번째 배열 = = = = =");
        for(int i=0; i<digit; i++)
        {
            System.out.print((i+1) + "번째 행 숫자 입력 (범위 0~" + (int)(Math.pow(2, digit) - 1) +"): ");
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("= = = = = 두번째 배열 = = = = =");
        for(int i=0; i<digit; i++)
        {
            System.out.print((i+1) + "번째 행 숫자 입력 (범위 0~" + (int)(Math.pow(2, digit) - 1) +"): ");
            arr2[i] = sc.nextInt();
        }
        
        
        kakao(digit, arr1, arr2);
        
    }
    
    
    
    
    public void test()
    {
        int [] arr1 = {9, 20, 28, 18, 11};
        
        int arr1Num = arr1[0];
        
        int [] arr1Binary = new int[5];
        
        
        for(int j = 4; j >= 0; j--)
        {
            if(arr1Num <= 0)
                break;
            
            int left = arr1Num % 2;
            arr1Binary[j] = left;
            arr1Num /= 2;
            
            System.out.println(left);
        }
        
        for(int i = 0; i< arr1Binary.length; i++)
        {
            System.out.print(arr1Binary[i]);
        }
    }
    
    
    
}
