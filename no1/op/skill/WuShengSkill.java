package no1.op.skill;

import no1.op.hero.Hero;

/**
 * @ClassName WuShengSkill
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 21:47
 * @Version 1.0
 **/
// 子类：技能 - 武圣
public class WuShengSkill extends Skill {
    public WuShengSkill() {
        super("武圣");
    }

    @Override
    public void use(Hero self, Hero target) {
        int skillDamage = self.getAttack() + 15;
        target.takeDamage(skillDamage);
        System.out.println(self.getName() + "使用了武圣技能，对" + target.getName() + "造成了" + skillDamage + "点伤害。");
    }
}