package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ControllerDiary;

public class View
{
    
    
    Scanner sc = new Scanner(System.in);
    ControllerDiary cd = new ControllerDiary();
    
    public void main() {
        System.out.println("==== 다이어리 프로그램 ====");
        
        System.out.println("1. 쓰기");
        System.out.println("2. 1일 보기");
        System.out.println("3. 수정");
        System.out.println("4. 삭제");
        System.out.println("5. 전체 출력(보류)");
        
        System.out.print("번호 선택 > ");

        
        int sel = sc.nextInt();
        
        switch(sel) {
            case 1:
                writeDiary();
                break;
            case 2:
                printOne();
                break;
            case 3:
                updateDiary();
                break;
            case 4:
                deleteDiary();
                break;
            case 5:
                printAll();
                break;  
        }
    }
    
    public writeDiary() {
        System.out.println(" 다이어리 쓰기 ");
        System.out.print("월 검색(월 빼고) :");
        int month = sc.nextInt();
        System.out.print("일 검색(일 빼고) :");
        int day = sc.nextInt();
        
    }
    
    
    public void updateDiary() {
        System.out.println(" 다이어리 업데이트 ");
        System.out.print("월 입력(월 빼고)");
        int month = sc.nextInt();
        System.out.print("일 입력(일 빼고)");
        int day = sc.nextInt();
        
        
        cd.updateDiary(month, day);
        
        
    }
    
    public void deleteDiary() {
        System.out.println(" 다이어리 삭제 ");
        System.out.print("월 입력(월 빼고)");
        int month = sc.nextInt();
        System.out.print("일 입력(일 빼고)");
        int date = sc.nextInt();
        ArrayList<String> al = cd.searchDiary(month,date);
        // 출력
        System.out.print("삭제 할 번호 선택 > ");
        
        cd.deleteOne(month, day, sc.nextInt()-1);        
    }
}
