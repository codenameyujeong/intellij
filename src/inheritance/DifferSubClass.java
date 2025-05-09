package inheritance;

import abc.DifferSuperClass;

public class DifferSubClass extends DifferSuperClass {
	public void subMd() {
		md();
	}
	
    public static void main(String[] args) {
    	DifferSubClass sp= new DifferSubClass();//객체를만들어서 굳이 쓰는이유는sameVar같은패키지가아니고protected가있어서
        System.out.println(sp.sameVar);
        sp.md();
        sp.subMd();
    }

}