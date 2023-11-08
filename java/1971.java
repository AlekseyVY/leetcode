// Problem: https://leetcode.com/problems/find-if-path-exists-in-graph/description/

class Solution {
    public Set<Integer> seen = new HashSet<>();
    public Map<Integer, List<Integer>> graph = new HashMap<>();
    boolean isReachable = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length == 0) return true;
        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, value -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, value -> new ArrayList<>()).add(u);
        }

        dfs(source, destination);
        return isReachable;
    }

    public void dfs(int node, int destination) {
        if(node == destination) {
            isReachable = true;
        }
        seen.add(node);
        for(int neighbor: graph.get(node)) {
            if(!seen.contains(neighbor)) {
                dfs(neighbor, destination);
            }
        }
    }
}
