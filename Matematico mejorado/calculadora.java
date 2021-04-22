
/**
 * Write a description of class calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calculadora
{
    public String ecuacion(double a,double b,double c){
      String res;
      double x1;
      double x2;
      x1=(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
      x2=(-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
        
      res = "x1 es " + x1;
      res += "x2 es " + x2;
      return res;
    }
    public String puntos(double x1,double x2,double y1,double y2){
      String res;
      double a;
      double b;
      double c;
      double m;
      
      
      m=(y2-y1)/(x2-x1);
      a=(-y1/m)-x1;
      b=m*x1+x1;
      c=(-y1)+(-x1);
      
      res = "a es " + a;
      res += "b es " + b;
      res += "c es " +c;
      
      return res;
    }
    public double catetotriangulo(double cateto1,double hipotenusa){
      double cateto2;
      cateto2=Math.sqrt(Math.pow(hipotenusa,2)-Math.pow(cateto1,2));
      return cateto2;
    }
    
}

