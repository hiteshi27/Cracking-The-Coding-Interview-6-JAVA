package dataStructures;
import java.io.*;
import java.util.*;
import java.util.LinkedList;


//Topological Sort (pg 632), Dijkstra's Algorithm (pg 633), AVL Trees (pg 637), RedBlackTrees (pg 639).
public class DirectedGraph {
	int V;
	LinkedList<Integer> adjListArray[];

	public DirectedGraph(int V) {
		this.V=V;
		adjListArray=new LinkedList[V];

		for(int i = 0; i < V ; i++){
			adjListArray[i] = new LinkedList<Integer>();
			adjListArray[i].add(i);
		}
	}
	public void addEdge(DirectedGraph g,int src,int dest) {
		adjListArray[src].add(dest);
		//		adjListArray[dest].add(src);

	}

	public void printDirectedGraph() {

		for(int i=0;i<V;i++) {	
			System.out.print("\n\n ");
			System.out.print(adjListArray[i].get(0)+" : ");
			for(int j=1;j<adjListArray[i].size();j++){
				System.out.print(adjListArray[i].get(j)+" , ");
			}
			System.out.print("null");
		}
	}


	public int size() {
		return this.V;
	}
	public LinkedList<Integer>[] getAdjMat(){
		return adjListArray;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DirectedGraph g=new DirectedGraph(5);
		g.addEdge(g,0, 2);
		g.addEdge(g,0, 3);		
		g.addEdge(g,1, 0);
		g.addEdge(g,2, 1);
		g.addEdge(g,3, 4);
		g.addEdge(g,4, 0);

		//	    g.addEdge(g,1, 0);
		//        g.addEdge(g,0, 2);
		//        g.addEdge(g,2, 1);
		//        g.addEdge(g,0, 3);
		//        g.addEdge(g,1, 4);
		g.printDirectedGraph(); 
		g.DFS( 0);
		g.BFS(0);
		 g=new DirectedGraph(4);
		g.addEdge(g,0, 1);
	    g.addEdge(g,0, 2);
	    g.addEdge(g,1, 2);
	    g.addEdge(g,2, 0);
	    g.addEdge(g,2, 3);
	    g.addEdge(g,3, 3);
	    g.printDirectedGraph(); 
		g.BFS( 2);
	}
	//=========== depth first traversal
	public  void DFT(int src,boolean visited[]){

		LinkedList<Integer> Q = new LinkedList<Integer>();

		Q.push(src);

		while(!Q.isEmpty())
		{

			int s = Q.peek();
			Q.pop();
			if(!visited[s])
				visited[s]=true;
			System.out.print(s+" ");
			Iterator<Integer> i=adjListArray[s].listIterator();
			while(i.hasNext()){

				int v = i.next();
				if(!visited[v])
					Q.push(v);

			}
		}

	}

	public void DFS(int src){
		System.out.print("\n\n depth first traversal : ");
		boolean visited[]= new boolean[V];
		Arrays.fill(visited, false);
		DFT(src, visited);
		for (int i = 0; i < V; i++)
			if (!visited[i])
				DFT(i, visited);

	}
	//=========== breadth first traversal
	public void  BFT(int src,boolean visited[],LinkedList<Integer> Q ){
		Q.push(src);
		if(!visited[src])
			System.out.print(src+" ");
		while(!Q.isEmpty()){
			int s=Q.pollLast();

			visited[s]=true;
			Iterator<Integer> i=adjListArray[s].listIterator();
			while(i.hasNext()){
				int n=i.next();
				
				if(!visited[n])
				{	visited[n]=true;
					Q.push(n);
					System.out.print(n+" ");
				}
			}
		}
	
	}
	public void BFS(int src){
		System.out.print("\n\n breadth first traversal : ");
		boolean visited[]= new boolean[V];
		Arrays.fill(visited, false);
		LinkedList<Integer> Q = new LinkedList<Integer>();
		BFT(src, visited,Q);
		for (int i = 0; i < V; i++)
			if (!visited[i])
				BFT(i, visited,Q);

	}

}
