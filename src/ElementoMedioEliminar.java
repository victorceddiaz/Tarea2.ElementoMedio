
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor Cedillo
 */
public class ElementoMedioEliminar {
    private static ArrayList<String> lista = new ArrayList<String>();
    private static int paso=0;
    
    public static String elementoMedio(int x){
        if(x%2==0){
            return lista.get((x/2) -1);
        } else {
            paso=((x+1)/2)-1;
            return lista.get(paso);
        }
    }
    
    public static void main(String[] args) {
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        //lista.add("5");
        System.out.println("Lista original : " + lista);
        String medio=elementoMedio(lista.size());
        lista.remove(medio);
        System.out.println("Lista sin el elemento medio : " + lista);
    }
}
