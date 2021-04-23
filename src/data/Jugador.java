package src.data;

public class Jugador {
    
    private int id;
    private String nombre;

    public Jugador(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "id "+ id + " Nombre: "+nombre;
    }
    
}
