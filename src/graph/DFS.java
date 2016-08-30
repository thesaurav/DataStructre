package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by SauravKumar on 28-08-2016.
 */
public class DFS
{
    private int V;
    private LinkedList<Integer> adj[];
    DFS(int v)
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

    public void DFS_Traversal()
    {
        boolean visited[] = new boolean[V];

        for (int index = 0; index < V; index++)
        {
            if (visited[index] == false)
            {
                DFSUtil_withoutRec(index , visited);
            }
        }
    }

    private void DFSUtil(int vertex, boolean [] visited)
    {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> iterator = adj[vertex].listIterator();
        while (iterator.hasNext())
        {
            int n = iterator.next();
            if (!visited[n])
            {
                DFSUtil(n, visited);
            }
        }
    }

    private void DFSUtil_withoutRec(int vertex, boolean [] visited)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(vertex);
        visited[vertex] = true;

        while(!stack.empty())
        {
            vertex = stack.pop();
            System.out.println(vertex +" ");

            Iterator<Integer> iterator = adj[vertex].listIterator();
            while (iterator.hasNext())
            {
                int next = iterator.next();
                if (!visited[next])
                {
                    stack.add(next);
                    visited[next] = true;
                }
            }
        }
    }
}
