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
        
        /*Stack pilha = new Stack();
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
        pilha.ToString();*/
        
        /*Stack pilha = new Stack(); 
        int decimal = 12345;
        int resto = decimal;
        while(resto > 0) {
            pilha.push(resto%2);
            resto = resto/2;
        }
        String retorno = "";
        while(pilha.size() > 0) {
            retorno = retorno + pilha.pop();
        }
        System.out.println("Decimal: "+decimal+" binário: "+retorno);
        System.out.println("Capacidade: "+pilha.getCapacity());*/
        
        /*Queue fila = new Queue();
        fila.enqueue(234);
        fila.enqueue(456);
        fila.enqueue(25);
        fila.enqueue(474);
        System.out.println(fila.dequeue());
        fila.ToString();*/
        
        Deque deque = new Deque();
        deque.enqueue(234);
        deque.enqueue(456);
        //deque.addFront(999);
        deque.enqueue(999);
        deque.removeBack();
        deque.enqueue(765);
        deque.ToString();
        
        
    }   
}
