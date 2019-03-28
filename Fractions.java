import java.util.Scanner;

class Fraction
{
  int num, dnum ;

  public Fraction(int a, int b)
  {
    num =a;
    dnum =b;
  }

  public Fraction()
  {
     num=1;
     dnum=1;
  }



  public void inputFractions(Fraction frac[])
  {
    Scanner in=new Scanner(System.in);

    int an,ad;
      for(int i=0;i<frac.length;i++)
      {
        System.out.println("Enter a / q values: ");
        an=in.nextInt();
        ad=in.nextInt();

        frac[i]=new Fraction(an,ad);
      }
  }

  public void addFractions(Fraction frac[])
    {
      int tempN=0 , tempD=1;

        for(int i=0; i<frac.length ; i++)
          tempD = tempD * frac[i].dnum;

        for(int i=0;i<frac.length ; i++)
          tempN = ( frac[i].num * (tempD / frac[i].dnum) ) + tempN;

          //assign values
          num=tempN;
          dnum=tempD;
    }


    public void simplify()
    {
      int gcd= getGCD(num,dnum);

        num=num/gcd;
        dnum=dnum/gcd;

    }

    public static int getGCD(int a,int b)
    {
        while(a != b)
        {
          if(a>b)
          a=a-b;
          else
          b=b-a;
        }
        return a;
    }


  public void displayFraction()
  {
    System.out.println("Sum is " + num + "/" + dnum);
    System.out.println();
  }

  public void displayFractions(Fraction frac[])
  {
    for(int i=0; i<frac.length; i++)
    {
          System.out.println(frac[i].num +"/"+frac[i].dnum);
    }
  }

  public static void main(String args[])
  {
    Fraction frac[];
    Fraction f1=new Fraction();

    frac=new Fraction[3];

    f1.inputFractions(frac);
    f1.addFractions(frac);
    f1.simplify();

    System.out.println("list of fraction to sum");
    f1.displayFractions(frac);

    System.out.println("Sum of fractions");
    f1.displayFraction();
  }
}
