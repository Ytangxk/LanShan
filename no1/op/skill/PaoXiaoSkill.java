package no1.op.skill;

import no1.op.hero.Hero;

/**
 * @ClassName PaoXiaoSkill
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 21:48
 * @Version 1.0
 **/
// 子类：技能 - 咆哮
public class PaoXiaoSkill extends Skill {
    public PaoXiaoSkill() {
        super("咆哮");
    }

    @Override
    public void use(Hero self, Hero target) {
        int skillDamage = self.getAttack() + 12;
        target.takeDamage(skillDamage);
        System.out.println(self.getName() + "使用了咆哮技能，对" + target.getName() + "造成了" + skillDamage + "点伤害。");
    }
}
