package exceptex;

public class ExceptEx02 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4); 
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException에러메세지: "+ae.getMessage());
		}
	}

}
