/**Ejercicio 2 de la evaluacion Conceptual 

Para la clase especificada, implementar 

public void marcarComoComprado(String nombre)

Nota: Asuma que la clase Item implementa los métodos:

public void setComprado(boolean comprado)
public String getNombre()*/

public class Evaluacion {
public ArrayList<Item> listaDeCompras;

    public Evaluacion() {
        listaDeCompras = new ArrayList<Item>();
    }

    /**
     * Implementar el metodo de manera que busque el item con el nombre 
     * indicado en la lista y lo marque como comprado (true)
     */
    public void marcarComoComprado(String nombre) {
        for(Item items : listaDeCompras){
            if(items.getNombre().equals(nombre)){
                items.setComprado(true);
            }
        }
    }
}
