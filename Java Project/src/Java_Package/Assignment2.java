package Java_Package;

public class Assignment2 
{
	public int sum(int a, int b)
	{
		int sum;
		sum=a+b;
		return sum;
	}
	public int sub(int a, int b)
	{
		int sub;
		sub=a-b;
		return sub;
	}

	public int mul(int a, int b)
	{
		int mul;
		mul=a*b;
		return mul;
	}

	public float div(int a, int b)
	{
		float div;
		div=a/b;
		return div;
	}

	public static void main(String[] args) {
Assignment2 obj=new Assignment2();		//((((((10*2)-2)+2)-2)/2)

		int totalmul= obj.mul(10, 2);
		System.out.println("Result of multiply is :" +totalmul);
		 int totalsub = obj.sub(totalmul, 2);
		 System.out.println("Result of sub is :  " +totalsub);
		int totalsum =  obj.sum(totalsub, 2);
		System.out.println("Result of sum is : " +totalsum);
	int totalsub1=	obj.sub(totalsum, 2);
		System.out.println("Result of final sub is : " +totalsub1);
float totaldiv=	obj.div(totalsub1, 2);
System.out.println(" Final result if : " +totaldiv);
		
	}
}
