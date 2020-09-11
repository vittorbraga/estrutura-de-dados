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
}