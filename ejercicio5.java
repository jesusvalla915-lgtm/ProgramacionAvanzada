//ejercicio 5 herencia en java 

//Modifique la definicion de la clase para realizar la herencia 
public class Espada extends Armamento {
	private String nombre;
    /**
     * Constructor de la clase Espada.
     * El nombre es el nombre de la clase.
     */
    public Espada (Integer ataque) {
	    //TODO Implementar constructor
    }

    public String getNombre() {
		return nombre;
    }
}

//Ejercicio resuelto

//Modifique la definicion de la clase para realizar la herencia 
public class Espada extends Armamento {
	private String nombre;
    /**
     * Constructor de la clase Espada.
     * El nombre es el nombre de la clase.
     */
    public Espada (Integer ataque) {
	    super(ataque);
      nombre = "Espada";
    }

    public String getNombre() {
		return nombre;
    }
}
