
package fabricmachines;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Maquinas {
    
  String Nombre;
  String SeccionMaquina;
  String TipoMaquina;
  int Voltaje;
  Scanner sc;
  
  public Maquinas (){
    
       sc =new Scanner (System.in);
  
  }
  public void capturar(){
      
    JOptionPane.showInputDialog("Nombre de la máquina: ");
    JOptionPane.showInputDialog("Sección de uso de la máquina: ");
    JOptionPane.showInputDialog("Tipo de máquina: ");
    JOptionPane.showInputDialog("Voltaje de la máquina: ");
    
  
  }
  
  public void listar(){
  
  
  }
  public void Eliminar(){
  
  
  }
    
}
