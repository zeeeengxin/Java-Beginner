package datastructure;

import java.util.*;

public class BfsGraph {
	public void BFS(List<GraphNode> graph) {
		if (graph == null) {
			return; // the list is null
		}
		Queue<GraphNode> q = new LinkedList<GraphNode>();
		for (GraphNode start : graph) {
			if (start == null) // a Node is null
				continue;
			if (!start.visited) {
				start.visited = true;
				q.offer(start);
				while (!q.isEmpty()) {
					GraphNode cur = q.poll();
					System.out.println(cur);
					for (GraphNode n : cur.neighbors) {// add cur's neighbors, not start's!
						if (!n.visited) {
							n.visited = true;
							q.offer(n);
						}
					}
				}
			}
		}
	}
}
