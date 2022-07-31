package cn.ytangxk.game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;

/**
 * @ClassName Player
 * @Description 键盘控制
 * @Author Tang
 * @Date 2022/7/30 22:59
 * @Version 1.0
 **/
public class Player extends KeyAdapter {
    GameFrame frame;

    public Player(GameFrame frame){
        this.frame=frame;
    }
    @Override
    public void keyPressed(KeyEvent e) {
       int keycode=e.getKeyCode();
       //System.out.println(keycode);
        switch (keycode){
            case 38:
                frame.heroPlane.up=true;
                break;
            case 40:
                frame.heroPlane.down=true;
                break;
            case 37:
                frame.heroPlane.left=true;
                break;
            case 39:
                frame.heroPlane.right=true;
                break;
            case 83:
                addShoot();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keycode=e.getKeyCode();
        //System.out.println(keycode);
        switch (keycode){
            case 38:
                frame.heroPlane.up=false;
                break;
            case 40:
                frame.heroPlane.down=false;
                break;
            case 37:
                frame.heroPlane.left=false;
                break;
            case 39:
                frame.heroPlane.right=false;
                break;
        }
    }

    public void addShoot(){
        Shoot shoot=new Shoot(frame.heroPlane.getX()+1,frame.heroPlane.getY()-20,frame);
        shoot.start();
        frame.shoots.add(shoot);

    }
}
