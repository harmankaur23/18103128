import java.util.*;

public class ques3 {
    public static class Edge {
        // double cost;
        int src, dest,cost;

        public Edge(int from, int to, int cost) {
            this.src = from;
            this.dest = to;
            this.cost = cost;
        }
    }

    public static void printAllPath(ArrayList<Edge> edges, int start, int dis, ArrayList<Integer> temp, boolean[] visited) {
        temp.add(start);
        visited[start] = true;
        if (start == dis) {
            System.out.print("\nPath: ");
            for (int i : temp)
                System.out.print(i + " ");
            visited[start] = false;
            temp.remove(temp.size() - 1);
            return;
        }

        for(Edge i:edges) {
            if(i.src==start)
            {
            if (!visited[i.dest]) {
                printAllPath(edges, i.dest, dis, temp, visited);
            }
          }
        }
        visited[start] = false;
        temp.remove(temp.size() - 1);
    }

    public static int bellmanFord(ArrayList<Edge> edges, int n, int src, int dest){
		int m = edges.size();
		int dist[] = new int[n];
		Arrays.fill(dist,Integer.MAX_VALUE);
		dist[src] = 0;
		for(int i = 1;i<n;i++){
			for(Edge edge:edges){
				int u = edge.src;
				int v = edge.dest;
				int w = edge.cost;
				if(dist[u]!=Integer.MAX_VALUE&&dist[v]>dist[u]+w){
					dist[v] = dist[u]+w;
				}
			}
		}
		for(Edge edge:edges){
			int u = edge.src;
			int v = edge.dest;
			int w = edge.cost;
			if(dist[u] != Integer.MAX_VALUE && dist[u]+w<dist[v]){
                System.out.println("Graph contains negative weight cycle");
                return 0;
			}
        }
        // System.out.println(dist[dest]);
        if(dist[dest]==Integer.MAX_VALUE)
        {
        System.out.println("No path");
        return 0;
        }
        else
        {
            System.out.println("Shortest path is "+(dist[dest]));
            return 1;
        }
	}

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
    	System.out.print("Enter no. of vertices in graph:\n");
    	int n = sc.nextInt();
    	System.out.print("Enter no. of edges in graph:\n");
    	int m = sc.nextInt();
    	ArrayList<Edge> edges = new ArrayList<Edge>(m);
    	System.out.print("Enter the edges in the format:\nSource Destination Cost\n");
    	for(int i = 0;i<m;i++){
    		edges.add(new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    	}
    	System.out.print("Enter source vertex:\n");
    	int src = sc.nextInt();
    	System.out.print("Enter destination vertex:\n");
    	int dest = sc.nextInt();
        int t=bellmanFord(edges ,n,src,dest);
        if(t==1)
        {
            System.out.println("All path from src to dis : ");
            ArrayList<Integer> temp = new ArrayList<Integer>();
            boolean[] visited = new boolean[n];
            printAllPath(edges,src,dest,temp, visited);
        }
 
        sc.close();
    }
}