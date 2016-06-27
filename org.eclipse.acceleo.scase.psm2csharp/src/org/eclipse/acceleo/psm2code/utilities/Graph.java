package org.eclipse.acceleo.psm2code.utilities;

import java.util.ArrayList;
import java.util.Iterator;

public class Graph<T> {
    
	private int size;
	private ArrayList<Vertex<T>> vertexList;
	private boolean adjMat[][];
	private int nVerts;
	//--------------------------------------------------
	
	public Graph(int size){
		this.vertexList = new ArrayList<Vertex<T>>(size);
		this.adjMat = new boolean[size][size];
		this.size = size;
		this.nVerts = 0;
		
		for (int i=0 ; i<this.size ; i++)
			for (int j=0 ; j<this.size ; j++)
				adjMat[i][j] = false;
	
	}
	
	public int addVertex(T data){
		
		Vertex<T> vertex = new Vertex<T>(data);
		this.vertexList.add(vertex);
		this.nVerts++;
		return this.vertexList.indexOf(vertex);
	}
	
	public void addEdge(int start , int end){
		adjMat[start][end] = true;
	}
	
	public int getVertexIndex(Vertex<T> vertex){
		return this.vertexList.indexOf(vertex);
	}
	
	public int getVertexIndex(T vertexData){
		return this.vertexList.indexOf(this.getVertex(vertexData));
	}
	
	public Vertex<T> getVertex(T vertexData){
		for(Iterator<Vertex<T>> i = this.vertexList.iterator(); i.hasNext() ; ){
			Vertex<T> vertex = i.next();
			if (vertex.data == vertexData) return vertex;
		}
		return null;
	}
		
	public T getVertexData(int index){
		return this.vertexList.get(index).data;
	}
	
	public ArrayList<Vertex<T>> getVertexList(){
		return this.vertexList;
	}
	
	public ArrayList<T> getAdjData(T vertexData){
		ArrayList<T> adjData = new ArrayList<T>();
		int vIndex = this.getVertexIndex(vertexData);
		
		for(int i = 0 ; i < this.size ; i++){
			if (this.adjMat[vIndex][i]) {
				adjData.add(this.getVertexData(i));
			}
		}
		return adjData;
		
	}
	
	public boolean isTargetByMult(T vertexData){
		
		int index = this.getVertexIndex(vertexData);
		int count = 0;
		for (int j = 0 ; j < this.size ; j++){
			if (this.adjMat[j][index]) count++;
			if (count > 1) return true;
		}
		return false;
	}
	
	public void printGraph(){
		System.out.println(this.size);
		
		for (int i=0 ; i<this.size ; i++){
			System.out.println();
			for (int j=0 ; j<this.size ; j++){
				System.out.print(adjMat[i][j] ? 1 : 0);
			}
		}
	}
	
	public static class Vertex<T>{
		private T data;
		
		public Vertex(T data){
			this.data = data;
		}
	}
	
}
