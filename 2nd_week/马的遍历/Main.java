package cn.Ytangxk.luogu;
import java.util.*;

public class Main {
    static Queue<note> que = new LinkedList<>();
    static int[][] map;
    static int[][] book;
    static int[][] next = {{1, 2}, {2, 1}, {-1, -2}, {-2, -1}, {1, -2}, {-2, 1}, {-1, 2}, {2, -1}};

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int tx, ty;
        map = new int[n][m];
        book = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                map[i][j] = -1;
            }
        note start = new note(x - 1, y - 1, 0);
        que.offer(start);
        book[x-1][y-1] = 1;
        map[x-1][y-1]=start.s;
        while (!que.isEmpty()) {
            note tmp = que.poll();
            for (int i = 0; i < 8; i++) {
                tx = tmp.x + next[i][0];
                ty = tmp.y + next[i][1];
                if (tx >= 0 && tx < n && ty >= 0 && ty < m && book[tx][ty] == 0) {
                    book[tx][ty] = 1;
                    que.offer(new note(tx, ty, tmp.s + 1));
                    map[tx][ty] = tmp.s + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%-5d",map[i][j]);
            }
            System.out.println("");
        }
    }
    static class note {
        int x;
        int y;
        int s;

        public note(int x, int y, int s) {
            this.s = s;
            this.x = x;
            this.y = y;
        }
    }
}


