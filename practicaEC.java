//Ejercicios Unidad 4 aula virtual Fcefyn
/*Completar la clase Registrador definiendo una colección que agrupe los registros de temperatura y humedad. Recuerde además completar los métodos que estén definidos.

Es importante que el método getListado devuelva una colección de la cual puedan obtenerse los registros en el orden en que fueron ingresados. */
import java.util.HashSet;
import java.util.ArrayList;

public class Registrador {
    private String designacion;
    private ArrayList<Registro> registros; //Definir coleccion apropiada
    
    //Constructor
    public Registrador (String designacion){
            registros = new ArrayList<Registro>();
            this.designacion = designacion;
    }
    
    //Metodos
    //getters
    public String getDesignacion (){
        return designacion;
    }

   /**
   * Este metodo devuelve la coleccion que contiene los registros 
   * guardados. 
   * @return La coleccion con el listado de registros.
   */
    public ArrayList<Registro> getRegistros(){ //Definir coleccion apropiada
       return registros; 
    }
    
   /**
   * Este metodo devuelve el objeto del tipo Registro en la posicion
   * i de la coleccion.
   * @param  i  El indice solicitado
   * @return El registro con indice i.
   */
    public Registro getRegistro (int i){
        return registros.get(i);
    }
    //setters
    public void setDesignacion (String designacion){
        this.designacion = designacion;
    }

   /**
   * Este metodo permite agregar un registro a la coleccion elegida   
   * @param registro Registro que se desea agregar a la coleccion.
   */
    public void agregarRegistro (Registro registro){
        registros.add(registro);
    }
}

/*Completar la clase Catedra definiendo para <TBD> una colección que agrupe los docentes pertenecientes a la misma. Recuerde además completar todos los métodos indicados en la clase

La colección elegida no debe permitir duplicados.*/

import java.util.HashSet;
import java.util.ArrayList;

public class Catedra {
    private String materia;
    private HashSet<Docente> docentes;
    // declare la variable y el tipo apropiados para agrupar los docentes de la catedra
    
    //Constructor
    public Catedra (String materia){
        //Inicialice TODOS loes atributos de la clase
        this.materia = materia;
        docentes = new HashSet<>();
        
    }
    
    //Metodos
    //getters
    public String getMateria (){
        return materia;
    }

   /**
   * Este metodo devuelve la coleccion que contiene los docentes 
   * pertenecientes a la catedra. Debe seleccionar y reemplazar
   * <TBD> con una colección que no permita duplicados
   * @return La coleccion con el listado de docentes.
   */
    public HashSet<Docente> getListado(){
        return docentes;
    }
    
    //setters
    public void setMateria (String materia){
        this.materia=materia;
    }

   /**
   * Este metodo permite agregar un alumno a la coleccion elegida   
   * @param docente Docente que se desea agregar a la coleccion.
   */
    public void agregarDocente (Docente docente){
        docentes.add(docente);

    }
    
    /**
   * Este metodo devuelve la cantidad de docentes pertenecientes a la 
   * catedra.
   * @return Cantidad de docentes en la coleccion.
   */
    public int cantidadDocentes (){
         return docentes.size();
    }
}

/*Asumiendo que la clase Alumno está implementada, complete la clase Aula, defina la colección que agrupe los alumnos pertenecientes al curso de Informática (figura como <TBD> en el diagrama de clases) y completar los métodos indicados.

Es importante la colección elegida permita obtener los alumnos en el orden en que fueron ingresados. */

import java.util.HashSet;
import java.util.ArrayList;

public class Aula {
    private String materia;
    private ArrayList<Alumno> listaDeAlumnos;
    // Utilizar la coleccion que considere apropiada
    // Defina una coleccion para el listadoDeAlumnos
    //<TBD> listadoDeAlumnos;
    
    //Constructor
    public Aula (String materia){
        this.materia = materia;
        listaDeAlumnos = new ArrayList<>();
        //complete el constuctor
    }
    
    //Metodos
    //getters
    public String getMateria (){
        return materia;
    }

   /**
   * Este metodo devuelve la coleccion que contiene los alumnos 
   * pertenecientes al curso. 
   * @return La coleccion con el listado de alumnos.
   */
    public ArrayList<Alumno> getListado(){
        //Implemente este metodo
        return listaDeAlumnos;   // No olvide modificar esta linea
    }
    
   /**
   * Este metodo devuelve el objeto del tipo Alumno en la posicion
   * i de la coleccion.
   * @param  i  El indice solicitado
   * @return El alumno con indice i.
   */
    public Alumno getAlumno(int i){
        //Implemente este metodo
        return listaDeAlumnos.get(i);   // No olvide modificar esta linea
    }
    //setters
    public void setMateria (String materia){
        this.materia=materia;
    }

   /**
   * Este metodo permite agregar un alumno a la coleccion elegida   
   * @param alumno Alumno que se desea agregar a la coleccion.
   */
    public void agregarAlumno (Alumno alumno){
        listaDeAlumnos.add(alumno);
    }
}

/*Completar la clase Gondola definiendo para <TBD> una colección que agrupe los productos pertenecientes a la misma. Recuerde además completar todos los métodos indicados en la clase.

La colección elegida no debe permitir duplicados.*/

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class Gondola {
    private String pasillo;
    private HashSet<Producto> productos;  // Definir clase de coleccion a utilizar
    
    //Constructor
    public Gondola (String pasillo){
        this.pasillo = pasillo;
            productos = new HashSet<>(); 
    }
    
    //Metodos
    //getters
    public String getPasillo (){
        return pasillo;
    }

   /**
   * Este metodo devuelve la coleccion que contiene los productos 
   * que se encuentran en la gondola. 
   * @return La coleccion con el listado de productos.
   */
    public HashSet<Producto> getProductos(){  // Definir clase de coleccion 
           return productos; // Completar este metodo
    }
    
    //setters
    public void setPasillo (String pasillo){
            this.pasillo = pasillo;// Completar este metodo
    }

   /**
   * Este metodo permite agregar un producto a la coleccion elegida   
   * @param producto El producto que se desea agregar a la coleccion.
   */
    public void agregarProducto (Producto producto){
        productos.add(producto);// Completar este metodo    
    }
    
    /**
   * Este metodo devuelve la cantidad de productos pertenecientes en la
   * gondola.
   * @return Cantidad de productos en la coleccion.
   */
    public int cantidadProductos (){
        return productos.size();// Completar este metodo
    }
}
