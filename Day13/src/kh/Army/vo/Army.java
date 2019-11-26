package kh.Army.vo;

public class Army extends Member {

	public Army() {}
	public Army(String name, String grade, String phone, int age, String passwd, int count, int point, int cheeringNum) {
		super(name, grade, phone, age, passwd, count, point, cheeringNum);
	}

	public void countUp()
	{
	    this.setCount(this.getCount() + 1);
	    
	    this.setPoint(this.getPoint() + 10);
	}
}
