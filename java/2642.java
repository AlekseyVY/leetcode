// Problem: https://leetcode.com/problems/design-graph-with-shortest-path-calculator/description/

class Graph {
    public Map<Integer, List<Pair<Integer, Integer>>> graph = new HashMap<>();

    public Graph(int n, int[][] edges) {
        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            Pair<Integer, Integer> connection = new Pair<>(v, w);
            graph.computeIfAbsent(u, value -> new ArrayList<Pair<Integer, Integer>>()).add(connection);
        }
    }

    public void addEdge(int[] edge) {
        int u = edge[0];
        int v = edge[1];
        int w = edge[2];
        Pair<Integer, Integer> connection = new Pair<>(v, w);
        graph.computeIfAbsent(u, value -> new ArrayList<Pair<Integer, Integer>>()).add(connection);
        System.out.println(graph);
    }

    public int shortestPath(int node1, int node2) {
        PriorityQueue<Pair<Integer, Integer>> que = new PriorityQueue<>(Comparator.comparingInt(Pair::getValue));
        Map<Integer, Integer> distances = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        que.add(new Pair(node1, 0));
        distances.put(node1, 0);
        while(!que.isEmpty()) {
            int currNode = que.poll().getKey();
            visited.add(currNode);
            if(graph.containsKey(currNode)) {
            for(Pair<Integer, Integer> neighbor: graph.get(currNode)) {
                if(!visited.contains(neighbor.getKey())) {
                    int newDist = distances.get(currNode) + neighbor.getValue();
                    if(distances.get(neighbor.getKey()) == null || newDist < distances.get(neighbor.getKey())) {
                        que.add(new Pair<>(neighbor.getKey(), newDist));
                        distances.put(neighbor.getKey(), newDist);
                    }
                }
            }
            }

        }
        return distances.get(node2) == null ? -1 : distances.get(node2);
    }
}
