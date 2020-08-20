package estruturadedados;

import java.util.Hashtable;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // TODO code application logic here
        /*String[] array;
        array = new String[5];
        array[0] = "Segunda-feira";
        array[1] = "Terça-feira";
        array[2] = "Quarta-feira";
        array[3] = "Quinta-feira";
        array[4] = "Sexta-feira";
        System.out.println(array.length);
        System.out.println(array[3]);
        System.out.println("---------------------");
        //for(int i=0; i<array.length; i++) {
        //    System.out.println(array[i]);            
        //}
        String[] arrayBigger = new String[10];
        for(int i=0; i<array.length; i++) {
            arrayBigger[i] = array[i];
        }
        System.arraycopy(array, 0, arrayBigger, 0, array.length);
        array = arrayBigger;
        array[5] = "Sabado";
        array[6] = "Domingo";
        array[7] = "Sabado2";
        array[8] = "Domingo2";
        array[7] = null;
        array[8] = null;*/
        
        Stack pilha = new Stack();
        pilha.push(10);
        pilha.push(15);
        pilha.push(8);
        pilha.push(7);
        pilha.push(3);
        pilha.ToString();
        System.out.println("-------------------------------------");
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println("-------------------------------------");
        pilha.ToString();
        System.out.println("-------------------------------------");
        System.out.println(pilha.pop());
        System.out.println(pilha.peek());
        System.out.println("-------------------------------------");
        pilha.ToString();
    }   
}
