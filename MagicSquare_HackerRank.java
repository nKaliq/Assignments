import java.util.Scanner;

class Solution
{
	public static void main(String args[])
	{
		int temp[][]={{5,3,4},{1,5,8},{6,4,2}};
		
		System.out.println(magicSquare(temp));
	}
	
	public static int magicSquare(int[][] s)
	{
		int init[][]={{8,3,4},{1,5,9},{6,7,2}};
		
		int min= sqrDiff(init, s);
		int diff=0;
		for(int i=1; i< 8 ;i++)
		{
		diff=0;
			if(i==4)
			{
				init = flipSqr(init);
				diff=sqrDiff(init, s);
				if(diff < min)
				min = diff;
				
				continue;
			}
			
			init =rotateSqr(init);
			diff= sqrDiff(init , s);
			if(diff < min)
			min= diff;
			
		}
		 
		 return min;	
		
	}
	
  	public static int sqrDiff(int a[][], int b[][]) //a=magic sqr , b=input sqr
	{
		int sum=0;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				sum=sum+ Math.abs(a[i][j] - b[i][j]);	
				
				return sum;
	}
	
	
	public static int[][] rotateSqr(int s[][])
	{
		int ar[][]=new int[3][3];
		
		ar[0][0]=s[2][0];
		ar[0][1]=s[1][0];
		ar[0][2]=s[0][0];
		ar[1][0]=s[2][1];
		//ar[1][1]=s[1][1];
		ar[1][2]=s[0][1];
		ar[2][0]=s[2][2];
		ar[2][1]=s[1][2];
		ar[2][2]=s[0][2];
		
		return ar;
	}
	
	public static int[][] flipSqr(int s[][])
	{
		int ar[][]=new int[3][3];
	
		ar[0][0]=s[0][2];
		//ar[0][1]=s[1][0];
		ar[0][2]=s[0][0];
		
		ar[1][0]=s[1][2];
		//ar[1][1]=s[1][1];
		ar[1][2]=s[1][0];
		
		ar[2][0]=s[2][2];
		//ar[2][1]=s[1][2];
		ar[2][2]=s[2][0];
		
		return ar;	
	}
}
