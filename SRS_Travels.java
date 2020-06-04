
public class SRS_Travels 
{
	double ticket_price = 1000;
	double total_fair;
	
	void bookticket(int seats)
	{
		System.out.println("ticket price is : "+ticket_price);
		System.out.println("number of seats is : "+seats);
		this.total_fair = ticket_price * seats;
		System.out.println("total fair is : "+total_fair);
		System.out.println("ticket booked successfully");
	}

}

