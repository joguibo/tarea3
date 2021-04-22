
/**
 * Write a description of class Matematicomejorado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matematicomejorado
{
   double mayor;
   double medio;
   double menor;
   double cuadrante1;
   double cuadrante2;
   double cuadrante3;
   double cuadrante4;
   calculadora calcu;

   public Matematicomejorado(){
      calcu = new calculadora();
   }
  
   public String hallar(double a,double b,double c){
      String res;
      if(a>b&&a>c){
         mayor=a;
         if(b>c){
           medio=b;
           menor=c;
          }else{
              medio=c;
              menor=b;
           }
      }
      if(b>a&&b>c){
         mayor=b;
         if(a>c){
           medio=a;
           menor=c;
          }else{
              medio=c;
              menor=a;
         }
      }
      if(c>a&&c>b){
         mayor=c;
         if(b>a){
           medio=b;
           menor=a;
          }else{
              medio=a;
              menor=b;
         }
      }

      res = "El mayor: " + mayor;
      res += "El medio: " + medio;
      res += "El menor: " + menor;
      return res;
      
   }
   
   public double hallarArea(double base,double altura){
      double hallarArea;
      hallarArea=base*altura;
      return hallarArea;
   }
   public double distanciaPuntos(double x1,double x2,double y1,double y2){
      double calcularDistancia;
      calcularDistancia=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
      return calcularDistancia;
      
   }
   public String cuadrantePunto(double x,double y){
       String cuadrante;
       
       if(x>0&&y>0){
         cuadrante1=this.cuadrante1;
          if(x<0&&y>1){
            cuadrante2=this.cuadrante2;
            }
            if(x<0&&y<0){
             cuadrante3=this.cuadrante3;
            }
             if(x<0&y>0){
             cuadrante4=this.cuadrante4;
             }
        
        } 
       cuadrante="el cuadrante1 es"+cuadrante1;
       cuadrante="el cuadrante2 es"+cuadrante2;
       cuadrante="el cuadrante3 es"+cuadrante3;
       cuadrante="el cuadrante4 es"+cuadrante4;
   
       return cuadrante;
   }
   
}


