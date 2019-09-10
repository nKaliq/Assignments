
class TwoWayMergeSort
{
	public static void Merge(int a[],int b[],int c[])
	{
		int i=0,j=0,k=0;
		
		while( i<a.length && j<b.length )
		{
			if(a[i]==b[j])
			{
				c[k]=a[i];
				i++;
				j++;
				k++;
			}
		else	if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
		else if(a[i]>b[j])
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		
		while(i<a.length)
		{
			c[k]=a[i];
			i++;k++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			j++;k++;
		}
	}
	
	public static void show(int a[])
	{
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+ " -");
	}
	
	public static void main(String args[])
	{
		
		
		int list1[]={10,22,24,31,35};
		int list2[]={8,12,17,27,30,34,48,50};
		int list3[]=new int[list1.length + list2.length];
		
		System.out.print("List 1 = ");show(list1);
		System.out.print("\nList 2 = ");show(list2);
		
		Merge(list1,list2,list3);
		
		System.out.print("\nList 3 = ");show(list3);
	}

}


