package src.estructuras;

public class PilaStrings {

    private Nodo root;

    public PilaStrings(){
        root = null;
    }

    public void push(String data){
       if (root!=null) {
           Nodo tmp = root;
            root = new Nodo(data, tmp);
       }
       else{
           root = new Nodo(data,null);
       }
    }

    public String pop(){
        if (root != null){
            String data = root.getData();
            root = root.getNext();
            return data;
        }
        else
            return null;
    }

    
    private class Nodo{

        private Nodo next;
        private String data;

        private Nodo(String data, Nodo next){
            this.next = next;
            this.data = data;
        }

        private Nodo getNext(){
            return this.next;
        }

        private String getData(){
            return this.data;
        }

    }
}
