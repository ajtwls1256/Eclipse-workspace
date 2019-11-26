package kh.vo;

import java.util.Scanner;

public class ArrayTest
{
    
    public void test1()
    {
        int [] arr = new int[5];
        // arr[0] ~ arr[4] 변수가 생성 완료
        
        /*arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/
        
        for(int i = 0; i < 5 ; i++)
        {
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
        
        System.out.println("arr1");
        int [] arr1 = {1,2,3,4,5};
        for(int i =0; i<5; i++)
            System.out.println(arr[i]);
        
        
        String [] strArr = new String[5];
        String [] strArr1 = {"a","b","c","d","e"};
        for(int i =0; i<5; i++)
            System.out.println(strArr1[i]);
        
    }
    
    
    public void test2()
    {
        // 기본값 초기화 테스트
        
        String[] a = new String[4];
        
        for(int i = 0;i < 4; i++)
            System.out.println(a[i]);
        
        char[] b = new char[2];
        for(int i = 0;i < 2; i++)
            System.out.println(b[i]);
  
    }
    
    public void test3()
    {
        String[] strArr = {"딸기", "복숭아", "키위", "사과", "바나나"};
        
        System.out.println(strArr[4]);
        
        System.out.println(strArr.length);
        
        for(int i =0; i<strArr.length; i++)
            System.out.println(strArr[i]);
        
        
    }
    
    Scanner sc = new Scanner(System.in);
    
    
    public void test4()
    {
        int arr[] = new int[4];
        
        System.out.println("-------------------------");
        System.out.println("입력");
        System.out.print("국어점수 : ");
        arr[0] = sc.nextInt();
        System.out.print("영어점수 : ");
        arr[1] = sc.nextInt();
        System.out.print("수학점수 : ");
        arr[2] = sc.nextInt();
        
        arr[3] = arr[0] + arr[1] + arr[2];
        
        System.out.println("-------------------------");
        System.out.println("출력");
        System.out.println("국어 : " + arr[0]);
        System.out.println("영어 : " + arr[1]);
        System.out.println("수학 : " + arr[2]);
        System.out.println("합계 : " + arr[3]);
        System.out.printf("평균 : %.2f", arr[3] / 3f);
        
        
    }
    
    public void test5()
    {
        int [] arr = new int[5];
        int sum = 0;
        
        for(int i = 0 ; i < arr.length; i ++)
        {
            System.out.print((i+1) + " 번째 학생의 성적 : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        System.out.println("<< 입력한 학생들의 성적 >>");
        for(int i = 0 ; i < arr.length; i ++)
        {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\n학생들의 총 합계 : " + sum);
        System.out.printf("학생들의 평균 점수 : %.2f\n", (float)sum/arr.length);
        
  
        
    }
 
    public void test6()
    {
        //배열의 복사
        
        int[] num1 = {10,20,30,40,50};
        int[] num2;
        
        // 얕은 복사의 방법
        num2 = num1;
        num1[0] = 100;
        
        
        
        System.out.println(num1[0]);
        System.out.println(num2[0]);
        
        
        
        //깊은 복사
        //1. for문을 이용한 1:1복사
        int [] num3 = new int[num1.length];
        for(int i =0;i<num3.length;i++)
        {
            num3[i] = num1[i];
        }
        
        
        
        
        
        //2. clone() 메소드를 이용한 복사 , 1번방법을 자동화해주는 기능
        int [] num4;
        num4 = num1.clone();
        
        //3. System.arraycopy()메소드를 이용한 복사
        int [] num5 = new int[num1.length];
        System.arraycopy(num1, 0, num5, 0, num1.length);
        // 복사 원본 배열, 원본배열의 몇번째부터?, 복사 사본 배열, 사본배열의 몇번째부터?,원본배열에서 몇개넣을꺼야?
        
        
        
        
    }


    public void test7()
    {
        System.out.print("문자열을 하나 입력하세요 : ");
        String inputString = sc.next();
        
        System.out.println("입력값 : " + inputString);
        System.out.print("검색값 : ");
        char searchChar = sc.next().charAt(0);
        int sameChar = 0;
        
        
        for(int i=0; i<inputString.length(); i++)
        {
            if(inputString.charAt(i) == searchChar)
            {
                sameChar++;
            }
        }
        
        System.out.println("출력 : 입력하신 문자열 " + inputString + "에서 \n찾으시는 문자 " + searchChar + "은 " + sameChar + "개 입니다.");

    }
    
    public void test8()
    {

        System.out.print("전화번호 입력 : ");
        String phoneNumber = sc.next();
        //010-1111-1111
        
        char[] arr = new char[13];
        
        for(int i=0;i<arr.length;i++)
        {
            if(i >= 4 && i <= 7)
            {
                arr[i] = '*';
            }
            else
            {    
                arr[i] = phoneNumber.charAt(i);
            }
        }
        
        System.out.println("입력받은 원본 전화번호는 : " + phoneNumber);
        System.out.print("'*' 처리된 전화번호는 ");
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }

        
    }

    public void test9()
    {
        System.out.print("주민등록번호 입력 : ");
        String userID = sc.next();
        
        char [] copyID = new char[14];
        
        for(int i =0; i<userID.length(); i++)
        {
            if(i >= 8)
            {
                copyID[i] = '*';
            }
            else
            {
                copyID[i] = userID.charAt(i);
            }
        }
        
        System.out.println("입력받은 주민등록번호는 : " + userID);
        System.out.print("'*' 처리된 주민등록번호는 ");
        
        for(int i=0;i<copyID.length;i++)
        {
            System.out.print(copyID[i]);
        } 

    }
    
    public void test10()
    {
        System.out.print("홀수인 배열의 크기를 입력하세요 : ");
        int arrScale = sc.nextInt();
        
        int [] arr = new int[arrScale];
        
        int startNum = 0;
        
        for(int i=0; i < arr.length; i++)
        {
            if(i <= (arr.length/2))
            {
                arr[i] = ++startNum;
            }
            else
            {
                arr[i] = --startNum;
            }
              
        }
        
        System.out.print("[ ");
        
        for(int i=0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        
        System.out.print(arr[arr.length - 1] + " ]");
        
        
        
    }
    
    
    public void stringCharCopyTest()
    {
        String original = "12345";
       
        char[] arr2 = new char[13];
        //System.arraycopy(original, 0, arr2, 0, original.length()); 이것도 오류가 뜬다.
        
        System.out.println("String은 " + original);
        System.out.println("String->char[] arraycopy 결과 : " + arr2); 
        
        
      //String에는 clone()함수가 없어서 char[] -> String으로 실험
        
        char [] original2 = {'1','2','3','4','5'};
        String cloneString = "";
        //cloneString = original2.clone();  -> 아예 original2에 빨간줄로 오류가 뜬다.
        
        
        // 맨 처음에 한거 반대로해보면 될까?
        System.arraycopy(original2, 0, cloneString, 0, original2.length);
        System.out.println("char[]->String arraycopy 결과 : " + cloneString);
        
        
        // 결론은 String과 char[] 사이의 깊은복사는 for문을 통해 하나씩 옮겨주는것 외에는 방법이 없다.
    }

}
