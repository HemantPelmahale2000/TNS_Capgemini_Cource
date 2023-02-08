package days;

public class tr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d="maharashtra";
		System.out.println(d.endsWith("tra")); //true
		
		System.out.println(d.endsWith("ta")); //false
		
		System.out.println(d.endsWith("a"));
		
		System.out.println(d.endsWith("s"));
       
       String s="ranjangaon";
       System.out.println(s);
	
	   System.out.println(d.endsWith("mha")); //false
	   System.out.println(d.endsWith("r"));
	   System.out.println(d.endsWith("ran"));
	}
}
