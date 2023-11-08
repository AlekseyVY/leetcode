// Problem: https://leetcode.com/problems/reachable-nodes-with-restrictions/description/

class Solution {
    public HashSet<Integer> seen = new HashSet<>();;
    public Map<Integer, List<Integer>> graph = new HashMap<>();
    public int count = 0;
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        for(int i = 0; i < restricted.length; i++) seen.add(restricted[i]);
        for(int i = 0; i < edges.length; i++) {
            int edgeX = edges[i][0];
            int edgeY = edges[i][1];
            graph.computeIfAbsent(edgeX, value -> new ArrayList<Integer>()).add(edgeY);
            graph.computeIfAbsent(edgeY, value -> new ArrayList<Integer>()).add(edgeX);
        }
        dfs(0);
        return count;
    }

    public void dfs(int node) {
        count++;
        seen.add(node);
        for(int neighbor: graph.get(node)) {
            if(!seen.contains(neighbor)) {
                dfs(neighbor);
            }
        }
    }
}
