package src.estructuras;

public class Pila <T> {

    private Nodo<T> root;

    public Pila(){
        root = null;
    }

    public void push(T data){
       if (root!=null) {
           Nodo<T> tmp = root;
            root = new Nodo<T>(data, tmp);
       }
       else{
           root = new Nodo<T>(data,null);
       }
    }

    public T pop(){
        if (root != null){
            T data = root.getData();
            root = root.getNext();
            return data;
        }
        else
            return null;
    }

    private class Nodo <T>{

        private Nodo<T> next;
        private T data;

        private Nodo(T data, Nodo<T> next){
            this.next = next;
            this.data = data;
        }

        private Nodo<T> getNext(){
            return this.next;
        }

        private T getData(){
            return this.data;
        }

    }
    
}
