package estruturadedados;

public class Stack {
    int INITIAL_CAPACITY = 10;
    int manyItens = 0;
    int[] data = new int[INITIAL_CAPACITY];
    
    public void ensureCapacity() {
        int tamanhoArray = getCapacity();
        int[] arrayMaior = new int[tamanhoArray + INITIAL_CAPACITY];
        for(int i=0; i<data.length; i++) {
            arrayMaior[i] = data[i];
        }
        data = arrayMaior;
    }
    
    public int getCapacity() {
        return data.length;
    }
    
    public void push(int elemento) {
        if(manyItens == getCapacity()) {
            ensureCapacity();
        }
        data[manyItens] = elemento;
        manyItens++;
    }
    
    public int peek() {
        if(manyItens-1 >= 0){
            return data[manyItens-1];
        }
        return -1;
    }
    
    public int pop() {
        if(manyItens-1 >= 0){
            int resposta = peek();
            manyItens--;
            return resposta;
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return manyItens == 0;
    }
    
    public int size() {
        return manyItens;
    }
    
    public void clear() {
        manyItens = 0;
        data = new int[INITIAL_CAPACITY];
    }
    
    public String toString() {
        String retorno = "";
        for(int i=0; i<manyItens; i++) {
            retorno += data[i] + ", ";
        }
        return retorno;
    }
}
