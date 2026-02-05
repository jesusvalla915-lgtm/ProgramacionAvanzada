/*Evaluacion Conceptual 
Ejercicio 1
" Implemente el getter y el setter de acuerdo a la documentación de la clase "
Version del parcial*/

public class Rectangulo {
    public String identificador;

     /**
     * Si el argumento es distinto de null, setea el identificador,
     * removiendo antes cualquier espacio inicial y conviertiendo a minusculas.
     * Si el argumento es null, ignora el valor sin setear el identificador
     * @param el nuevo identificador
     */
    public void setIdentificador (String id){
        if(id!=null){
            identificador = id.toLowerCase();
        }
    }
    
    /**
     * retorna el valor del identificador de este Circulo
     */
    public String getIdentificador () {
        return identificador;
    }
}
//Version corregida 
public class Rectangulo {
    public String identificador;

     /**
     * Si el argumento es distinto de null, setea el identificador,
     * removiendo antes cualquier espacio inicial y conviertiendo a minusculas.
     * Si el argumento es null, ignora el valor sin setear el identificador
     * @param el nuevo identificador
     */
    public void setIdentificador (String id){  
        if(id!=null){
            identificador = id.id.trim().toLowerCase();
        }
    }
    
    /**
     * retorna el valor del identificador de este Circulo
     */
    public String getIdentificador () {
        return identificador;
    }
}
