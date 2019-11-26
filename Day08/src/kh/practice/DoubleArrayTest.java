package kh.practice;

public class DoubleArrayTest
{
    public void test1()
    {
        int [][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int [][] arr1 = new int[3][4];
 
        
        int num = (arr1.length) * (arr1[1].length);
        
        //arr1 = arr.clone();
        
        
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[i].length; j++)
            {
                arr1[i][j] = num--;
                
                System.out.print(arr1[i][j] + "\t");
            }
            
            System.out.println();
        }
        
        
        System.out.println();
        System.out.println();
        
        
        int [][] arr2 = new int [5][5];
        

        
        for(int i=0; i<arr2.length; i++)
        {
            for(int j=0; j<arr2[i].length; j++)
            {
                arr2[i][j] = ((i+1) * 5) - j;
                
                System.out.print(arr2[i][j] + "\t");
            }
            
            System.out.println();
        }
        
        
        
        System.out.println();
        System.out.println();
        
        
        int [][] arr3 = new int [5][5];
        
        
        for(int i=0; i<arr3.length; i++)
        {
            for(int j=0; j<arr3[i].length; j++)
            {
                arr3[i][j] = (i + 1) + (j * 5);
                
                System.out.print(arr3[i][j] + "\t");
            }
            
            System.out.println();
        }
        
        
        
        System.out.println();
        System.out.println();
        
        
        int [][] arr4 = new int [5][5];
        
        
        for(int i=0; i<arr4.length; i++)
        {
            for(int j=0; j<arr4[i].length; j++)
            {
                arr4[i][j] = ((j + 1) * 5) - i;
                
                System.out.print(arr4[i][j] + "\t");
            }
            
            System.out.println();
        }
        
        
        
        System.out.println();
        System.out.println();
        
        
        int [][] arr5 = new int [5][5];
        
        
        for(int i=0; i<arr5.length; i++)
        {
            for(int j=0; j<arr5[i].length; j++)
            {
                if(i % 2 != 0)
                {
                    arr5[i][j] = ((i+1) * 5) - j;
                }
                else
                {      
                    arr5[i][j] = (i*5) + (j+1);
                }
                
                System.out.print(arr5[i][j] + "\t");
            }
            
            System.out.println();
        }
        
        
        
        System.out.println();
        System.out.println();
        
        
        int [][] arr6 = new int [5][5];
        
        
        for(int i=0; i<arr6.length; i++)
        {
            for(int j=0; j<arr6[i].length; j++)
            {
                
                if(i % 2 != 0)
                {
                    arr6[i][j] = (i*5) + (j+1);
                }
                else
                {      
                    arr6[i][j] = ((i+1) * 5) - j;
                }

                System.out.print(arr6[i][j] + "\t");
            }
            
            System.out.println();
        }
        
        
        
        System.out.println();
        System.out.println();
        
        
        int [][] arr7 = new int [5][5];
        
        
        for(int i=0; i<arr7.length; i++)
        {
            for(int j=0; j<arr7[i].length; j++)
            {
                
                if(j % 2 != 0)
                {
                    arr7[i][j] = ((j+1) * 5) - i;
                }
                else
                {
                    arr7[i][j] = (i+1) + (j*5);
                }   
               
                System.out.print(arr7[i][j] + "\t");
            }
            
            System.out.println();
        }
        
        
        
        System.out.println();
        System.out.println();
        
        
        int [][] arr8 = new int [5][5];
        
        
        for(int i=0; i<arr8.length; i++)
        {
            for(int j=0; j<arr8[i].length; j++)
            {
                
                if(j % 2 != 0)
                {
                    arr8[i][j] = (j*5) + (i+1);
                }
                else
                {
                    arr8[i][j] = ((j+1)*5) - i;
                }   
               
                System.out.print(arr8[i][j] + "\t");
            }
            
            System.out.println();
        }
        
        
        

        System.out.println();
        System.out.println();
        
        
        
        
        
        
        
       /* System.out.println(arr.hashCode());
        System.out.println(arr1[0].hashCode());
        System.out.println(arr1[1].hashCode());
        System.out.println(arr1[2].hashCode());
        
        System.out.println();
        
        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr1[0]));
        System.out.println(System.identityHashCode(arr1[1]));
        System.out.println(System.identityHashCode(arr1[2]));*/
       
    }
    
    
}
