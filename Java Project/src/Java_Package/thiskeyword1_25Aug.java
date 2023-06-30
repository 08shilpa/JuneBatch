package Java_Package;

public class thiskeyword1_25Aug 
{
	thiskeyword1_25Aug()
	{
		this(1, 2, 3);
	System.out.println("Default Constuctor");	
	}
	
	thiskeyword1_25Aug(int a)
	{
		this();
	System.out.println("One Paramerterized Constuctor");	

	}
	
	thiskeyword1_25Aug(int a, int b)
	{
		this(1, 2, 3, 4);
	System.out.println("Two Parameterized Constuctor");	
    }
	
	thiskeyword1_25Aug(int a, int b, int c)
	{
	System.out.println("Three Paramerterized Constuctor");	

	}
	
	thiskeyword1_25Aug(int a, int b, int c, int d)
	{
		this(1);
	System.out.println("Four Parameterized Constuctor");	

	}
	public static void main(String[] args) 
{
	thiskeyword1_25Aug obj=new thiskeyword1_25Aug(1, 2);
}
}
