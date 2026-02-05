//Ejercicio 6 del final
public class Transportes {
    ArrayList<Vehiculo> moviles;

    public Transportes () {
        moviles = new ArrayList<>();
    }

    public void addMovil (???) {
        // TODO implementar
    }

    public ArrayList<???> getAcuaticos () {
        // TODO implementar
        return null;
    }
}

//Ejercicio 6 resuelto

public class Transportes {
    ArrayList<Vehiculo> moviles;

    public Transportes () {
        moviles = new ArrayList<>();
    }

    public void addMovil (Vehiculo v) {
        moviles.add(v);
    }

    public ArrayList<Acuaticos> getAcuaticos () {
       ArrayList<Acuatico> acuaticos  = new ArrayList<>();
        for(Vehiculo v : moviles){
          if(v instance of Acuatico){
            acuaticos.add(v);
          }
        }
      return acuaticos;
    }
  
}
