package collectionex;

import java.util.*;

public class CollEx09 {

	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<Integer>();
//		//HashSet생성
//		set.add(3);
//		set.add(2);
//		set.add(1);
//		set.add(1);
//		set.add(3);
//		System.out.println("0번: " + set);
//		System.out.println("set.size(): "+set.size());
//
//		List<Integer> li = Arrays.asList(2,1,3);
//		System.out.println("1번:" + li);
//
//		set = new HashSet<Integer>(Arrays.asList(2,1,3));//static을 가져와씀 객체안만들고
//		System.out.println("1번: " + set);
//		Iterator<Integer> iter = set.iterator();
//		while(iter.hasNext()) {
//		    System.out.print(iter.next());
//		}
//		System.out.println();
		
//		Set<Integer> linkedSet1 = new LinkedHashSet<Integer>(Arrays.asList(3,1,2));
		Set<Integer> linkedSet1 = new LinkedHashSet<Integer>(Arrays.asList(2,1,3));
		System.out.println("2번: " + linkedSet1); //전체출력 [1,2,3]
		
		Iterator<Integer> iter1 = linkedSet1.iterator();	// Iterator 사용
		while(iter1.hasNext()) {
			System.out.print(iter1.next());
		}
		System.out.println();

	}

}







