package estruturadedados;

import java.util.Arrays;

public class Queue {
	final int INITIAL_CAPACITY = 10;
	int data[] = new int[INITIAL_CAPACITY];
	int manyItems;
	int front;
	int rear;
	
	public void ensureCapacity(int capacity) {
        if(data.length > capacity) {
            return;
        }else if(manyItems == 0) {
            data = new int[capacity];
        }else if(front <= rear) {
            int[] arrayMaior = new int[capacity];
            System.arraycopy(data, front, arrayMaior, front, manyItems);
            data = arrayMaior;
        }else {
            int[] arrayMaior = new int[capacity];
            int n1 = data.length - front;
            int n2 = rear + 1;
            System.arraycopy(data, front, arrayMaior, 0, n1);
            System.arraycopy(data, 0, arrayMaior, n1, n2);
            front = 0;
            rear = manyItems - 1;
            data = arrayMaior;
        }
    }
	
	public void enqueue(int element) {
        if(manyItems == data.length) {
            ensureCapacity(data.length + INITIAL_CAPACITY);
        }
        if(manyItems == 0) {
            front = 0;
            rear = 0;
        }
        data[rear] = element;
        rear++;
        if(rear >= data.length) {
            rear = 0;
        }
        manyItems++;
    }
	
	public int dequeue() {
        int resposta = 0;
        if(manyItems > 0) {
            resposta = data[front];
            front++;
            if(front >= data.length) {
                front= 0;
            }
            manyItems--;
        }
        return resposta;
    }
	
	public int getCapacity() {
        return data.length;
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
