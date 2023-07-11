package no1.op.weapon;

/**
 * @ClassName Weapon
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 20:11
 * @Version 1.0
 **/
// 超类：武器
public abstract class Weapon {
    private String name;
    private int damage;
    private int durability;

    public Weapon(String name, int damage, int durability) {
        this.name = name;
        this.damage = damage;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getDurability() {
        return durability;
    }
}