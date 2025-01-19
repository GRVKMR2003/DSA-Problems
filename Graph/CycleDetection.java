<<<<<<< HEAD
import java.util.*;

class Solution {
    public boolean canFinish(int v, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            adj.get(prerequisite[1]).add(prerequisite[0]);
        }

        int[] ind = new int[v];
        for (int i = 0; i < v; i++) {
            for (int j : adj.get(i)) {
                ind[j]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if (ind[i] == 0) {
                q.add(i);
            }
        }

        ArrayList<Integer> arrr = new ArrayList<>();

        while (!q.isEmpty()) {
            int curr = q.poll();
            arrr.add(curr);
            for (int i : adj.get(curr)) {
                ind[i]--;
                if (ind[i] == 0) {
                    q.add(i);
                }
            }
        }

        return arrr.size() == v;
    }
=======
import java.util.*;

class Solution {
    public boolean canFinish(int v, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            adj.get(prerequisite[1]).add(prerequisite[0]);
        }

        int[] ind = new int[v];
        for (int i = 0; i < v; i++) {
            for (int j : adj.get(i)) {
                ind[j]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if (ind[i] == 0) {
                q.add(i);
            }
        }

        ArrayList<Integer> arrr = new ArrayList<>();

        while (!q.isEmpty()) {
            int curr = q.poll();
            arrr.add(curr);
            for (int i : adj.get(curr)) {
                ind[i]--;
                if (ind[i] == 0) {
                    q.add(i);
                }
            }
        }

        return arrr.size() == v;
    }
>>>>>>> 184c048101027d87f3a7986bec0e4cb0bdc01456
}