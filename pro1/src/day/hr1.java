package day;

public class hr1 {

	public void s1(int a,String b) {
	System.out.println("Overloading method");
	}
public void s1(String r,int g ) {
	System.out.println(" method Overloading ");
}

public static void main(String[]args) {
	hr1 h=new hr1();
	h.s1(12,"sw");
	h.s1("swa",12);
	
}	
}
