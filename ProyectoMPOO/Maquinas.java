package fabricmachines;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Maquinas {
  protected String Nombre;
  protected String SeccionMaquina;
  protected String TipoMaquina;
  Scanner sc;
  Voltaje voltaje;
  
  
public Maquinas() {

    }

public Maquinas(String Nombre, String SeccionMaquina, String TipoMaquina) {
    this.Nombre = Nombre;
    this.SeccionMaquina = SeccionMaquina;
    this.TipoMaquina = TipoMaquina;
    this.sc = sc;
    this.voltaje = voltaje;   
    }
    
  public Maquinas (Voltaje voltaje){
    this.voltaje=voltaje;
    sc = new Scanner(System.in);
    }
  
  public void capturar(){ 
    System.out.println("-----------------------");
    System.out.print("Nombre de la maquina: ");
    Nombre=sc.nextLine();
    sc.nextLine();
    System.out.print("Sección de uso de la máquina: ");
    SeccionMaquina=sc.nextLine();
    System.out.print("Tamaño de máquina: ");
    TipoMaquina=sc.nextLine();
    voltaje.capturarVoltaje();
    System.out.println("-----------------------");  
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getSeccionMaquina() {
        return SeccionMaquina;
    }
    public void setSeccionMaquina(String SeccionMaquina) {
        this.SeccionMaquina = SeccionMaquina;
    }
    public String getTipoMaquina() {
        return TipoMaquina;
    }
    public void setTipoMaquina(String TipoMaquina) {
        this.TipoMaquina = TipoMaquina;
    }

    public Voltaje getVoltaje() {
        return voltaje;
    }
    public void setVoltaje(Voltaje voltaje) {
        this.voltaje = voltaje;
    }
   @Override
    public String toString() {
        return "Maquina:"+ 
                "\nNombre= " + Nombre + 
                "\nSeccionMaquina= " + SeccionMaquina + 
                "\nTipoMaquina= " + TipoMaquina +" \nVoltaje=" + voltaje.getVoltaje();
    }   
    
    
}
