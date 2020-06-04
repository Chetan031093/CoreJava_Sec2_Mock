
public class Cunstructor_Chain 
{
	int a;
	double b;
	
	private Cunstructor_Chain()
	{
		System.out.println("Zero aurguement cunstructor is running");
		System.out.println(this.b);
		System.out.println(this.a);
	}
	
	public Cunstructor_Chain(int a,double b)
	{
		this();
		System.out.println("---------------------------------");
		
		System.out.println("running arguement cunstructor");
		System.out.println("---------------------------------");
		
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println("---------------------------------");
		this.a = a;
		this.b = b;
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	public static void main(String[] args) 
	{
		Cunstructor_Chain c1 = new Cunstructor_Chain(12,13.2);
	}
}
