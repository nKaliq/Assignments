/*






code does not work
*/

class QuickSort
{
	int list[];
	
	public QuickSort()
	{
		int l[]={10,16,8,12,15,6,3,9,5};
		list=l;
	}

	void swap(int i,int j)
	{
		int temp=list[i];
		list[i]=list[j];
		list[j]=temp;
	}

	int partition(int low,int high)
	{
		int piv=list[low];
		int i=low;
		int j=high;
		
		while(i<j){
		do{
		i++;
		}while(list[i]<piv);
		do{
		j--;
		}while(list[j]>piv);
		
		if(list[i]>list[j])
		swap(i,j);
		}
		
		swap(low,j);
		return j;
	}
	
	void sort(int low,int high)
	{
		if(low<high);
		int j=partition(low, high);
		sort(low,j);
		sort(j+1,high);
	}
	
	public static void main(String args[])
	{
		QuickSort qs=new QuickSort();
		qs.sort(0,8);
		
		
	}
	
}


