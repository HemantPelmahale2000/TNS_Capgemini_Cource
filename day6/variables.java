package day6;

public class variables {
	int r=23; //instant var 
	
	static int g=25; // static var 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int f=28; // local var 
     System.out.println(f); // local var 28
     
     System.out.println(g); //satic var 25
     
     variables test=new variables();
     System.out.println(test.r); // instant var 23
		
	}

}