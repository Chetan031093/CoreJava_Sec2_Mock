
public class Ab2 
{
	public static void main(String[] args) 
	{
		Ab1 ab1 = new Ab1()
		{

			void temp() 
			{
				System.out.println("running temp method");
			}

			void view() 
			{
				System.out.println("running view method");	
			}
		};
		
		ab1.temp();
		
		System.out.println("----------------------------");
		
		ab1.view();
	}

}
