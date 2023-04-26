package fabricmachines;


public class Listas {
    private Nodo cabeza;
    private int longitud=0;
    private class Nodo{
        public Maquinas maquina;
        public Nodo siguiente=null;
        
        public Nodo (Maquinas maquina){
            this.maquina=maquina;
        }
    
    }
    
    public void insertarPrincipio(Maquinas maquina){
    Nodo nodo = new Nodo(maquina);
    nodo.siguiente=cabeza;
    cabeza=nodo;
    longitud++;
    }
    
    public void insertarFinal(Maquinas maquina){
    Nodo nodo=new Nodo(maquina);
    if(cabeza==null){
        cabeza=nodo;
    }else{
    Nodo puntero=cabeza;
    while(puntero.siguiente!=null){
        puntero=puntero.siguiente;
    }
    puntero.siguiente=nodo;
    }
    longitud++;
    }
    
    public int contador(){
    return longitud;
    }
    
    public void eliminarFinal(){
       if (cabeza!=null){
        Nodo primer=cabeza;
        cabeza=cabeza.siguiente;
        primer.siguiente=null;
        longitud--;
       }
    }
}
