package no1.op.skill;

import no1.op.hero.Hero;

/**
 * @ClassName ZhiHuiSkill
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 21:58
 * @Version 1.0
 **/
// 子类：技能 - 智慧
public class ZhiHengSkill extends Skill {
    public ZhiHengSkill() {
        super("智慧");
    }

    @Override
    public void use(Hero self, Hero target) {
        int skillDamage = self.getAttack() + 5;
        int selfHealing = skillDamage / 2;
        self.takeDamage(skillDamage);
        self.setHealth(self.getHealth() + selfHealing);
        System.out.println(self.getName() + "使用了智慧技能，对" + target.getName() + "造成了" + skillDamage + "点伤害，同时自己恢复了" + selfHealing + "点生命值。");
    }
}