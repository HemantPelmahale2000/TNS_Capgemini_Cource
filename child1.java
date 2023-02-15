package day7;

public class child1 
{
    void disp()
    {
    	System.out.println("i am in child1");
    }
}
    class child2 extends child1
    {
    	void disp() {
    		System.out.println("i am from child 2");
    	}
    }
    
      class child3 extends child2 
    {
    	private static Object obj;

		void disp() {
    		System.out.println("i am from child 3");
    }
   
	public static void main(String[] args) {
		 
	 child3 obj = new child3();
		 obj.disp();
		// System.out.println(obj.disp);

	}


}
