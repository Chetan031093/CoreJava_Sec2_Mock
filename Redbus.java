
public class Redbus extends SRS_Travels
{
	void redbusdiscount()
	{
		System.out.println("resdbus 10% discount");
		System.out.println("total fair after 10% discount is : "+(total_fair*0.90));	
	}
	
	
	void redticket(int seats)
	{
		System.out.println("ticket booked through redbus");
		System.out.println("ticket price is : "+ticket_price);
		System.out.println("number of seats is : "+seats);
		this.total_fair = ticket_price * seats;
		System.out.println("total fair is : "+total_fair);
		System.out.println("ticket booked successfully in SRS_Travels");
		this.redbusdiscount();
		
	}
	
}
