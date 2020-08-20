package estruturadedados;

public class Stack {
    final int INITIAL_CAPACITY = 10;
    int manyItens;
    int[] data;
    
    public Stack() {
        manyItens = 0;
        data = new int[INITIAL_CAPACITY];
    }
    
    public int getCapacity() {
        return data.length;
    }
    
    public void ensureCapacity(int capacity) {
        if(data.length > capacity) {
            System.out.println("A Stack já possui essa capacidade");
            return;
        }
        int[] dataBigger = new int[capacity];
        System.arraycopy(data, 0, dataBigger, 0, data.length);
        data = dataBigger;
    }
    
    public void push(int value) {
        if(manyItens == data.length) {
            ensureCapacity(manyItens + INITIAL_CAPACITY);
        }
        data[manyItens] = value;
        manyItens++;
    }
    
    public int pop() {
        if(manyItens > 0) {
            manyItens--;
            int result = data[manyItens];
            return result;
        }
        System.out.println("A Stack está vazia.");
        return -1;
    }
    
    public int peek() {
        if(manyItens > 0) {
            return data[manyItens-1];
        }
        System.out.println("A Stack está vazia.");
        return -1;
    }
    
    public boolean isEmpty() {
        return manyItens == 0;
    }
    
    public void clear() {
        manyItens = 0;
        data = new int[INITIAL_CAPACITY];
    }
    
    public int size() {
        return manyItens;
    }
    
    public void ToString() {
        for(int i=manyItens-1; i>=0; i--) {
            System.out.println(data[i]);
        }
    }
}
