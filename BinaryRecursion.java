
class BinaryRecursion
{
	int binarySearch(int arr[],int start,int end,int target)
	{
		int mid=(start+end)/2;
		if(start>end)
		{
			return -1;
		}
		else if(arr[mid]==target)
		{
			return mid;
		}
		else if(arr[mid]>target)
		{
			return binarySearch(arr,start,mid-1,target);
		}
		else
		{
			return binarySearch(arr,mid+1,end,target);
		}
	}
	public static void main(String ar[])
	{
	BinaryRecursion br=new BinaryRecursion();
	int arr[]={12,32,34,56,67,89,90};
	int start=0,end=arr.length,target=90;
	int res=br.binarySearch(arr,start,end,target);
	if(res==-1)
	{
		System.out.println(" VALUE NOT FOUND ");
	}
	else
	{
		System.out.println(" VALUE FOUND AT INDEX : "+res);
	}
	
	}
}