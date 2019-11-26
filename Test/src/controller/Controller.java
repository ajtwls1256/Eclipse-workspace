package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import vo.Content;

public class Controller {
	
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	//해당하는 달에 대한 텍스트파일 불러와서 어레이리스트에 객체 모두 담은 후 그 어레이리스트 리턴
	public ArrayList<Content> searchMonthList(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\user1\\Desktop\\" + fileName))){
			ArrayList<Content> arr = (ArrayList<Content>)ois.readObject();
			return arr;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//내보내기
	public void save(ArrayList<Content> list, String fileName) {
		try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("C:\\Users\\user1\\Desktop\\" + fileName))){
			ois.writeObject(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}
	
	//해당하는 달에 대한 파일이 존재하는지 확인
	public boolean check(String month) {
		File file = new File("C:\\Users\\user1\\Desktop\\" + month);
		if(file.exists()) {	
			return true;
			
		}else {
			return false;
			
		}
	}
}

