package collectionex;
//20번지 30번지
public class Student {
	String name = "";//홍길동
	int ban;//1
	int no;//1

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