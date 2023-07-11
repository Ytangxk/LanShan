package no1.op.hero;

import no1.op.skill.JueYingSkill;
import no1.op.skill.LongDanSkill;

/**
 * @ClassName ZhaoYun
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 21:31
 * @Version 1.0
 **/
// 子类：赵云
public class ZhaoYun extends Hero {
    public ZhaoYun() {
        super("赵云", 100, 20, 8);
        addSkill(new LongDanSkill());
        addSkill(new JueYingSkill());
    }
}