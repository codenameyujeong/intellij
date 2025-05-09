package abc;
class Ex04Constructor {
    int modelYear;
    String modelName;//null(참조변수 초기값)NTULL문자는 문자의 끝을 의미하는 명령

    public Ex04Constructor(int year, String name) {
        modelYear = year;
        modelName = name;
    }
}

//제어자 class 메소드명{}
public class Ex04ConstructorMain {
    public static void main(String[] args) {
        Ex04Constructor myCar = new Ex04Constructor(2025, "Carnival");
        System.out.println("년식: "+ myCar.modelYear + " , 차종: " + myCar.modelName);
    }
}
