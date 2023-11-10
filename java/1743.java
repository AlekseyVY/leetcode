// Problem: https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/description/

class Solution {
    public Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
    public Set<Integer> seen = new HashSet<>();
    public int root = 0;
    public List<Integer> result = new ArrayList<>();
    public int[] restoreArray(int[][] adjacentPairs) {
        for(int[] edge: adjacentPairs) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, value -> new ArrayList<Integer>()).add(v);
            graph.computeIfAbsent(v, value -> new ArrayList<Integer>()).add(u);
        }
        graph.forEach((key, val) -> {
            if(val.size() == 1) {
                root = key;
                return;
            }
        });
        dfs(root);
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    public void dfs(int node) {
        seen.add(node);
        result.add(node);
        for(int neighbor: graph.get(node)) {
            if(!seen.contains(neighbor)) {
                seen.add(neighbor);
                dfs(neighbor);
            }
        }
    }
}
