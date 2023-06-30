package Java_Package;

public class thiskeyword2_25june
{
	
	public void dfault()
	{
		this.threeparameterized(1, 2, 3);
		System.out.println("Default");
	}
	
	public void oneparameterized(int a)
	{
		this.dfault();
		System.out.println("One parameterized");
	}
	
	public void twoparameterized(int a, int b)
	{
		this.fourparameterized(1, 2, 3, 4);
		System.out.println("two parameterized");	
	}
	
	public void threeparameterized(int a, int b, int c)
	{
		System.out.println("three parameterized");
	}
	
	public void fourparameterized(int a, int b, int c, int d)
	{
		this.oneparameterized(1);
		System.out.println("four parameterized");
	}
	
public static void main(String[] args) 
{
thiskeyword2_25june obj= new thiskeyword2_25june();
obj.twoparameterized(1, 2);
} 
	
	
	

}
