
public class Redbus_offers extends Redbus
{
	String mnscode = "MANSOON";
	
	void bookticket(int seats,String couponcode)
	{
		if(mnscode == couponcode)
		{
			System.out.println("ticket booked through Redbus_offers");
			System.out.println("Coupon_code applied successfully");
			System.out.println("MANSOON offer discount is : 25%");
			
			System.out.println("ticket price is : "+ticket_price);
			System.out.println("number of seats is : "+seats);
			this.total_fair = ticket_price * seats;
			System.out.println("total fair is : "+total_fair);
			System.out.println("ticket booked successfully in SRS_Travels");
			System.out.println("total fair after 25% discount is : "+(total_fair * 0.75));
		}
		else
		{
			System.out.println("sorry invalid coupon");
			System.out.println("ticket booked through redbus_offers");
			System.out.println("ticket price is : "+ticket_price);
			System.out.println("number of seats is : "+seats);
			this.total_fair = ticket_price * seats;
			System.out.println("total fair is : "+total_fair);
			System.out.println("ticket booked successfully in SRS_Travels");
			this.redbusdiscount();
		}
		
	}	

}
