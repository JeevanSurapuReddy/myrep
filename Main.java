package ConnectedComponents;

import java.util.ArrayList;

public class Main {

	public static int vertices = 6;
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    
	public static void main(String[] args) {
		
		Main g = new Main();
        for (int i = 0; i < vertices; i++)
            graph.add(i, new ArrayList<>());
        g.createEdge(0, 2);
        g.createEdge(0, 3);
        g.createEdge(2, 1);
        g.createEdge(4, 5);
        g.connected_components();

	}
	
	public void createEdge(int a, int b)
    {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }
	
	public void connected_components()
    {
		System.out.println("Connected components are: ");
        boolean[] visited = new boolean[vertices];
        for (int v=0;v<vertices;v++) {
            if (!visited[v]) {
                traverse(visited, v);
                System.out.println();
            }
        }
    }
 
	public void traverse(boolean visited[], int v)
    {
        visited[v] = true;
        System.out.print(v + " ");
        for (int x:graph.get(v)) {
            if (!visited[x])
            	traverse(visited, x);
        }
    }
    
}
