package kh.java.point.controller;

public interface PntMgrInterface {
	public void insertData() ;     //회원가입
	public void start();           //전체진행
	public int searchData();       //조회   
	public void printData();       //전체출력
	public void printDataOne();    //1명출력
	public void modifyData();      //수정
	public void deleteData();      //삭제
	
}
