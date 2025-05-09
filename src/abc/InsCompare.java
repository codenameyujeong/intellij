package abc;

public class InsCompare {
    public static void main(String[] args) {
        String str1 = "안녕,자바!!!";
        String str2 = "안녕,자바!!!";
        String str3 = new String("안녕,자바!!!");
        String str4 = str3.intern();

        System.out.println("\n===============\n");
        System.out.printf("str1: %s %n", str1);
        System.out.println("str2: %s".formatted(str2));
        System.out.println("str3: "+str3);
        System.out.println("str4: "+str4);


        //객체 비교
        System.out.println("\n===============\n");
        if(str1 == str2) System.out.println("str1 == str2");
        else System.out.println("str1 != str2");

        if(str1 == str3) System.out.println("str1 == str3");
        else System.out.println("str1 != str3");

        if(str1 == str4) System.out.println("str1 == str4");
        else System.out.println("str1 != str4");

        if(str3 == str4) System.out.println("str3 == str4");
        else System.out.println("str3 != str4");

        //값 비교
        System.out.println("\n===============\n");
        if(str1.equals(str2)) System.out.println("str1 값 == str2 값");
        else System.out.println("str1 값 != str2 값");

        if(str1.equals(str3)) System.out.println("str1 값 == str3 값");
        else System.out.println("str1 값 != str3 값");

        if(str1.equals(str4)) System.out.println("str1 값 == str4 값");
        else System.out.println("str1 값 != str4 값");

        if(str3.equals(str4)) System.out.println("str3 값 == str4 값");
        else System.out.println("str3 값 != str4 값");

        //identityHashCode값
        System.out.println("\n===============\n");
        System.out.println("identityHashCode값");
        System.out.println("str1:"+System.identityHashCode(str1));
        System.out.println("str2:"+System.identityHashCode(str2));
        System.out.println("str3:"+System.identityHashCode(str3));
        System.out.println("str4:"+System.identityHashCode(str4));

        //hashCode값
        System.out.println("\n===============\n");
        System.out.println("hashCode값");
        System.out.println("str1:"+str1.hashCode());
        System.out.println("str2:"+str2.hashCode());
        System.out.println("str3:"+str3.hashCode());
        System.out.println("str4:"+str4.hashCode());

    }
}
