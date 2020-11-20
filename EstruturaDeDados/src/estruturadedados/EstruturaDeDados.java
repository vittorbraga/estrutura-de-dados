package estruturadedados;

import estruturadedados.Tree.BinaryTree;
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
        
        /*Deque deque = new Deque();
        deque.enqueue(234);
        deque.enqueue(456);
        //deque.addFront(999);
        deque.enqueue(999);
        deque.removeBack();
        deque.enqueue(765);
        deque.ToString();*/
        
        /*
        // Resultado e a variavel que retorna se a string e ou nao um palindromo
        String resultado = "É um palindromo";
        // e a string que queremos saber se e um palindromo
        String palindromo = "02022020";
        // declarando e instanciando a nossa fila
        Queue fila = new Queue();
        // a funcao toCharArray quebra a string em um array de char
        // [0, 2, 0, 2, 2, 0, 2, 0]
        char[] ch = palindromo.toCharArray();
        // Faz um loop para adicionar os elementos da string na nossa fila
        for(int i=0; i<ch.length; i++) {
            // os comandos Integer.parseInt e String.valueOf
            // sao apenas para converter do tipo char para o tipo int
            fila.enqueue( Integer.parseInt( String.valueOf( ch[i] ) ) );
        }
        // agora fazemos um for iniciando do ultimo index o array ch
        // ate o primeiro indice
        for(int i=ch.length-1; i>=0; i--){
            // Integer.parseInt(String.valueOf(ch[i])) -> e o item do array ch iniciando 
            // do fim para o inicio
            // fila.dequeue() -> e o desenfileiramento da nossa fila, ou seja
            // o elemento que foi inserido primeiro vai sair primeiro
            // se os valores forem diferentes, e descobrimos que a string nao e um palindromo
            if( Integer.parseInt(String.valueOf(ch[i])) != fila.dequeue() ) {
                resultado = "Não é uma palindromo";
                break;
            }
        }
        // printar o resultado
        System.out.println(resultado);*/
        
        /*LinkedList list = new LinkedList();
        list.push(987);
        list.push(8);
        list.push(75);
        list.push(27);
        list.push(234);
        // list.removeAt(2);
        // list.remove(75);
        System.out.println(list.ToString());*/
        // System.out.println(Fibonacci(6)+"");
        
        /*BinaryTree bst = new BinaryTree();
        bst.insert(11);
        bst.insert(7);
        bst.insert(15);
        bst.insert(5);
        bst.insert(3);
        bst.insert(9);
        bst.insert(8);
        bst.insert(10);
        bst.insert(13);
        bst.insert(12);
        bst.insert(14);
        bst.insert(20);
        bst.insert(18);
        bst.insert(25);
        bst.insert(6);
        //bst.inOrderTraverse();
        //bst.postOrderTraverse();
        bst.remove(15);*/
        
        Graph grafo = new Graph();
        grafo.addEdge("A", "B");
        grafo.addEdge("A", "C");
        grafo.addEdge("A", "D");
        grafo.addEdge("C", "D");
        grafo.addEdge("C", "G");
        grafo.addEdge("D", "G");
        grafo.addEdge("D", "H");
        grafo.addEdge("B", "E");
        grafo.addEdge("B", "F");
        grafo.addEdge("E", "I");
        //System.out.println(grafo.ToString());
        //grafo.breadthFirstSearch();
        //grafo.BFS("I");
        grafo.depthFirstSearch();
    }   
    
    public static int Fibonacci(int n) {
        if(n < 1) return 0;
        if(n <= 2) return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    
}
