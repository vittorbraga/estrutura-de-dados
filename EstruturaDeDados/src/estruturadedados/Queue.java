/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

/**
 *
 * @author vittor
 */
public class Queue {
    final int INITIAL_CAPACITY = 10;
    int data[];
    int manyItems;
    int front;
    int rear;
    
    public Queue() {
        data = new int[INITIAL_CAPACITY];
        front = 0;
        rear = 0;
        manyItems = 0;
    }
    
    public int getCapacity() {
        return data.length;
    }
    
    public void ensureCapacity(int capacity) {
        // se a gente realmente precisa aumentar
        if(data.length > capacity) {
            return; 
        // verificar fila está vazia, se tiver vazia
        // aumenta a capacidade solicitada
        }else if(manyItems == 0) {
            data = new int[capacity];
        // verificar se a posicao final é maior do que a 
        // posicao inicial..
        // ex: elemento mais antigo na posicao 1 do array
        // e o elemento mais novo está na posicao 4 do array
        }else if(front <= rear) {
            int[] arrayMaior = new int[capacity];
            System.arraycopy(data, front, arrayMaior, front, manyItems);
            data = arrayMaior;
        // entende-se que a posicao final é menor do que a posicao inicial
        // ex: elemento mais antigo na posicao 4 do array
        // e o elemento mais novo está na posicao 0 do array
        // a copia dos elementos precisa manter a ordem de chegada da fila
        }else {
            int[] arrayMaior = new int[capacity];
            int n1 = data.length - front;
            int n2 = rear + 1;
            // copia os elementos mais antigos da fila porém mais
            // avancados no array
            System.arraycopy(data, front, arrayMaior, 0, n1);
            // copia o restante dos elementos seguindo a ordem da fila
            System.arraycopy(data, 0, arrayMaior, n1, n2);
            front = 0;
            rear = manyItems - 1;
            data = arrayMaior;
        }
    }
}
