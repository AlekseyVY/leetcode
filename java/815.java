// Problem: https://leetcode.com/problems/bus-routes/description/

class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target) return 0;
        int count = 1;
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < routes.length; i++) {
            for(int stop: routes[i]) {
                ArrayList<Integer> route = graph.getOrDefault(stop, new ArrayList<>());
                route.add(i);
                graph.put(stop, route);
            }
        }
        for(int route: graph.get(source)) {
            que.add(route);
            visited.add(route);
        }
        while(!que.isEmpty()) {
            int size = que.size();
            for(int i = 0; i < size; i++) {
                int route = que.remove();
                for(int stop: routes[route]) {
                    if(stop == target) return count;
                    for(int nextRoute: graph.get(stop)) {
                        if(!visited.contains(nextRoute)) {
                            visited.add(nextRoute);
                            que.add(nextRoute);
                        }
                    }
                }
            }
            count++;
        }
        return -1;
    }
}
