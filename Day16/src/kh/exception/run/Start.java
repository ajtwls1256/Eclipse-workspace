package kh.exception.run;

import kh.exception.test.ExceptionTest;

public class Start
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        ExceptionTest et = new ExceptionTest();
        //et.main();
        //et.start();
        et.div(5, 0);
        
        
    }
    
}
