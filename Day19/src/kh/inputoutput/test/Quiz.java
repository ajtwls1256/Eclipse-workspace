package kh.inputoutput.test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Quiz
{
    public void primary()
    {
        BufferedReader br = null;
        try
        {
            FileReader fr = new FileReader("quiz.txt");
            br = new BufferedReader(fr);
            
            String str = br.readLine();
            ArrayList<Byte> al = new ArrayList<>();
            
            
            // 47 49 46 38 39 61 26 .. 로 저장되어 있는 16진수 값을 Byte단위로 쪼개서 저장하기위해
            StringTokenizer st = new StringTokenizer(str, " ");
            
            while(st.hasMoreTokens())
            {
                String readString = st.nextToken();
                int changeNum = Integer.parseInt(readString, 16);
                al.add((byte)changeNum);
            }
            
            System.out.println("arrayList 길이 : " + al.size());
            System.out.println("파일 읽어오기 완료!");
            
            FileOutputStream fos = new FileOutputStream("test.gif");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            
            for(Byte b : al)
            {
                bos.write(b);
            }
            System.out.println("파일 내보내기 완료!!");
            
            bos.close();
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
    
}
