package no1.op.skill;

import no1.op.hero.Hero;

/**
 * @ClassName TianYiSkill
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 22:55
 * @Version 1.0
 **/
// 子类：技能 - 天义
public class TianYiSkill extends Skill {
    public TianYiSkill() {
        super("天义");
    }

    @Override
    public void use(Hero self, Hero target) {
        int skillDamage = self.getAttack() + 8;
        int selfHealing = skillDamage / 2;
        self.takeDamage(skillDamage);
        self.setHealth(self.getHealth() + selfHealing);
        System.out.println(self.getName() + "使用了天义技能，对" + target.getName() + "造成了" + skillDamage + "点伤害，同时自己恢复了" + selfHealing + "点生命值。");
    }
}