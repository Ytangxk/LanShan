package cn.ytangxk.game;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.lang.invoke.ConstantCallSite;
import java.util.Random;
import java.util.Vector;

/**
 * @ClassName GameFrame
 * @Description TODO
 * @Author Tang
 * @Date 2022/7/30 21:53
 * @Version 1.0
 **/


public class GameFrame extends JFrame {

    //创建英雄机
    static HeroPlane heroPlane;
    //定义子弹集合
    Vector<Shoot> shoots = new Vector<>();

    Vector<EnemyPlane> enemyPlanes = new Vector<>();

    int y = -1060;
    boolean over;

//    static Image img;
//
//    static Toolkit tk = Toolkit.getDefaultToolkit();
//
//    static {
//        img = tk.createImage("src\\img\\bj.jpg");
//    }

    public GameFrame frame;

    public GameFrame() {
        frame = this;
        //创建英雄机
        heroPlane = new HeroPlane(220, 450);
        heroPlane.start();
        //大小
        setSize(500, 760);
        //标题
        setTitle("**雷霆战机**");
        //关闭
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //禁止调整边框大小
        setResizable(false);
        //放置中心
        setLocationRelativeTo(null);
        setVisible(true);

        //画板线程使背景移动
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    y += 5;
                    repaint();
                    if (y >= 0) {
                        y = -1460;
                    }
                    try {
                        Thread.sleep(15);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        );
        t1.start();
        //敌机线程
        Thread t2 = new Thread(new Runnable() {
            Random r = new Random(123);

            @Override
            public void run() {
                while (true) {
                    EnemyPlane enemyPlane = new EnemyPlane(r.nextInt(500), 0, frame);
                    enemyPlane.start();
                    enemyPlanes.add(enemyPlane);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t2.start();



//        //我机摧毁线程
//        Thread t3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    if (hit1()) {
//                        t1.interrupt();
//                        t2.interrupt();
//                    }
//                }
//            }
//            public boolean hit1() {
//                Rectangle rectangle = new Rectangle(frame.heroPlane.getX(), frame.heroPlane.getY(), frame.heroPlane.WIDTH, frame.heroPlane.HEIGHT);
//                Rectangle rectangle1 = null;
//                for (int i = 0; i < frame.enemyPlanes.size(); i++) {
//                    EnemyPlane enemyPlane = frame.enemyPlanes.get(i);
//                    rectangle1 = new Rectangle(enemyPlane.x, enemyPlane.y, enemyPlane.WIDTH, enemyPlane.HEIGHT);
//                    if (rectangle.intersects(rectangle1)) {
//                        return true;
//                    }
//                }
//                return false;
//            }
//        }
//        );
    }

    /*
     * 在窗口上画内容，paint这个画笔的方法在窗口初始化的时候会默认执行
     * */
    @Override
    public void paint(Graphics g) {
        if(over){
        }
        //System.out.println("绘制画板");
        //画背景图
        BufferedImage img = (BufferedImage) this.createImage(this.getSize().width, this.getSize().height);
        //画背景
        Graphics bi = img.getGraphics();
        bi.drawImage(new ImageIcon("src\\img\\nbj.jpg").getImage(), 0, y, 500, 760 * 3, null);
        //画玩家飞机
        bi.drawImage(heroPlane.getImg(), heroPlane.getX(), heroPlane.getY(), heroPlane.WIDTH, heroPlane.HEIGHT, null);
        //子弹画出
        for (int i = 0; i < shoots.size(); i++) {
            Shoot shoot = shoots.get(i);
            if (shoot.y > 0)
                bi.drawImage(shoot.img, shoot.x, shoot.y -= shoot.speed, shoot.WIDTH, shoot.HEIGHT, null);
            else
                shoots.remove(shoot);
        }
        //画敌机
        for (int i = 0; i < enemyPlanes.size(); i++) {
            EnemyPlane enemyPlane = enemyPlanes.get(i);
            if (enemyPlane.y < 760)
                bi.drawImage(enemyPlane.img, enemyPlane.x, enemyPlane.y += enemyPlane.speed, enemyPlane.WIDTH, enemyPlane.HEIGHT, null);
            else
                shoots.remove(enemyPlane);
        }
        //生效
        g.drawImage(img, 0, 0, null);
    }

    public static void main(String[] args) {
        Frame gameFrame = new GameFrame();
        Player player = new Player((GameFrame) gameFrame);
        //添加键盘监视器
        gameFrame.addKeyListener(player);


    }
}


