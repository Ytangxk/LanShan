package cn.ytangxk.game;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName EnemyPlane
 * @Description TODO
 * @Author Tang
 * @Date 2022/7/31 10:57
 * @Version 1.0
 **/
public class EnemyPlane extends Thread {
    public GameFrame frame;
    int x;
    int y;
    int WIDTH = 50;
    int HEIGHT = 50;
    int speed = 3;
    Image img = new ImageIcon("src\\img\\敌方大飞机（红）.png").getImage();

    public EnemyPlane(int x, int y, GameFrame frame) {
        this.x = x;
        this.y = y;
        this.frame = frame;
    }

    public EnemyPlane(GameFrame frame, int x, int y, int WIDTH, int HEIGHT) {
        this.frame = frame;
        this.x = x;
        this.y = y;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
    }

    @Override
    public void run() {
        while (true) {
            //向左走
            //碰撞到了
            if (hit()) {
                this.speed = 0;
                this.img = new ImageIcon("src\\img\\爆炸.png").getImage();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                frame.enemyPlanes.remove(this);
                break;
            }
            if (y >= 760 || x > 500) {
                frame.enemyPlanes.remove(this);
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (hit1()) {
                this.speed = 0;
                this.img = new ImageIcon("src\\img\\爆炸.png").getImage();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                frame.enemyPlanes.remove(this);
                break;
            }
            if (y >= 760 || x > 500) {
                frame.enemyPlanes.remove(this);
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
        Rectangle rectangle = new Rectangle(this.x, this.y, this.WIDTH, this.HEIGHT);
        Rectangle rectangle1 = null;
        for (int i = 0; i < frame.shoots.size(); i++) {
            Shoot shoot = frame.shoots.get(i);
            rectangle1 = new Rectangle(shoot.x, shoot.y - 1, shoot.WIDTH, shoot.HEIGHT);
            //碰撞检测
            if (rectangle.intersects(rectangle1)) {
                return true;
            }
        }
        return false;
    }

    public boolean hit1() {
        Rectangle rectangle = new Rectangle(this.x, this.y, this.WIDTH, this.HEIGHT);
        Rectangle rectangle1 = new Rectangle(frame.heroPlane.getX(), frame.heroPlane.getY(), frame.heroPlane.WIDTH, frame.heroPlane.HEIGHT);
        if (rectangle.intersects(rectangle1)) {
            return true;
        }
        return false;
    }
}
