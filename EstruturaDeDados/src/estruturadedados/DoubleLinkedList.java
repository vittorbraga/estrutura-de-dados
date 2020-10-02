/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

/**
 *
 * @author vittor
 */
public class DoubleLinkedList {
    int count;
    DoubleNode head = null;
    DoubleNode tail = null;
    
    public DoubleLinkedList() {
        count = 0;
        head = null;
        tail = null;
    }
    
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
            
            if(index == 0) {
                if(this.count == 0) {
                    this.head = doubleNo;
                    this.tail = doubleNo;
                }else {
                    doubleNo.next = this.head;
                    this.head.previous = doubleNo;
                    this.head = doubleNo;
                }
            }else if(index == this.count) {
                current = this.tail;
                current.next = doubleNo;
                doubleNo.previous = current;
                this.tail = doubleNo;
            }else {
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
            
            if(index == 0) {
                this.head = this.head.next;
                if(this.count == 1) {
                    this.tail = null;
                }else {
                    this.head.previous = null;
                }
            }else if(index == this.count -1) {
                current = this.tail;
                this.tail = this.tail.previous;
                this.tail.next = null;
            }else {
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