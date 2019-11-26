package kh.inputoutput.run;

import kh.inputoutput.test.ByteStreamTest;
import kh.inputoutput.test.CharStream;
import kh.inputoutput.test.Exam;
import kh.inputoutput.test.Quiz;

public class Start
{
    
    public static void main(String[] args)
    {
        ByteStreamTest bst = new ByteStreamTest();
        //bst.primaryStream();
        //bst.subStream();
        
        CharStream cs = new CharStream();
        //cs.primaryStream();
        //cs.readFile();
        
        Exam ex = new Exam();
        //ex.main();
        ex.finallyTest();
        
        Quiz q = new Quiz();
        //q.primary();
    }
    
}
