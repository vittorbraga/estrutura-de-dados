/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

import java.util.Arrays;

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
    
    public void enqueue(int element) {
        // se a capacidade da filar estiver esgotada
        // a gente pede para aumentar a capacidade
        if(manyItems == data.length) {
            ensureCapacity(data.length + INITIAL_CAPACITY);
        }
        // se não tivermos items na fila, setamos as variaveis no
        // inicio do array, posicao 0
        if(manyItems == 0) {
            front = 0;
            rear = 0;
        }
        // a gente de fato insere o elemento na fila
        data[rear] = element;
        // mover a posicao para o proximo espaco livre
        // onde o proximo elemento sera inserido
        rear++;
        // se a variavel rear chegou no limite do array 
        // voltamos a variavel rear para o inicio do array.
        // caso tenha um elemento valido, quando inserir um outro elemento
        // o metodo ensureCapacity vai gerernciar essa variavel
        if(rear >= data.length) {
            rear = 0;
        }
        // adicionar 1 a variavel que armazena a quantidade de item na fila.
        manyItems++;
    }
    
    public int dequeue() {
        // variavel pra armazenar o valor de retorno
        int resposta = 0;
        // so conseguimos remover um elemento se tivermos elemento na fila
        if(manyItems > 0) {
            // armazena o valor que estamos removendo na variavel resposta
            resposta = data[front];
            // incrementa a variavel front para que ela aponte para o proximo
            // elemento que sera removido quando solicitado
            front++;
            // se a variavel front chegou no limite do array 
            // voltamos a variavel front para o inicio do array.
            if(front >= data.length) {
                front= 0;
            }
            // por fim decrementamos 1 na vareavel que armazena a quantidade 
            // de elementos validos na fila.
            manyItems--;
        }
        return resposta;
    }
    
    public int peek() {
        int resposta = 0;
        if(manyItems > 0) {
            resposta = data[front];
        }
        return resposta;
    }
    
    public boolean isEmpty() {
        return manyItems == 0;
    }
    
    public void clear() {
        data = new int[INITIAL_CAPACITY];
        front = 0;
        rear = 0;
        manyItems = 0;
    }
    
    public int size() {
        return manyItems;
    }
    
    public void ToString() {
        System.out.println(Arrays.toString(data));
    }
}
