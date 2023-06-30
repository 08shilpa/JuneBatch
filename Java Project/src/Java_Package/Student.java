package Java_Package;

public class Student
{
int rollNo, age;

public void method1()
{
	System.out.println("Welcome to all of you ");
}

public void method2()
{
	System.out.println("Automation is very easy ");
}

public static void main(String[] args) {
	Student obj=new Student();
	obj.method1();
	obj.method2();
	obj.rollNo=01;
	System.out.println("Value of rollno is : " +obj.rollNo);
	obj.age=10;
    System.out.println("Value of age is : " +obj.age);	
}
}
