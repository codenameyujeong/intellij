package abstractex;

public class AbstractEx03 {
	public static void main(String[] args) {
		Shape1 ref = null;//sys0.0
		ref = new Circle1();//("Circle1 area()메소드");//파차
		System.out.println(ref.res);//76.---
		System.out.println(ref.area());//78....
		ref.printArea();//면적은 78...
		ref = new Rectangle(); 
		ref.area();
		ref.printArea();
	}
}


