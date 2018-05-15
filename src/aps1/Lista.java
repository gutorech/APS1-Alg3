/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps1;
import java.util.Comparator;
/**
 *
 * @author Micro
 */
public class Lista<T> {

	public class Node { 
		private T dado;
		private Node next;
		private Node previous;
		
		public Node (T dado){ 
			this.dado = dado;
			this.next = next;
			this.previous = previous;
		}
		
		public void addAfter(T dado){ 
			Node novo = new Node(dado);
			Node prox = this.next;
			novo.previous = this;
			if(prox == null){
				tail = novo;
			}else{
				prox.previous = novo;
			}
			this.next = novo;
		}
		
		public void addBefore(T dado){ 
			Node novo = new Node(dado);
			Node ant = this.previous;
			novo.next = this;
			if(ant == null){
				head = novo;
			}else{
				ant.next = novo;
			}
			this.previous = novo;
		}
	}
	
	private Node head;
	private Node tail;
        
        public Node getHead() {
		return head;
	}
        public Node getTail() {
		return tail;
	}
	
	public void append(T dado){
		Node novo = new Node(dado);
		if(tail != null){
			tail.next = novo;
		}else{
			head = novo;
		}
		novo.previous = tail;
		tail = novo;
	}
	
	public void addFirst(T dado){
		Node novo = new Node(dado);
		if(head != null){
			head.previous = novo;
		}else{
			tail = novo;
		}
		novo.next = head;
		head = novo;
	}
			
	public void printObjects(){
		Lista<T>.Node i = head;
		while (i != null){
			System.out.println(i.dado);
			i = i.next;
			}
	}
    
        public void stableSort(Node head, Comparator<T> c) {
		Node atual = head;
		while (atual != null) {
			T data = atual.dado;
			Node i = atual;
			while(i.previous != null && c.compare(data, i.previous.dado) < 0) {
				i.dado = i.previous.dado;
				i = i.previous;
			}
			i.dado = data;
			atual = atual.next;
		}
	}
	
        public void efficientSort(Node head, Comparator<T> cmp) {
        }
         
        
}
