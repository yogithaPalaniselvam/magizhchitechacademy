class LinearSearch
{
	public static void main(String args[])
	{
		System.out.println("------------------------------------------");
		System.out.println("      LINEAR SEARCH   ");		
		System.out.println("------------------------------------------");
		int ar[] ={ 23,54,56,76,32,5,67,8};
		int target=67;
		boolean b=false;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==target)
			{
			System.out.println(" TARGET "+target +" FOUND \n INDEX : "+i);
			b=true;
			}
		}
		if(b==false)
		{
		System.out.println(" TARGET "+target+"NOT FOUND \n INDEX :-1");
		}
		System.out.println("------------------------------------------");
		
	}
}