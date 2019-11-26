package kh.vo;

public class BubleSort
{

    public void main()
    {
        /*int [] arr = new int[2];
        arr[0] = 3;
        arr[1] = 5;
        if(arr[0] > arr[1])
        {
            int tmp = arr[1];
            arr[1] = arr[0];
            arr[0] = tmp;
        }*/
        
        BubleSort1();
           
    }
    
    public void BubleSort1()
    {
        int[] arr1 = { 7, 5, 8, 9, 3, 10, 12, 25, 1, 11 };
        
        //int last = arr1.length - 1;
        
        for (int i = 0; i < arr1.length - 1; i++)
        {
            for (int j = 0; j < arr1.length - 1 - i; j++)
            {
                if (arr1[j] > arr1[j+1])
                {
                    int tmp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = tmp;
                }
            }
            
            //last--;
        }
        
        for (int i = 0; i < arr1.length - 1; i++)
        {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println(arr1[arr1.length - 1]);
        
        
    }
    
}
