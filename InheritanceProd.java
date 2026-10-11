
class Product
{
	String name;
	float price;
	Product(String name,float price)
	{
		this.name=name;
		this.price=price;
	}
	void print()
	{
	System.out.println("NAME         : "+name);
	System.out.println("PRICE        : "+price);
	
	}
}
class Electronics extends Product
{
	int warranty;
	Electronics(String name,float price,int warranty)
	{
		super(name,price);
		this.warranty=warranty;
	}
	@Override
	void print()
	{
		super.print();
		System.out.println("WARRANTY     :"+warranty);
	}
}
class Clothing extends Product
{
	String fabric;
	float size;
	Clothing(String name,float price,String fabric,float size)
	{
		super(name,price);
		this.fabric=fabric;
		this.size=size;
	}
	@Override
	void print()
	{
		super.print();
		System.out.println("FABRIC       : "+fabric);
		System.out.println("SIZE         : "+size);
		System.out.println("TOTAL        : "+(size*price));
	}
}
class InheritanceProd
{
	public static void main(String args[])
	{
		System.out.println("----------------------------------");
		System.out.println("CLOTHING");
		System.out.println("----------------------------------");
		Clothing c= new Clothing("DRESS MATERIAL",30,"COTTON",5.4f);
		c.print();
		System.out.println("----------------------------------");
		System.out.println("ELECTTRONICS");
		System.out.println("----------------------------------");
		
		Electronics e=new Electronics("MOBILE",54500,2);
		e.print();
		System.out.println("-----------------------------------");
	}	
}