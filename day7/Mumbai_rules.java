package day7;


    abstract class Mumbai_rules 
    {
	abstract void speedlimit();
	abstract void rashdriving();
	abstract void rule3();
    }
    
    class seltos extends Mumbai_rules
    {
    	void rule3()
    	{
    		System.out.println("Go slow");
    	}
    	void rashdriving()
    	{
    		System.out.println("alert voice");
    	}
    	
    	void speedlimit()
    	{
    	   System.out.println("Speed should not more than 60km/hr");
    	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       seltos obj= new seltos();
      // System.out.println(obj.rule3);
       obj.rule3();
       obj.rashdriving();
       obj.speedlimit();
       
	}

}
    
