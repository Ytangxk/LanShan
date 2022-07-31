package cn.ytangxk.game;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName HeroPlane
 * @Description TODO
 * @Author Tang
 * @Date 2022/7/30 22:24
 * @Version 1.0
 **/
public class HeroPlane extends Thread {
    @Override
    public void run() {
        while (true) {
            if(this.x<=10){
                this.x=10;
                left=false;
            }
            if(this.x>=450)
            {
                this.x=450;
                right=false;
            }
            if(this.y<=0){
                this.y=0;
                up=false;
            }
            if(this.y>=700){
                this.y=700;
                down=false;
            }
            if (up) {
                y = y - speed;
            }
            if (down) {
                y += speed;
            }
            if (left) {
                x -= speed;
            }
            if (right) {
                x += speed;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //英雄机在画板上的位置

    private int x = 230;
    private int y = 600;
    public int speed = 8;
    public long score=0;
    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;

    //定义方向键标志
    boolean up, down, left, right;


    private Image img = new ImageIcon("src\\img\\fly.png").getImage();

    public HeroPlane() {
    }

    public HeroPlane(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Image getImg() {
        return img;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setImg(Image img) {
        this.img = img;
    }
}
