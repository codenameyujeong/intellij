package collectionex;

public class Student {
	String name = "";
	int ban;
	int no;

	Student() {}

	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}

	public String getName() {
		return name;
	}//자바왕

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}//1

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}//1

}