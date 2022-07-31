package cn.ytangxk.game;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName pzd
 * @Description TODO
 * @Author Tang
 * @Date 2022/7/31 10:34
 * @Version 1.0
 **/
public class Shoot extends Thread {
    GameFrame frame;
    int x;
    int y;
    int HEIGHT = 50;
    int WIDTH = 50;
    int speed = 10;
    Image img = new ImageIcon("src\\img\\我方子弹.png").getImage();

    public Shoot(int x, int y,GameFrame frame) {
        this.x = x;
        this.y = y;
        this.frame=frame;
    }

    public Shoot(int x, int y, int HEIGHT, int WIDTH) {
        this.x = x;
        this.y = y;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    public void run() {
        while (true) {
            //向左走
            //碰撞到了
            if (hit()) {
                System.out.println("得分："+(++frame.heroPlane.score));
                this.speed = 0;
                this.img=null;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                frame.shoots.remove(this);
                break;
            }
            if (y >= 760 || x > 500) {
                frame.shoots.remove(this);
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean hit() {
        Rectangle rectangle = new Rectangle(this.x, this.y-1, this.WIDTH, this.HEIGHT);
        Rectangle rectangle1 = null;

        for (int i = 0; i < frame.enemyPlanes.size(); i++) {
            EnemyPlane enemyPlane= frame.enemyPlanes.get(i);
            rectangle1 = new Rectangle(enemyPlane.x, enemyPlane.y, enemyPlane.WIDTH, enemyPlane.HEIGHT);
            //碰撞检测
            if (rectangle.intersects(rectangle1)) {
                return true;
            }
        }
        return false;
    }

}
