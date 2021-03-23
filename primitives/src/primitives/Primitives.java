
package primitives;
import java.util.Scanner;
import static javax.management.Query.value;
import static javax.management.Query.value;
import static javax.management.Query.value;
public class Primitives {

    public static void main(String[] args) {
        System.out.println("Enter the vlaue 1: ");
        Scanner input1=new Scanner(System.in);
        System.out.println("Enter the vlaue 2: ");
         Scanner input2=new Scanner(System.in);
         System.out.println("Enter the vlaue 3: ");
          Scanner input3=new Scanner(System.in);
        Shapes obj= new Shapes();
    }

  
class Util
       
{
     double value;
     double align;
    public void isZero(double value)
    {
        this.value=value;
    }
    public void alignZero( double align)
    {
        this.align=align;
        
    }
}

class Point3D extends Util
        
{
    int val1;
    int val2;
  int cordinate1;  
  int cordinate2; 
  int cordinate3; 
  public void addVectors(int a,int b,int c)
  {
      this.cordinate1=a;
       this.cordinate2=b;
        this.cordinate3=c;
      
  }
  public int Sybtract(int a,int b)
  {
      this.val1=a;
      this.val2=b;
      int result=a-b;
      return result;
  }
  public double distanceSqure(double a, double b)
  {
        int name = this.val1=(int) a;
      this.val2=(int) b;
      double distanesqure=a*b;
        return distanesqure;
  
}
  public double squre(double a, double b)
  {
      int name = this.val1=(int) a;
      this.val2=(int) b;
      double squre=a*b;
      return squre;
}
  public void equlas()
  {
      
  }
  
  class vector extends Point3D
  {
      public int addVector(int a,int b)
      {
          this.val1=a;
          this.val2=b;
          int addition =a+b;
          return addition;
      }
      public int subtractVector(int a,int b)
      {
          this.val1=a;
          this.val2=b;
          int subtraction =a-b;
          return subtraction;
      }
       public double subtractVector(double a,double b)
      {
          this.val1=(int) a;
          this.val2=(int) b;
          double scaling=a*b;
          return scaling;
      }
       public double crossProduct(double a,double b)
      {
          this.val1=(int) a;
          this.val2=(int) b;
          double product=a*b;
          return product;
      }public double dotproduct (double a,double b)
      {
          this.val1=(int) a;
          this.val2=(int) b;
          double dotproduct=a*b;
          return dotproduct;
      }
      public double lengthSqured(double a,double b)
      {
          this.val1=(int) a;
          this.val2=(int) b;
          double leSqure=a*b;
          return leSqure;
      }
      public double length(double a,double b)
      {
          this.val1=(int) a;
          this.val2=(int) b;
          double length=a*b;
          return length;
      }
  }
  class Ray extends vector
  {
      public double point3D(double a,double b,double c)
      {
          this.cordinate1=(int) a;
          this.cordinate2=(int) b;
          this.cordinate3=(int) c;
          double point3D=a*b*c;
          return point3D;
      }
      public void equls()
      {
          
          
      }
  }
  class Shapes extends Ray
  {
      int side1;
      int side2;
      int side3;
      public int Sphere(int m)
      {
          int sphere=4*m*m;
          return sphere;
      }
      public int Spheres(int m)
      {
          this.val1=m;
          int sphere=4*m*m;
          return sphere;
      }
      public double cube(int r,int h)
      {
          double cube=2*3.142*r*h + 3.142*r*r;
          return cube;
      }
       public double Sylinder(int r,int h)
      {
          double sylinder=2*3.142*r*h + 3.142*r*r;
          return sylinder;
      }
  }
  
  
  
 }


