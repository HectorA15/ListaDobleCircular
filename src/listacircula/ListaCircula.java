package listacircula;



public class ListaCircula {

    public static void main(String[] args) {
        
        
        ListaCircular lista = new ListaCircular();
        lista.insertarAlFrente(new Cancion("One more hour", "Tame Impala", 160));
        lista.insertarAlFrente(new Cancion("b b", "b", 130));
        lista.insertarAlFrente(new Cancion("c c", "c c", 180));
        lista.insertarAlFrente(new Cancion("d", "d d d", 210));

       
    }

}
