package generic_002_yes;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();//&10번주소 차차
		product1.setKind(new Tv("런닝맨", 6, 15, 50));
		product1.setModel("Tv자료형");
		
		Tv tv = product1.getKind();//&20번지 자료형tv
		System.out.println(product1.getModel());//출력 자료형tv
		System.out.println(tv.toString());//출력 런닝맨", 6, 15, 50
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car("그랜져", "현대", 2024, 220));
		product2.setModel("Car자료형");
		
		Car car = product2.getKind();
		System.out.println(product2.getModel());
		System.out.println(car);
	}
}
