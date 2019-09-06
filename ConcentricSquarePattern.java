
class Solution
{
	public static void main(String args[])
	{
		
		printPattern(3);
	}
	
	public static void printPattern(int n)
	{
		//pattern is divided into  2*3 = 6 segments
		
		//---------printing the first half segments
		
		int k= (n*2 - 1) - 2;
		for(int i=n ; i>0 ; i--)
		{
			for(int j=n ;j>=i; j--) //1
			{
				System.out.print(j);
			}
		
			//int k=(n%2==0? n+1 : n+2);  initialized on top 
			for(int j= k ; j>0 ; j--)//2
			{
			System.out.print(i);
			}k=k-2;
			
			for(int j=i; j<=n ; j++)//3
			{
				if(j!=1)
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		//-------- printing the second half segments
		k=1;
		for(int i=2; i<=n ; i++)
		{
			for(int j=n ;j>=i; j--)//4
			{
				System.out.print(j);
			}
			
			//k=1; initialized on top of second segment
			for(int j=0 ; j<k ;j++)//5
			System.out.print(i);
			k=k+2;
			
			
			for(int j=i ; j<=n ; j++)//6
			System.out.print(j);
		
			System.out.println();
		}
		
	}
	
	
}