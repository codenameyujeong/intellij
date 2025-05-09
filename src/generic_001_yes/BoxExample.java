package generic_001_yes;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();//&10
		box1.set("hello");
		System.out.println(box1.get());

		Box<Integer> box2 = new Box<Integer>();//&20
		box2.set(6);
		System.out.println(box2.get());
	}
}
