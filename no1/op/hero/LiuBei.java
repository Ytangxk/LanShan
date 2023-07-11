package no1.op.hero;

import no1.op.skill.RenDeSkill;
import no1.op.skill.ZhiHengSkill;

/**
 * @ClassName LiuBei
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 21:30
 * @Version 1.0
 **/
// 子类：刘备
public class LiuBei extends Hero {
    public LiuBei() {
        super("刘备", 100, 15, 8);
        addSkill(new RenDeSkill());
        addSkill(new ZhiHengSkill());
    }
}