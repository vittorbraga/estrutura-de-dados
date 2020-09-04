package estruturadedados;

public class Deque extends Queue {
    public void addFront(int element) {
        if(manyItems == data.length) {
            ensureCapacity(data.length + INITIAL_CAPACITY);
        }
        front--;
        if(front < 0) {
            front = getCapacity() -1;
        }
        data[front] = element;
        manyItems++;
    }
    
    public int removeBack() {
        int resposta = 0;
        if(manyItems > 0) {
            rear--;
            if(rear < 0) {
                rear = getCapacity() - 1;
            }
            resposta = data[rear];
            manyItems--;
        }
        return resposta;
    }
    
    public int peekBack() {
        int resposta = 0;
        if(manyItems > 0) {
            if(rear-1 < 0) {
                resposta = data[getCapacity() - 1];
            }else {
                resposta = data[rear-1];
            }
        }
        return resposta;
    }
}
