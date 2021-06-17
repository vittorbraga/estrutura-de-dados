package estruturadedados;

import java.util.ArrayList;
import java.util.Hashtable;

public class Graph {
	ArrayList<String> vertices = new ArrayList<String>();
	Hashtable<String, ArrayList<String>> adjList = new Hashtable<String, ArrayList<String>>();
	
	public void addVertex(String vertice) {
        if(!this.vertices.contains(vertice)) {
            this.vertices.add(vertice);
            this.adjList.put(vertice, new ArrayList<String>());
        }
    }
	
	public void addEdge(String vertice, String adjacente) {
        if(this.adjList.get(vertice) == null) {
            this.addVertex(vertice);
        }
        if(this.adjList.get(adjacente) == null) {
            this.addVertex(adjacente);
        }
        ArrayList<String> listaLigada = this.adjList.get(vertice);
        listaLigada.add(adjacente);
        
        listaLigada = this.adjList.get(adjacente);
        listaLigada.add(vertice);
    }
	
	public String ToString() {
        String retorno = "";
        for(int i=0; i<this.vertices.size(); i++) {
            retorno += this.vertices.get(i) + " -> ";
            ArrayList<String> vizinhos = this.adjList.get(this.vertices.get(i));
            for(int j=0; j<vizinhos.size(); j++) {
                retorno += vizinhos.get(j) + " ";
            }
            retorno += "\r\n";
        }
        return retorno;
    }
	
	private Hashtable<String, Integer> initializeColor() {
        //0: Branco
        //1: Cinza
        //2: Preto
        Hashtable<String, Integer> color = new Hashtable<String, Integer>();
        for(int i=0; i<vertices.size(); i++) {
            color.put(this.vertices.get(i), 0);
        }
        return color;
    }
	
	public void breadthFirstSearch() throws InterruptedException {
        Hashtable<String, Integer> color = this.initializeColor();
        sun.misc.Queue<String> fila = new sun.misc.Queue<String>();
        fila.enqueue(this.vertices.get(0));
        while(!fila.isEmpty()) {
            String verticeAtual = fila.dequeue();
            ArrayList<String> vizinhos = adjList.get(verticeAtual);
            color.put(verticeAtual, 1);
            for(int i=0; i<vizinhos.size(); i++) {
                String verticeVizinho = vizinhos.get(i);
                if(color.get(verticeVizinho) == 0) {
                    color.put(verticeVizinho, 1);
                    fila.enqueue(verticeVizinho);
                }
            }
            color.put(verticeAtual, 2);
            System.out.println("Vertice visitado/totalmente explorado: " + verticeAtual);
        }
    }
	
	public void depthFirstSearch() {
        Hashtable<String, Integer> color = this.initializeColor();
        for(int i=0; i< this.vertices.size(); i++) {
            if(color.get(vertices.get(i)) == 0) {
                depthFirstSearchVisit(vertices.get(i), color);
            }
        }
    }
    private void depthFirstSearchVisit(String vertice, Hashtable<String, Integer> color) {
        color.put(vertice, 1);
        ArrayList<String> vizinhos = adjList.get(vertice);
        for(int i=0; i<vizinhos.size(); i++) {
            String verticeVizinho = vizinhos.get(i);
            if(color.get(verticeVizinho) == 0) {
                depthFirstSearchVisit(verticeVizinho, color);
            }
        }
        color.put(vertice, 2);
    }
}
