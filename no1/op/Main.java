package no1.op;

import no1.op.hero.*;
import no1.op.skill.*;
import no1.op.weapon.*;

import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 20:12
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Hero[] heroes = { new LiuBei(), new GuanYu(), new ZhangFei(), new ZhaoYun() };
        Weapon[] weapons = { new QingLongYanYueDao(), new ZhangBaSheMao(), new CiXiongShuangGuJian(), new ZhenWuJian(), new QiXingBaoDao() };
        Skill[] skills = { new RenDeSkill(), new ZhiHengSkill(), new WuShengSkill(), new QingLongYanYueSkill(),
                new PaoXiaoSkill(), new TianYiSkill(), new LongDanSkill(), new JueYingSkill() };

        System.out.println("请选择英雄：");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println((i + 1) + ". " + heroes[i].getName());
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice < 1 || choice > heroes.length) {
            System.out.println("选择无效！");
            return;
        }

        Hero player = heroes[choice - 1];
        Hero enemy = heroes[(int) (Math.random() * heroes.length)];

        System.out.println("请选择装备：");
        for (int i = 0; i < weapons.length; i++) {
            System.out.println((i + 1) + ". " + weapons[i].getName());
        }

        int weaponChoice = scanner.nextInt();
        if (weaponChoice >= 1 && weaponChoice <= weapons.length) {
            player.equipWeapon(weapons[weaponChoice - 1]);
        } else {
            System.out.println("选择无效！");
            return;
        }

        System.out.println("战斗开始：");
        System.out.println(player.getName() + " VS " + enemy.getName());
        System.out.println(player.getName() + "的血量：" + player.getHealth());
        System.out.println(enemy.getName() + "的血量：" + enemy.getHealth());

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            player.useSkill(enemy);
            if (enemy.getHealth() <= 0) {
                break;
            }
            enemy.useSkill(player);
            if (player.getHealth() <= 0) {
                break;
            }
        }
        System.out.println("战斗结束：");
        System.out.println(player.getName() + "的血量：" + player.getHealth());
        System.out.println(enemy.getName() + "的血量：" + enemy.getHealth());
    }
}