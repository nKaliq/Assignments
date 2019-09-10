import java.util.Scanner ;

class MFCS
{
	public static void main(String args[])
	{
		String s; // A string to hold the expression
		ExpCalc ex=new ExpCalc(); // Object of ExpCalc, Responsible of operations on the expression
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("\n*\nMFCS Project:\nTo Calculate a proposition expression\n*\n");
		System.out.println("Conujuction:  && \nDisjunction:  || \nNegation:    !\nImplication:  ->");
		
		System.out.println("\nEnter The Expression to Solve (without Space):");
		s=in.next();
		
		if(ex.isValidExpression(s))
		{
		
		System.out.println("\n\nInputed Expression is: "+s);
		}
		else
		System.out.println("\nPLEASE ENTER A VALID EXPRESSION");

	}

}

class ExpCalc
{
	public static boolean isValidExpression(String exp)
	{
		boolean valid=true;
		
		for(int i=0;i<exp.length();i++)
		{
			
			
			if( (exp.charAt(i)>='A' && exp.charAt(i)<='Z'  ) 
			||  (exp.charAt(i)=='&' && exp.charAt(i+1)=='&') 
			||  (exp.charAt(i)=='|' && exp.charAt(i+1)=='|') 
			||  (exp.charAt(i)=='!' 		       )
			||  (exp.charAt(i)=='-' && exp.charAt(i+1)=='>'))
			{
				
				if(((exp.charAt(i)=='&' && exp.charAt(i+1)=='&') 
				||  (exp.charAt(i)=='|' && exp.charAt(i+1)=='|') 
				||  (exp.charAt(i)=='!' 		       )
				||  (exp.charAt(i)=='-' && exp.charAt(i+1)=='>'))
				&& ((exp.charAt(i+2)=='&' && exp.charAt(i+3)=='&') 
				||  (exp.charAt(i+2)=='|' && exp.charAt(i+3)=='|') 
				||  (exp.charAt(i+2)=='!' 		       )
				||  (exp.charAt(i+2)=='-' && exp.charAt(i+3)=='>')))
				valid=false;
				
				if((exp.charAt(i)>='A' && exp.charAt(i)<='Z') && (exp.charAt(i+1)>='A' && exp.charAt(i+1)<='Z'))
				valid=false;
			}
			else
			valid=false;
		
		}
		
		return valid;
	}

}
