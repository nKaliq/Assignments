

class BinarySearch
{
		
		
	public static boolean search(int list[] , int find)
	{
		int l=0;
		int h=list.length-1;
		int mid=(l+h)/2;
		
		while(l<=h)
		{
		if(list[mid]==find)
		return true;
		
		if(list[mid]<find)
		l=mid+1;
	
		if(list[mid]>find)
		h=mid-1;
		
		mid=(l+h)/2;
		}
		return false;
	}
		
	public static void main(String args[])
	{
		int list[]={10,13,14,15,27,29,35};
		
		for(int i=0;i<list.length;i++)
		System.out.println(list[i]);
		
		System.out.println(search(list,13));
		System.out.println(search(list,29));
		System.out.println(search(list,18));
	}	
	
}
