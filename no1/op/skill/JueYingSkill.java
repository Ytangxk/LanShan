package no1.op.skill;

import no1.op.hero.Hero;

/**
 * @ClassName JueYingSkill
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 22:56
 * @Version 1.0
 **/
// 子类：技能 - 绝影
public class JueYingSkill extends Skill {
    public JueYingSkill() {
        super("绝影");
    }

    @Override
    public void use(Hero self, Hero target) {
        int skillDamage = self.getAttack() + 15;
        target.takeDamage(skillDamage);
        System.out.println(self.getName() + "使用了绝影技能，对" + target.getName() + "造成了" + skillDamage + "点伤害。");
    }
}