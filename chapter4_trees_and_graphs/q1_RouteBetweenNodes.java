package chapter4_trees_and_graphs;

import java.util.Iterator;


import dataStructures.DirectedGraph;
import java.util.LinkedList;
import dataStructures.Stack;

public class q1_RouteBetweenNodes {

	public static void main(String[] args) {
		DirectedGraph g=new DirectedGraph(5);
		g.addEdge(g,0, 1);
		g.addEdge(g,0, 2);
		g.addEdge(g,0, 3);
		g.addEdge(g,1, 2);
		g.addEdge(g,1, 3);
		g.addEdge(g,2, 3);
		g.addEdge(g,2, 4);
		g.addEdge(g,3, 1);
		g.addEdge(g,4, 1);
		g.printDirectedGraph(); 

		System.out.println("\n\n"+FindRoute(g,3,0)); 
		System.out.println("\n\n"+FindRouteSelf(g,3,0)); 
	}
	// find path between 2 nodes

	public static Boolean FindRoute(DirectedGraph graph,int s,int d) {
	

		// Mark all the vertices as not visited(By default set
		// as false)
		boolean visited[] = new boolean[graph.size()];

		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[s]=true;
		queue.add(s);
		LinkedList<Integer> adj[]=graph.getAdjMat();
		// 'i' will be used to get all adjacent vertices of a vertex
		Iterator<Integer> i;
		while (queue.size()!=0)
		{
			// Dequeue a vertex from queue and print it
			s = queue.poll();
		

			int n;
			i = adj[s].listIterator();

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			while (i.hasNext())
			{
				n = i.next();

				// If this adjacent node is the destination node,
				// then return true
				if (n==d)
					return true;

				// Else, continue to do BFS
				if (!visited[n])
				{
					visited[n] = true;
					queue.add(n);
				}
			}
		}

		// If BFS is complete without visited d
		return false;



	}
	public static Boolean FindRouteSelf(DirectedGraph graph,int s,int d){

		//track of visited nodes
		boolean visited[]=new boolean[graph.size()];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);

		LinkedList<Integer> adj[]=graph.getAdjMat();
		Iterator<Integer> listIter;
		while(queue.size()!=0){
			s=queue.peekFirst();
queue.removeFirst();

			int n;
			listIter = adj[s].iterator();
			while(listIter.hasNext()){
				 n=listIter.next();
				if(n==d){
					return true;
				}
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}


			}
		}



		return false;
	}
}
