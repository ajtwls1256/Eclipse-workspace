package controller;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import vo.Content;

public class Controller {
	
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	//�ش��ϴ� �޿� ���� �ؽ�Ʈ���� �ҷ��ͼ� ��̸���Ʈ�� ��ü ��� ���� �� �� ��̸���Ʈ ����
	public ArrayList<Content> searchMonthList(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
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
}
