import java.util.Scanner;
import java.util.ArrayList;

class Point
{
  float x, y;
    public Point(){
      x=0;
      y=0;
    }
    public Point(float x,float y){
      this.x=x;
      this.y=y;
    }

    public String show(){
      return "(" +x+ ", " +y+ ")" ;
    }
    public float getx(){return x;}
    public float gety(){return y;}
}

class Rectangle
{
  Point a,b,c;

    public Rectangle()
    {
      a=new Point(0,0);
      b=new Point(0,0);
      c=new Point(0,0);
    }

    public Rectangle(Point a,Point b, Point c)
    {
      this.a=a;
      this.b=b;
      this.c=c;
    }

    public float Area()
    {
      float distAB, distBC;

      distAB= (float) Math.pow(b.getx()-a.getx() ,2) + (float)Math.pow(b.gety()-a.gety() ,2);
      distAB= (float) Math.sqrt(distAB);
      distBC= (float) Math.pow(c.getx()-b.getx() ,2) + (float)Math.pow(c.gety()-b.gety() ,2);
      distBC= (float) Math.sqrt(distBC);

      return distAB * distBC ;
    }

    public String showPoints()
    {
      return a.show() + b.show() + c.show() ;
    }


}

class AreaOfRectangle
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    ArrayList<Rectangle> rec= new ArrayList<Rectangle>();

    //Takes input n for number of rectangle
      int n=in.nextInt();
    //Takes input for the cordinates
    float t1x,t1y,t2x,t2y,t3x,t3y; //temperory variable to hold x,y coordinates
    Point p1,p2,p3;        //temporay Object to hold point

    for(int i=0 ; i<n ; i++)
    {
          t1x=in.nextFloat();
          t1y=in.nextFloat();
          p1=new Point(t1x,t1y);

          t2x=in.nextFloat();
          t2y=in.nextFloat();
          p2=new Point(t2x,t2y);

          t3x=in.nextFloat();
          t3y=in.nextFloat();
          p3=new Point(t3x,t3y);

          //creating and Adding Rectangle with input points to arrayList
          rec.add( new Rectangle(p1,p2,p3) );
    }

    for(Rectangle i :rec)
    {
      System.out.println("Area of rectangle with vertices: " + i.showPoints() +" is "+ i.Area());
    }

  }
}
