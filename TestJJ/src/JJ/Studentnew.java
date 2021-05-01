package JJ;

public class Studentnew 
{
	public void method()
	{
		this.method3(1,2,3);
		System.out.println("I am1 Default Method");
	}
	public void method1(int a)
	{
		this.method2(1, 2);
		System.out.println("I am one1 Parameterized Method");
	}
	public void method2(int a,int b)
	{
		this.method4(1, 2, 3, 4);
		System.out.println("I am Two1 Parameterized Method");
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("I am Three1 Parameterized Method");
	}
	public void method4(int a,int b,int c,int d)
	{
		this.method();
		System.out.println("I am Four1 Parameterized Method");
	}
	public static void main(String[] args) 
	{
		Studentnew s=new Studentnew();
		s.method1(1);
	}

}
