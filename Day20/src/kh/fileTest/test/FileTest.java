package kh.fileTest.test;

import java.io.File;
import java.util.Scanner;

public class FileTest
{
    Scanner sc = new Scanner(System.in);
    
    public void main()
    {
        // File 클래스
        // 파일을 다루는데 사용되는 클래스
        // 여러 메소드로 파일의 정보를 받아올 수 있음
        
        System.out.print("파일명 입력 : ");
        String fileName = sc.next();
        
        File file = new File("C:\\Users\\user1\\eclipse-workspace\\" + fileName); // 파일이 있는지 없는지 직접 체크하기때문에 예외처리 안해도됨
        
        if(file.exists())
        {
            System.out.println("파일명 : " + file.getName());
            System.out.println("파일 상대경로 : " + file.getPath());  // 프로젝트 파일 위치기준
            System.out.println("파일 절대경로 : " + file.getAbsolutePath());  // C드라이브 기준 경로
            System.out.println("파일 크기 : " + file.length() + "Byte");     // byte 단위의 파일크기
        }
        else
        {
            System.out.println("해당 파일이 존재하지 않습니다.");
        }
        
        

        
    
    }
    
    
}
