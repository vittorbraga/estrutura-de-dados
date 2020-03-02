package estruturadedados;

import java.util.ArrayList;

public class Pilha {
    public ArrayList<Integer> items;
    
    public Pilha() {
        this.items = new ArrayList<Integer>();
//        this.push(3);
//        this.push(10);
//        this.push(8);
////        this.pop();
////        this.pop();
////        System.out.println(this.items.toString());
//        this.push(23);
////        System.out.println(peek());
//        System.out.println(this.imprimir());
    }
    
    public void push(int elemento) {
        this.items.add(elemento);
    }
    
    public int pop() {
        int retorno = 0;
        retorno = this.peek();
        this.items.remove(this.items.size()-1);
        return retorno;
    }
    
    public int peek() {
        if(!isEmpty()){
            return this.items.get(this.items.size()-1);
        }else{
            return -1;
        }
    }
    
    public boolean isEmpty() {
        return this.items.isEmpty();
    }
    
    public void clear() {
        this.items = new ArrayList<Integer>();
    }
    
    public int size() {
        return this.items.size();
    }
    
    public String imprimir() {
        String str = "";
        for(int i=0; i<this.items.size(); i++) {
            str += this.items.get(i)+", ";
        }
        return str;
    }
}
