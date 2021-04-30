package estruturadedados;

public class LinkedList {
	int count = 0;
    Node head = null;
    
    public void push(int element) {
        Node no = new Node();  // Criacao no que queremos adicionar
        no.element = element;  // Adicionando o valor dentro do no

        if(head == null) { // verifica se a lista esta vazia
            head = no; // se estiver vazia, head recebe o no que acabamos de criar
        }else { // No caso da lista nao estar vazia, entramos nesse else
            Node current = this.head;       // criamos a variavel current, que sera 
            								// responsavel por CAMINHAR pela lista
            while(current.next != null) {  // Enquanto nao chegarmos no final da lista 
                current = current.next;    // atribuimos a current o proximo elemento
            }
            current.next = no;             // atribuimos o no que acabamos de criar como 
            								// referencia do ultimo elemento da lista
        }
        this.count++;						// incrementa a quantidade de elementos na lista
    }
    
    public int removeAt(int index) {
        if(index >= 0 && index < this.count) {
            Node current = this.head;
            if(index == 0) {
                this.head = current.next;
            }else {
                Node previus = null;
                for(int i=0; i<index; i++) {
                    previus = current;
                    current = current.next;
                }
                previus.next = current.next;
            }
            this.count--;
            return current.element;
        }
        return -1;
    }
    
    public Node getElementAt(int index) {
        if(index >= 0 && index <= this.count) {
            Node current = this.head;
            for(int i=0; i<index && current != null; i++) {
                current = current.next;
            }
            return current;
        }
        return null;
    }
    
    public boolean insert(int element, int index) {
        if(index >= 0 && index <= this.count) {
            Node node = new Node();
            node.element = element;
            
            if(index == 0) { // insercao do elemento no inicio da lista
                node.next = this.head;
                this.head = node;
            }else { // insercao do elemento em qualquer outro local
                Node previus = this.getElementAt(index - 1);
                Node current = previus.next;
                node.next = current;
                previus.next = node;
            }
            this.count++;
            return true;
        }
        return false;
    }
    
    public int indexOf(int value) {
        Node current = this.head;
        for(int i=0; i<this.count && current != null; i++) {
            if(value == current.element) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }
    
    public int remove(int value) {
        int index = this.indexOf(value);
        return this.removeAt(index);
    }
    
    public int size() {
        return this.count;
    }
   
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public String ToString() {
        if(this.head == null) return "";
        String retorno = this.head.element+"";
        Node current = this.head.next;
        for(int i=1; i<this.size() && current != null; i++) {
            retorno = retorno + "," + current.element;
            current = current.next;
        }
        return retorno;
    }
}
