package graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by SauravKumar on 28-08-2016.
 */
public class BFS
{
    private int V;
    private LinkedList<Integer> adj[];

    BFS(int v)
    {
        this.V = v;
        adj = new LinkedList[v];
        for (int index = 0; index < v; index++)
        {
            adj[index] = new LinkedList();
        }
    }
        public void addEdge(int v, int w)
        {
            adj[v].add(w);
        }

        public void BFS_Traversal(int source)
        {
            boolean visited[] = new boolean[V];

            LinkedList<Integer> queue = new LinkedList<>();

            visited[source] = true;
            queue.add(source);

            while(queue.size() != 0)
            {
                source = queue.poll();
                System.out.println(source +" ");

                Iterator<Integer> iterator = adj[source].listIterator();

                while(iterator.hasNext())
                {
                    int next = iterator.next();
                    if(!visited[next])
                    {
                        visited[next] = true;
                        queue.add(next);
                    }
                }
            }
        }
}
