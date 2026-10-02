class LinearRecursion
{
	int linearSearch(int ar[],int index,int target)
	{
	if(ar[index]== target)
	{
		return index;
	}
	else if(index<ar.length-1)
	{
		return linearSearch(ar,index+1,target);
		
	}
	else
	{
		return -1;
	}
	}
	public static void main(String arg[])
	{
	int ar[]={10,20,30,40,50,90};
	int index=0;int target=70;int res=0;
	LinearRecursion lr=new LinearRecursion();
	System.out.println("-------------------------------------");
	System.out.println("           Linear Search   " );
	System.out.println("-------------------------------------");
	res=lr.linearSearch(ar,index,target);
	if(res==-1)
	{
	System.out.println(" VALUE NOT FOUND ");
	}
	else
	{
	System.out.println(" VALUE FOUND AT INDEX :"+res);
	
	System.out.println("-------------------------------------");
	}
	}
}