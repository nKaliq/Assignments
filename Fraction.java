import java.util.Scanner;

class Fraction
{
  int num, dnum ;

  public Fraction()
  {
     num=1;
     dnum=1;
  }

  public void inputFraction()
  {
    Scanner in=new Scanner(System.in);

    System.out.println("input fraction values");
    int an=in.nextInt();
    int ad=in.nextInt();

    num=an;
    dnum=ad;
  }


  public Fraction addFraction(Fraction f)
    {
      Fraction temp=new Fraction();
      temp.dnum = f.dnum * dnum;
      temp.num = f.num * (temp.dnum / f.dnum) + num *(temp.dnum / dnum);
      return temp;
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


  public static void main(String args[])
  {

    Fraction f1=new Fraction();
    Fraction f2=new Fraction();
    Fraction f3=new Fraction();

    f1.inputFraction();
    f2.inputFraction();

      f3 = f1.addFraction(f2);

      f3.simplify();

      f3.displayFraction();
  }
}
