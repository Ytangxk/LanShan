package no1.op.skill;

import no1.op.hero.Hero;

/**
 * @ClassName QingLongYanYueDao
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 21:46
 * @Version 1.0
 **/
// 子类：技能 - 青龙偃月刀
public class QingLongYanYueSkill extends Skill {
    public QingLongYanYueSkill() {
        super("青龙偃月刀");
    }

    @Override
    public void use(Hero self, Hero target) {
        int skillDamage = self.getAttack() + 10;
        target.takeDamage(skillDamage);
        System.out.println(self.getName() + "使用了青龙偃月刀技能，对" + target.getName() + "造成了" + skillDamage + "点伤害。");
    }
}

