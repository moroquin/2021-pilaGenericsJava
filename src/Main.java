package src;
import src.estructuras.*;
import src.data.*;

/**
 * @author oliver sierra
 * @version 0.0
 * 
 * Main
 */
public class Main {

    /**
     * método principal
     * @param args
     */
    public static void main(String[] args){


        Object t = new Persona(5, "Oliver");
        System.out.println(t.toString());

        PilaStrings pilaStrings = new PilaStrings();
        pilaStrings.push("hola");
        pilaStrings.push("adios");
        System.out.println(pilaStrings.pop());
        System.out.println(pilaStrings.pop());

        Pila<Persona>   pila = new Pila<>();
        pila.push(new Persona(1, "oliver"));
        pila.push(new Persona(2, "Maria"));
        pila.push(new Persona(3, "Ana"));
        System.out.println(pila.pop().toString());
        System.out.println(pila.pop().toString());
        System.out.println(pila.pop().toString());


    }
}