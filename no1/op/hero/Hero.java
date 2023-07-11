package no1.op.hero;

import no1.op.skill.Skill;
import no1.op.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 超类：英雄
public abstract class Hero {
    private String name;
    private int health;
    private int attack;
    private int defense;
    private Weapon equippedWeapon;
    private List<Skill> skills;

    public Hero(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.skills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void attack(Hero target) {
        int damage = Math.max(0, getAttack() - target.getDefense());
        target.takeDamage(damage);
        System.out.println(name + "攻击了" + target.getName() + "，造成了" + damage + "点伤害。");
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            System.out.println(name + "被击败了。");
        }
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
        System.out.println(name + "学会了技能：" + skill.getName());
    }

    public void useSkill(Hero target) {
        if (skills.isEmpty()) {
            System.out.println(name + "没有技能可用。");
            return;
        }

        System.out.println("请选择技能：");
        for (int i = 0; i < skills.size(); i++) {
            System.out.println((i + 1) + ". " + skills.get(i).getName());
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice < 1 || choice > skills.size()) {
            System.out.println("选择无效！");
            return;
        }

        Skill selectedSkill = skills.get(choice - 1);
        selectedSkill.use(this, target);
    }
    public void equipWeapon(Weapon weapon) {
        equippedWeapon = weapon;
        System.out.println(name + "装备了武器：" + weapon.getName());
        this.attack += weapon.getDamage();
    }
}