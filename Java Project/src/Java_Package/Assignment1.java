package Java_Package;

public class Assignment1 
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
	Assignment1 obj=new Assignment1();
	int totalsum= obj.sum(10, 2);
	System.out.println("Result of sum is : " +totalsum);
	int totalsum1= obj.sum(totalsum, 2);
	System.out.println("Now result of sum is : " +totalsum1);
	int totalsub= obj.sub(totalsum1, 2);
	System.out.println("Result of sub is " +totalsub);
	int totalmul=obj.mul(totalsum, 2);
	System.out.println("Result of mul is : " +totalmul);
	 float totaldiv=obj.div(totalmul, 2);
	System.out.println("Final result is : "  +totaldiv);
	
	
	
}

}
