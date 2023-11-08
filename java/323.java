// Problem: https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/description/


class Solution {
    public Set<Integer> seen = new HashSet<>();
    public Map<Integer, List<Integer>> graph = new HashMap<>();
    public int count = 0;
    public int countComponents(int n, int[][] edges) {
        for(int[] edge: edges) {
            int a = edge[0];
            int b = edge[1];
            graph.computeIfAbsent(a, value -> new ArrayList<Integer>()).add(b);
            graph.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
        }
        for(int i = 0; i < n; i++) {
            if(!seen.contains(i)) {
                count++;
                seen.add(i);
                dfs(i);
            }
        }
        return count;
    }

    public void dfs(int node) {
        if(graph.get(node) != null) {
        for(int neighbor: graph.get(node)) {
            if(!seen.contains(neighbor)) {
                seen.add(neighbor);
                dfs(neighbor);
            }
        }
        }
    }
}
