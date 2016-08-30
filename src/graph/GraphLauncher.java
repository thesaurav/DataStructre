package graph;

/**
 * Created by SauravKumar on 28-08-2016.
 */
public class GraphLauncher
{
    public static void main(String[] args)
    {
        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS_Traversal(2);


        DFS dfs = new DFS(4);

        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 0);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal");

        dfs.DFS_Traversal();

    }
}
