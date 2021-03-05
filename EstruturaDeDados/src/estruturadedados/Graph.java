package estruturadedados;


import java.util.ArrayList;
import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vittor
 */
public class Graph {
    ArrayList<String> vertices;
    Hashtable<String, ArrayList<String>> adjList;
    
    public Graph() {
        vertices = new ArrayList<String>();
        adjList = new Hashtable<String, ArrayList<String>>();
    }
    
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
        this.adjList.get(vertice).add(adjacente);
        this.adjList.get(adjacente).add(vertice);
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
    
    public void breadthFirstSearch() {
        Hashtable<String, Integer> color = this.initializeColor();
        Queue fila = new Queue();
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
    
    public void BFS(String verticeInicial) {
        Hashtable<String, Integer> color = this.initializeColor();
        Queue fila = new Queue();
        Hashtable<String, Integer> distancias = new Hashtable<String, Integer>();
        Hashtable<String, String> predecesores = new Hashtable<String, String>();
        fila.enqueue(verticeInicial);
        for(int i=0; i<this.vertices.size(); i++) {
            distancias.put(this.vertices.get(i), 0);
            predecesores.put(this.vertices.get(i), "");
        }
        while(!fila.isEmpty()) {
            String verticeAtual = fila.dequeue();
            ArrayList<String> vizinhos = adjList.get(verticeAtual);
            color.put(verticeAtual, 1);
            for(int i=0; i<vizinhos.size(); i++) {
                String verticeVizinho = vizinhos.get(i);
                if(color.get(verticeVizinho) == 0) {
                    color.put(verticeVizinho, 1);
                    distancias.put(verticeVizinho, distancias.get(verticeAtual) + 1);
                    predecesores.put(verticeVizinho, verticeAtual);
                    fila.enqueue(verticeVizinho);
                }
            }
            color.put(verticeAtual, 2);
            System.out.println("Vertice visitado: " + verticeAtual);
        }
        System.out.println(distancias.toString());
        System.out.println(predecesores.toString());
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
        System.out.println("Vertice visitado: " + vertice);
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
