package Clases;

import java.util.ArrayList;


public class Gestor{
    private ArrayList<Memento> respaldo = new ArrayList<>();
    
    
    public void setRespaldo(Memento m){
        respaldo.add(m);
    }
    
    public Memento getRespaldo(int indice){
        return respaldo.get(indice);
        
    }
    
}
