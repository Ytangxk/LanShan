package no1.op.skill;

import no1.op.hero.Hero;

/**
 * @ClassName Skill
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 21:47
 * @Version 1.0
 **/
// 超类：技能
public abstract class Skill {
    private String name;

    public Skill(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void use(Hero self, Hero target);
}
