package no1.op.skill;

import no1.op.hero.Hero;

/**
 * @ClassName LongDanSkill
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 21:48
 * @Version 1.0
 **/
// 子类：技能 - 龙胆
public class LongDanSkill extends Skill {
    public LongDanSkill() {
        super("龙胆");
    }

    @Override
    public void use(Hero self, Hero target) {
        int skillDamage = self.getAttack() + 18;
        target.takeDamage(skillDamage);
        System.out.println(self.getName() + "使用了龙胆技能，对" + target.getName() + "造成了" + skillDamage + "点伤害。");
    }
}