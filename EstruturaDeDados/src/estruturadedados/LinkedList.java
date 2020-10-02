package estruturadedados;

public class LinkedList {
    int count;
    Node head;
    
    public LinkedList() {
        count = 0;
        head = null;
    }
    
    public void push(int element) {
        // 14 e 15 criando um novo elemento na memoria e 
        // definir o valor de fato que ele vai armazenar
        Node no = new Node();
        no.element = element;
        
        // se a lista estiver vazia, entramos 
        if(head == null) {
            head = no;
        }else {
            Node current = this.head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = no;
        }
        this.count++;
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
            
            if(index == 0) {
                node.next = this.head;
                this.head = node;
            }else {
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