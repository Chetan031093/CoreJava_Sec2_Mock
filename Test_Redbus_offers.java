
class Test_Redbus_offers 
{
	public static void main(String[] args) 
	{
		Redbus_offers  r1 = new Redbus_offers();
		r1.bookticket(2);
		
		System.out.println("---------------------------------------");
		
		r1.redticket(3);
		
		System.out.println("------------------------------------");
		
		r1.bookticket(3, "MANSOON");
		
		System.out.println("--------------------------------------");
		
		r1.bookticket(3, "ghh");
	}

}
