package Clases;

       //Originator
public class CuadroTexto{
    private String miTexto;
    
    
    public CuadroTexto(String miTexto){ 
        this.miTexto = miTexto;
    }  
    public CuadroTexto(){   
    }
    
    
    public Memento CrearMemento(){
        return new Memento(this.miTexto);
    }
    
    
    public void Recuperar(Memento m){
        this.miTexto = m.getMiTextoRespaldo();
    }

    
    public void setMiTexto(String miTexto) {
        this.miTexto = miTexto;
    }

   
    public String getMiTexto() {
        return  miTexto;
    }
      
}
