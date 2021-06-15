package Clases;

public class Memento {
    
    private String miTextoRespaldo;
    
    public Memento(String miTextoRespaldo){
       this.miTextoRespaldo = miTextoRespaldo;
    }
    
    public void setMiTextoRespaldo(String miTexto){
        this.miTextoRespaldo = miTexto;
    }
            
    public String getMiTextoRespaldo(){
        return this.miTextoRespaldo;   
    }
  
}
