package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import controller.Controller;
import vo.Content;

public class View {
	Scanner sc = new Scanner(System.in);
	Content content = new Content();
	Controller controller = new Controller();

	public void main() {
		while(true) {
			System.out.println("========다이어리=========");
			System.out.println("1. 쓰기");
			System.out.println("2. 1일 보기");
			System.out.println("3. 전체 출력");
			System.out.println("4. 수정");
			System.out.print("선택 >");
			switch (sc.nextInt()) {
			case 1: add();
				break;
			case 2:
				printOne();
				break;
			case 3:
				printAll();
				break;
			case 4:
				update();
				break;
			}
		}
	}
	public void add() {
		ArrayList<String> strList = new ArrayList<String>();
		System.out.println("=========다이어리 작성=========");
		System.out.print("월 입력 > ");
		String month = sc.next();
		System.out.print("일 입력 > ");
		int day = sc.nextInt();
		System.out.println("다이어리 할 일을 작성하세요: [종료시 exit 입력]");
		sc.nextLine();
		while(true) {
			String str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			}
			strList.add(str);
		}
		Content c = new Content(day, strList);
		if(controller.check(month)) {	//해당 달의 파일이 존재
			ArrayList<Content> list = controller.searchMonthList(month);
			list.add(c);
			controller.save(list,month);
			System.out.println("작성되었습니다.");
		}else {
			//파일이 존재하지 않음
			ArrayList<Content> list = new ArrayList<Content>();
			list.add(c);
			controller.save(list,month);
			System.out.println("작성되었습니다.");		
		}		
	}	
	
	public void printOne() {
		System.out.print("월 검색 > ");
		String month = sc.next();
		System.out.print("일 검색 > ");
		int day = sc.nextInt();
		if(controller.check(month)) {	//해당 달의 파일이 존재
			ArrayList<Content> list = controller.searchMonthList(month);
			System.out.println("------------------------");
			System.out.println(month + "월" + day + "일");
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getDay()==day) {
					for(int j=0; j<list.get(i).getList().size();j++) {
						System.out.println((j+1) + ". " + list.get(i).getList().get(j));
					}
				}		
			}
			System.out.println("------------------------");			
		}else {
			//파일이 존재하지 않음
			System.out.println("정보가 없습니다.");		
		}		
		
	}
	
	public void printAll() {
		System.out.print("월 검색 > ");
		String month = sc.next();

		if(controller.check(month)) {	//해당 달의 파일이 존재
			ArrayList<Content> list = controller.searchMonthList(month);
			
			for (Content c : list) {
				System.out.println("------------------------");
				System.out.println(month + "월" + c.getDay() + "일");
				for (int i = 0; i < c.getList().size(); i++) {
					System.out.println((i+1) + ". " + c.getList().get(i));
				}
				System.out.println("------------------------");
			}			
		}else {
			//파일이 존재하지 않음
			System.out.println("정보가 없습니다.");		
		}	
	}
	
	public void update() {
		System.out.print("월 검색 > ");
		String month = sc.next();
		System.out.print("일 검색 > ");
		int day = sc.nextInt();
		
		if(controller.check(month)) {	//해당 달의 파일이 존재
			//출력
			ArrayList<Content> list = controller.searchMonthList(month);
			System.out.println("------------------------");
			System.out.println(month + "월" + day + "일");
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getDay()==day) {
					for(int j=0; j<list.get(i).getList().size();j++) {
						System.out.println((j+1) + ". " + list.get(i).getList().get(j));
					}
				}		
			}
			System.out.println("------------------------");
			
			System.out.print("수정할 글의 번호를 입력하세요 > ");
			int select = sc.nextInt() -1;
			System.out.print("수정할 내용을 입력하세요 > ");
			String content = sc.next();
			
			//수정
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getDay()==day) {
					list.get(i).getList().set(select, content);
				}		
			}
			
			controller.save(list, month);
		}else {
			//파일이 존재하지 않음
			System.out.println("정보가 없습니다.");		
		}	
	}
	
	public void deleteDiary()
	    {
	        ObjectOutputStream oos = null;
	        
	        System.out.print("월 검색 > ");
	        String month = sc.next();
	        System.out.print("일 검색 > ");
	        int day = sc.nextInt();
	        
	        FileOutputStream fos;
	        try
	        {
	            fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\" + month +".txt");
	            oos = new ObjectOutputStream(fos);
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
	        
	        ArrayList<Content> list = controller.searchMonthList(month);
	        
	        System.out.println("------------------------"); // 날짜 할 일 출력
	        System.out.println(month + "월" + day + "일");
	        for (int i = 0; i < list.size(); i++)
	        {
	            if (list.get(i).getDay() == day)
	            {
	                System.out.println((i + 1) + ". "
	                        + list.get(i).getList().get(i));
	            }
	        }
	        System.out.println("------------------------");
	        
	        System.out.print("삭제 할 일정 선택 > ");
	        int input = sc.nextInt();
	        
	        for (int i = 0; i < list.size(); i++)
	        {
	            if (list.get(i).getDay() == day)
	            {
	                list.get(i).getList().remove(input - 1);
	            }
	        }
	        
	        try
	        {
	            oos.writeObject(list);
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
	                oos.close();
	            }
	            catch (IOException e)
	            {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	        
	        System.out.println("삭제를 완료하였습니다.");
	    }
	
	

}
