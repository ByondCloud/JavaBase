// 递归实现老鼠迷宫
package com.cloud;

public class MiGong {

    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][map[i].length - 1] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }


        T t = new T();
        t.findWay(map, 1, 1);
        System.out.println("找路的情况：");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class T {
    // 使用递归来解决
    // i,j 代表老鼠的位置
    // 0表示可以走，1表示障碍物，2表示可以走，3表示走过，但是走不通
    // 当map[6][5] = 2, 就表示走通了，结束
    // 先确定老鼠找路的策略 ，下右上左
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                // 我们假定可以走通
                map[i][j] = 2;
                if (findWay(map, i + 1, j)){ // 下
                    return true;
                } else if (findWay(map, i, j + 1)){ // 右
                    return true;
                } else if (findWay(map, i - 1, j)) { // 上
                    return true;
                } else if (findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
               return false;
            }
        }
    }
}
