package generic_000_none;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();//&10
		box.set("홍길동");
		String name = (String) box.get();//Object("홍길동") Object에서 String타입으로 다운캐스팅하려면 명시적으로()안에바꾸려는String을 적어줘야함
		System.out.println(name);
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();//왜명시적이야 box.get가 Object타입이여서
		apple.setNum(100);
		System.out.println(apple.getNum());
	}

}
