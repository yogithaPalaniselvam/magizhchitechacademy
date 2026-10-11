class Person
{
	
	String name;
	Person(String name)
	{
		this.name=name;
	}
	void print()
	{
	System.out.println("NAME         : "+name);
	}
}
class Employee extends Person
{
	float sal;
	Employee(String name,float sal)
	{
		super(name);
		this.sal=sal;
	}
	@Override
	void print()
	{
		super.print();
		System.out.println("SALARY       :"+sal);
	}
}
class Manager extends Employee
{
	String dept;
	Manager(String name,float sal,String dept)
	{
		super(name,sal);
		this.dept=dept;
	}
	@Override
	void print()
	{
		super.print();
		System.out.println("DEPARTMENT   : "+dept);
	}
}
class InheritanceEmployee
{
	public static void main(String args[])
	{
		System.out.println("----------------------------------");
		Manager m=new Manager("YOGITHA",345000.50f,"DEVELOPER");
		m.print();
		System.out.println("-----------------------------------");
		
	}	
}