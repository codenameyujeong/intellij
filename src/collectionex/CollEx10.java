package collectionex;

import java.util.*;

public class CollEx10 {

	public static void main(String[] args) {
		Set<Student> stSet = new HashSet<Student>();//&10번지
		Student st = new Student("홍길동", 1, 1);//&20번지
		String name = "홍길동";
		int ban = 1;
		int no = 1;
		stSet.add(new Student(name, ban, no));//30번지로 위에코드를보냄
		stSet.add(new Student("전우치", 2, 1));//40번지
		stSet.add(st);
		stSet.add(st);
		Iterator<Student> it = stSet.iterator();
		
		System.out.println("stSet.size(): "+stSet.size());
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.name + "님은 " + s.ban + "반, " + s.no + "번 입니다.");
		}

	}

}
