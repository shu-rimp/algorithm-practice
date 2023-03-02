package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

// Programmers 게임 맵 최단거리
public class Solution14 {

    private boolean[][] visited;
    private final int[] dx = { -1, 1, 0, 0 };
    private final int[] dy = { 0, 0, -1, 1 };
    private int n;
    private int m;

    static class Xy {
        int x;
        int y;

        public Xy(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;

        visited = new boolean[n][m];

        int answer = bfs(maps, 0, 0);

        if (answer == 1) return -1;
        else return answer;
    }

    public int bfs(int[][] maps, int x, int y) {
        Queue<Xy> q = new LinkedList<>();

        q.offer(new Xy(x, y));
        visited[x][y] = true;

        while(!q.isEmpty()) {
            Xy xy = q.poll();

            for (int i=0; i<4; i++) {
                int newX = xy.x + dx[i];
                int newY = xy.y + dy[i];

                if (newX < 0 || newY < 0 || newX >= n || newY >= m) {
                    continue;
                }

                if (visited[newX][newY] || maps[newX][newY] == 0) {
                    continue;
                }

                q.offer(new Xy(newX, newY));

                maps[newX][newY] = maps[xy.x][xy.y] + 1;
                visited[newX][newY] = true;
            }
        }

        return maps[n-1][m-1];
    }

    //TODO: remove before submit
    public static void main(String[] args) {

        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int[][] maps2 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};

        Solution14 sol = new Solution14();
        // should be 11
        System.out.println(sol.solution(maps));
        // should be -1
        System.out.println(sol.solution(maps2));
    }
}
