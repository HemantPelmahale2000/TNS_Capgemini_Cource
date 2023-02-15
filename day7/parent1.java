package day7;

public class parent1 
{
    void disp()
    {
    	System.out.println("i am in child1");
    }
}
    class child4 extends parent1
    {
    	void disp() {
    		System.out.println("i am from child 4");
    	}
    }
    
      class child5 extends parent1 
    {
    	private static Object obj;

		void disp() {
    		System.out.println("i am from child 5");
    }
   
	public static void main(final String[] args) {
		 
	 final child5 obj = new child5();
		 obj.disp();
		// System.out.println(obj.disp);

	}

}
   
