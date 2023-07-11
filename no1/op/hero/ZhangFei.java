package no1.op.hero;

import no1.op.skill.PaoXiaoSkill;
import no1.op.skill.TianYiSkill;

/**
 * @ClassName ZhangFei
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 21:31
 * @Version 1.0
 **/
// 子类：张飞
public class ZhangFei extends Hero {
    public ZhangFei() {
        super("张飞", 110, 18, 9);
        addSkill(new PaoXiaoSkill());
        addSkill(new TianYiSkill());
    }
}
