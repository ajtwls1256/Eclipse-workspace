package kh.Army.vo;

public class Post {

	private String title;
	private String mainText;
	private String name;
	private int postNum;
	
	public Post() {}
	public Post(String title, String mainText, String name, int postNum) {
		this.title = title;
		this.mainText = mainText;
		this.name = name;
		this.postNum = postNum;
	}
	
	public String getTitle() {
		return title;
	}
	public int getPostNum() {
		return postNum;
	}
	public void setPostNum(int postNum) {
		this.postNum = postNum;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMainText() {
		return mainText;
	}
	public void setMainText(String mainText) {
		this.mainText = mainText;
	}
	
	
}
