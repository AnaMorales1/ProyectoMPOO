
package fabricmachines;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Voltaje {
     //ATRIBUTOS
  private double Voltaje;
  Scanner sc;
  static final double nivelError1=5;
  static final double nivelError2=10;
  static final double nivelError3=10;
  static final double nivel1=20;
  static final double nivel2=120;
  private double nivel3=240;
  private double error;   
    //CONTRUCTORES
  ArrayList <Double> arreglo2=new ArrayList();
    public Voltaje(){
        sc = new Scanner(System.in);
    }
    //METODOS
    public void capturarVoltaje(){
    System.out.println("Voltaje de la maquina: ");
    Voltaje=sc.nextDouble();
    arreglo2.add(Voltaje);
    }
    public void setVoltaje(double Voltaje){
           this.Voltaje=Voltaje; 
        }
    
    double getVoltaje(){
        return this.Voltaje;
    }
    
    public void listarVoltaje(){
        System.out.println("Voltaje: "+getVoltaje());  
    }
    
    public void Clasificacion(){
        System.out.println(arreglo2.indexOf(Voltaje));
        System.out.print("------Nivel de voltaje-----");
        if (Voltaje<(nivel1-nivelError1)){//menos de 15 
           System.out.println("Error: voltaje no valido");  
         }else if(Voltaje>=(nivel1-nivelError1) && Voltaje<=(nivel1+nivelError1)){// entre 15 y 25
            error=Voltaje-nivel1;
            System.out.println("Voltaje válido, está trabajando en el nivel 1 con "+Voltaje+" con un margen de error de "+error);
         }else if(Voltaje>(nivel1+nivelError1) && Voltaje<(nivel2-nivelError2)){//mayor a 25 y menor a 110
            System.out.println("Error: voltaje no valido");  
         }else if(Voltaje>=(nivel2-nivelError2) && Voltaje<=(nivel2+nivelError2)){// de 110 a 130
            error=Voltaje-nivel2;
            System.out.println("Voltaje válido, está trabajando en el nivel 2 con "+Voltaje+" con un margen de error de "+error);
         }else if (Voltaje>(nivel2+nivelError2) && Voltaje<(nivel3-nivelError3)){//mayor a 130 a menor de 230
         System.out.println("El voltaje solicitado es erróneo"); 
         }else if (Voltaje>=(nivel3-nivelError3) && Voltaje<=(nivel3+nivelError3)){// de 230 a 250
            error=Voltaje-nivel3;
            System.out.println("Voltaje válido, está trabajando en el nivel 3 con "+Voltaje+" con un margen de error de "+error);
         }else if(Voltaje>(nivel3+nivelError3)){
            System.out.println("Error: voltaje no valido"); 
         }
  }
}
