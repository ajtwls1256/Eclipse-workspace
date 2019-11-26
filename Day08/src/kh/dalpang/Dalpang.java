package kh.dalpang;

public class Dalpang
{
    public void main()
    {
        // 달팽이    
        
        int [][] dalpang1 = new int [5][5];
        
        int lineNum = dalpang1.length;
        int startNum = 0;
        int row = 0;
        int col = -1;
        
        while(true)
        {
            // 증가 시 넣어야 할 개수는 홀수개
            if(lineNum % 2 != 0)
            {
 
                for(int i = 0; i < lineNum + (lineNum - 1); i++)
                {
                    if(i < lineNum)
                        dalpang1[row][++col] = ++startNum;
                    else
                        dalpang1[++row][col] = ++startNum;
                }
            }
            else
            { 
                for(int i = 0; i < lineNum + (lineNum - 1); i++)
                {
                    if(i < lineNum)
                        dalpang1[row][--col] = ++startNum;
                    else
                        dalpang1[--row][col] = ++startNum;
                }
            }

            lineNum--;
            
            
            if(lineNum == 0)
                break;
        }
        
        
        
        for(int i=0; i<dalpang1.length; i++)
        {
            for(int j=0; j<dalpang1[i].length; j++)
            {
                
                System.out.print(dalpang1[i][j] + "\t");
            }

            
            System.out.println();
        }
        
    }
}
