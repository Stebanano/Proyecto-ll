package MainClass;

import Clases.CuadroTexto;
import Clases.Gestor;
import Formulario.EditorTexto;


public class MainClass {
    public static void main(String[] args) {
        
        Gestor miGestor = new Gestor();
        CuadroTexto cuadro = new CuadroTexto();
        EditorTexto ventana = new EditorTexto();
        
        ventana.setVisible(true);
        
        
 } 
}
