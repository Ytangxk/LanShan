package no1.op.skill;

import no1.op.hero.Hero;

/**
 * @ClassName RenDeSkill
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 21:47
 * @Version 1.0
 **/
// 子类：技能 - 仁德
public class RenDeSkill extends Skill {
    public RenDeSkill() {
        super("仁德");
    }

    @Override
    public void use(Hero self, Hero target) {
        int skillDamage = self.getAttack() + 10;
        target.takeDamage(skillDamage);
        System.out.println(self.getName() + "使用了仁德技能，对" + target.getName() + "造成了" + skillDamage + "点伤害。");
    }
}