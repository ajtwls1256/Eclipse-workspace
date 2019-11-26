package kh.vo;

import java.util.Scanner;

public class ArrayTest
{
    
    public void test1()
    {
        int [] arr = new int[5];
        // arr[0] ~ arr[4] ������ ���� �Ϸ�
        
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
        // �⺻�� �ʱ�ȭ �׽�Ʈ
        
        String[] a = new String[4];
        
        for(int i = 0;i < 4; i++)
            System.out.println(a[i]);
        
        char[] b = new char[2];
        for(int i = 0;i < 2; i++)
            System.out.println(b[i]);
  
    }
    
    public void test3()
    {
        String[] strArr = {"����", "������", "Ű��", "���", "�ٳ���"};
        
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
        System.out.println("�Է�");
        System.out.print("�������� : ");
        arr[0] = sc.nextInt();
        System.out.print("�������� : ");
        arr[1] = sc.nextInt();
        System.out.print("�������� : ");
        arr[2] = sc.nextInt();
        
        arr[3] = arr[0] + arr[1] + arr[2];
        
        System.out.println("-------------------------");
        System.out.println("���");
        System.out.println("���� : " + arr[0]);
        System.out.println("���� : " + arr[1]);
        System.out.println("���� : " + arr[2]);
        System.out.println("�հ� : " + arr[3]);
        System.out.printf("��� : %.2f", arr[3] / 3f);
        
        
    }
    
    public void test5()
    {
        int [] arr = new int[5];
        int sum = 0;
        
        for(int i = 0 ; i < arr.length; i ++)
        {
            System.out.print((i+1) + " ��° �л��� ���� : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        System.out.println("<< �Է��� �л����� ���� >>");
        for(int i = 0 ; i < arr.length; i ++)
        {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\n�л����� �� �հ� : " + sum);
        System.out.printf("�л����� ��� ���� : %.2f\n", (float)sum/arr.length);
        
  
        
    }
 
    public void test6()
    {
        //�迭�� ����
        
        int[] num1 = {10,20,30,40,50};
        int[] num2;
        
        // ���� ������ ���
        num2 = num1;
        num1[0] = 100;
        
        
        
        System.out.println(num1[0]);
        System.out.println(num2[0]);
        
        
        
        //���� ����
        //1. for���� �̿��� 1:1����
        int [] num3 = new int[num1.length];
        for(int i =0;i<num3.length;i++)
        {
            num3[i] = num1[i];
        }
        
        
        
        
        
        //2. clone() �޼ҵ带 �̿��� ���� , 1������� �ڵ�ȭ���ִ� ���
        int [] num4;
        num4 = num1.clone();
        
        //3. System.arraycopy()�޼ҵ带 �̿��� ����
        int [] num5 = new int[num1.length];
        System.arraycopy(num1, 0, num5, 0, num1.length);
        // ���� ���� �迭, �����迭�� ���°����?, ���� �纻 �迭, �纻�迭�� ���°����?,�����迭���� ���������?
        
        
        
        
    }


    public void test7()
    {
        System.out.print("���ڿ��� �ϳ� �Է��ϼ��� : ");
        String inputString = sc.next();
        
        System.out.println("�Է°� : " + inputString);
        System.out.print("�˻��� : ");
        char searchChar = sc.next().charAt(0);
        int sameChar = 0;
        
        
        for(int i=0; i<inputString.length(); i++)
        {
            if(inputString.charAt(i) == searchChar)
            {
                sameChar++;
            }
        }
        
        System.out.println("��� : �Է��Ͻ� ���ڿ� " + inputString + "���� \nã���ô� ���� " + searchChar + "�� " + sameChar + "�� �Դϴ�.");

    }
    
    public void test8()
    {

        System.out.print("��ȭ��ȣ �Է� : ");
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
        
        System.out.println("�Է¹��� ���� ��ȭ��ȣ�� : " + phoneNumber);
        System.out.print("'*' ó���� ��ȭ��ȣ�� ");
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }

        
    }

    public void test9()
    {
        System.out.print("�ֹε�Ϲ�ȣ �Է� : ");
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
        
        System.out.println("�Է¹��� �ֹε�Ϲ�ȣ�� : " + userID);
        System.out.print("'*' ó���� �ֹε�Ϲ�ȣ�� ");
        
        for(int i=0;i<copyID.length;i++)
        {
            System.out.print(copyID[i]);
        } 

    }
    
    public void test10()
    {
        System.out.print("Ȧ���� �迭�� ũ�⸦ �Է��ϼ��� : ");
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
        //System.arraycopy(original, 0, arr2, 0, original.length()); �̰͵� ������ ���.
        
        System.out.println("String�� " + original);
        System.out.println("String->char[] arraycopy ��� : " + arr2); 
        
        
      //String���� clone()�Լ��� ��� char[] -> String���� ����
        
        char [] original2 = {'1','2','3','4','5'};
        String cloneString = "";
        //cloneString = original2.clone();  -> �ƿ� original2�� �����ٷ� ������ ���.
        
        
        // �� ó���� �Ѱ� �ݴ���غ��� �ɱ�?
        System.arraycopy(original2, 0, cloneString, 0, original2.length);
        System.out.println("char[]->String arraycopy ��� : " + cloneString);
        
        
        // ����� String�� char[] ������ ��������� for���� ���� �ϳ��� �Ű��ִ°� �ܿ��� ����� ����.
    }

}
