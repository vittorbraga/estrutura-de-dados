package estruturadedados;

public class DoubleLinkedList {
	int count = 0;
    DoubleNode head = null;
    DoubleNode tail = null;
    
    public DoubleNode getElementAt(int index) {
        if(index >= 0 && index <= this.count) {
            DoubleNode current = this.head;
            for(int i=0; i<index && current != null; i++) {
                current = current.next;
            }
            return current;
        }
        return null;
    }
    
    public boolean insert(int element, int index) {
        if(index >= 0 && index <= this.count) {
            DoubleNode doubleNo = new DoubleNode();
            doubleNo.element = element;
            
            DoubleNode current = this.head;
            
            if(index == 0) { // insercao no inicio da lista
                if(this.count == 0) {
                    this.head = doubleNo;
                    this.tail = doubleNo;
                }else {
                    doubleNo.next = this.head;
                    this.head.previous = doubleNo;
                    this.head = doubleNo;
                }
            }else if(index == this.count) {// insercao no final da lista
                current = this.tail;
                current.next = doubleNo;
                doubleNo.previous = current;
                this.tail = doubleNo;
            }else {// insercao em outro index que nao o inicio e o final lista
                DoubleNode previus = this.getElementAt(index - 1);
                current = previus.next;
                doubleNo.next = current;
                previus.next = doubleNo;
                current.previous = doubleNo;
                doubleNo.previous = previus;
            }
            this.count++;
            return true;
        }
        return false;
    }
    
    public int removeAt(int index) {
        if(index >= 0 && index <= this.count) {
            DoubleNode current = this.head;
            
            if(index == 0) { // remocao do primiero elemento
                this.head = this.head.next;
                if(this.count == 1) {
                    this.tail = null;
                }else {
                    this.head.previous = null;
                }
            }else if(index == this.count -1) { // remocao do ultimo elemento
                current = this.tail;
                this.tail = this.tail.previous;
                this.tail.next = null;
            }else { // remocao de qualquer outro elemento
                current = this.getElementAt(index);
                DoubleNode previus = current.previous;
                previus.next = current.next;
                current.next.previous = previus;
            }
            this.count--;
            int retorno = current.element;
            current = null;
            return retorno;
        }
        return -1;
    }
}
