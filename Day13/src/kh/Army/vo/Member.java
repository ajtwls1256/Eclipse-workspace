package kh.Army.vo;

public class Member {
	private String name;
	private String grade;
	private String phone;
	private int age;
	private String passwd;       // ��й�ȣ
	private int count;             // �ۼ��� �� ����
	private int point;             // ����Ʈ
	private int cheeringNum;       // ���� Ƚ��
	
	
	public Member() {}
	
	public Member(String name, String grade, String phone, int age, String passwd, int count, int point, int cheeringNum) {
		this.name = name;
		this.grade = grade;
		this.phone = phone;
		this.age = age;
		this.passwd = passwd;
		this.count = count;
		this.point = point;
		this.cheeringNum = cheeringNum;
	}


        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public String getGrade()
        {
            return grade;
        }
        public void setGrade(String grade)
        {
            this.grade = grade;
        }
        public String getPhone()
        {
            return phone;
        }
        public void setPhone(String phone)
        {
            this.phone = phone;
        }
        public int getAge()
        {
            return age;
        }
        public void setAge(int age)
        {
            this.age = age;
        }
        public String getPasswd()
        {
            return passwd;
        }
        public void setPasswd(String passwd)
        {
            this.passwd = passwd;
        }
        public int getCount()
        {
            return count;
        }
        public void setCount(int count)
        {
            this.count = count;
        }
        public int getPoint()
        {
            return point;
        }
        public void setPoint(int point)
        {
            this.point = point;
        }
        public int getCheeringNum()
        {
            return cheeringNum;
        }
        public void setCheeringNum(int cheeringNum)
        {
            this.cheeringNum = cheeringNum;
        }
        
        public void countUp()
        {
        
        }
	

}
