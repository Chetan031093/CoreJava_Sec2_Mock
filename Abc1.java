
public interface Abc1 
{
	void test();
	
	void sample();
	
	void demo();

}

abstract class Abc2 implements Abc1
{

	@Override
	public void test()
	{
		System.out.println("running test method of interface");	
	}

	@Override
	public void sample() 
	{
		System.out.println("running sample method of interface");
	}

	public abstract void demo();
	
}

class Abc3 extends Abc2
{

	@Override
	 public void demo() 
	{
		System.out.println("running demo method");
	}
}