package chapter4_trees_and_graphs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;




/*
 * Build Order: You are given a list of projects and a list of dependencies (which is a list 
 * of pairs of projects, where the second project is dependent on the first project). All of a project's 
 * dependencies must be built before the project is. Find a build order that will allow the projects to be built. 
 * If there is no valid build order, return an error.
 */
public class q7_BuildOrder {
	int len;
	HashMap<String,LinkedList<String>> dependency=new HashMap<String,LinkedList<String>>();

	public q7_BuildOrder() {

	}
	public void printDirectedGraph(String projects[]) {
		for (int i=0;i<projects.length;i++) {
			if(dependency.get(projects[i])!=null) {
				System.out.print("\n"+projects[i]+" : ");

				for(String s:dependency.get(projects[i])) {
					System.out.print(" "+s);
				}
			}
		}

	}
	public static void main(String[] args) {
		//projects: a, b, c, d, e, f
		String projects[]= {"a","b","c","d","e","f"};
		//dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)
		q7_BuildOrder g = new q7_BuildOrder();
		//		g.addEdge("d","a");
		//		g.addEdge("b","f");
		//		g.addEdge("d","b");
		//		g.addEdge("a","f");
		//		g.addEdge("c","d");

		g.addEdge("a","d");
		g.addEdge("f","b");
		g.addEdge("b","d");
		g.addEdge("f","a");
		g.addEdge("d","c");
		g.addEdge("c","a");
		g.printDirectedGraph(projects);
		g.findBuildOrder(projects,g);

	}
	public void addEdge(String src,String dest) {
		LinkedList<String> temp=new LinkedList<String>();

		if(dependency.containsKey(src)) {
			temp=dependency.get(src);
			temp.add(dest);
			dependency.put(src,temp);
		}else {
			temp.add(dest);
			dependency.put(src,temp);
		}


	}
	public  void findBuildOrder(String projects[],q7_BuildOrder g ) {
		for(String s: projects) {


			System.out.println("\n build order length : "+g.DFT(s, projects.length,projects));


		}
	}
	public  boolean DFT(String src,int length,String project[]) {
		System.out.print("\n\n");
		LinkedList<String> stk=new LinkedList<String>();
		if(dependency.get(src)!=null) {
			LinkedList<String> Q=new LinkedList<String>();
			HashMap<String,Boolean> visited=new HashMap<String,Boolean>();
			for(String s: project) {
				visited.put(s, false);

			}

			Q.push(src);
			visited.put(src, true);
//			stk.push(src);
			while(!Q.isEmpty()) {
				String s=Q.poll();

				if(dependency.get(s)!=null) {
					Iterator<String> i=dependency.get(s).iterator();
					while(i.hasNext()) {
						String v=i.next();
						if(!visited.get(v)) {
							visited.put(v, true);
							Q.push(v);
							stk.push(v);
						}
					}
				}
				if(stk.size()==dependency.size()) {
					break;
				}
			}

			int len = stk.size();
			for(String s: project) {

				if(visited.get(s)==false) {
					stk.add(s);
				}
			}
			stk.add(src);
			if(len==dependency.size()) {
				while(!stk.isEmpty()) {
					System.out.print(" "+stk.pollLast());

				}}
			return len==dependency.size()?true:false;
		}	
		return len==dependency.size()?true:false;
	}

}
