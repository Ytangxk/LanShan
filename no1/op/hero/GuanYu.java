package no1.op.hero;

import no1.op.skill.QingLongYanYueSkill;
import no1.op.skill.WuShengSkill;

/**
 * @ClassName GuanYu
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 21:30
 * @Version 1.0
 **/
// 子类：关羽
public class GuanYu extends Hero {
    public GuanYu() {
        super("关羽", 120, 20, 10);
        addSkill(new WuShengSkill());
        addSkill(new QingLongYanYueSkill());
    }
}