package Greedy_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/*
 *  find the shortest path from a single source vertex to all other vertices in the given graph.
 */
public class DijkstrasShortestPath {

	public static void main(String[] args) {
		Graph g=new Graph(9);
		

		g.addNodes(0);
		g.addNodes(1);
		g.addNodes(2);
		g.addNodes(3);
		g.addNodes(4);
		g.addNodes(5);
		g.addNodes(6);
		g.addNodes(7);
		g.addNodes(8);
		g.printNodes();
//		g.printGraph();
		
		g.addPath(0, 1, 4);
		g.addPath(1, 2, 8);
		g.addPath(2, 3, 7);
		g.addPath(3, 4, 9);
		
		g.addPath(4, 5, 10);
		g.addPath(0, 7, 8);
		g.addPath(1, 7, 11);
		g.addPath(2, 8, 2);
		
		g.addPath(7, 8, 7);
		g.addPath(6, 5, 2);
		g.addPath(3, 5, 14);
		g.addPath(2, 5, 4);
		
		g.addPath(8, 6, 6);
		g.addPath(7, 6, 1);
		
		g.printGraph();
		
	}


}
class Graph{
	int size;
	int[][] weight;
	int[] nodeIndex;
	int last=0;
	public Graph(int size){
		this.size=size;
		nodeIndex=new int[size];
		Arrays.fill(nodeIndex,-1);
		weight= new int[size][size];
		for(int[] i:weight){
			Arrays.fill(i,-1);	
		}
		

	}
	public void printGraph(){
		for(int[] i:weight){
			System.out.print("\n");
			for(int j:i){
				System.out.print("| "+j+" | ");
			}
		}
	}
	public void printNodes(){
		for(int i:nodeIndex){
			System.out.print(" "+i);
		}
	}
	public void addNodes(int val){
		if(last>=size){
			System.out.println("\n"+"array full");
		}
		nodeIndex[last]=val;
		last++;
	}
	public void addPath(int s,int d,int wgt){
		weight[s][d]=wgt;
		weight[d][s]=wgt;
		
	}
	public void shortestPath(int s,int d){
		
		LinkedList<Integer> stack=new LinkedList<Integer>(); //stack
		stack.push(s);
		while(!stack.isEmpty()){
			
			
		}
	}


}