package adventure.hero.skill.warrior;

import adventure.hero.skill.BuffSkill;
import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

/**
 * 파티원의 방어력이 증가함
 */
public class IronWall extends Skill implements BuffSkill {

    private IronWall(SkillType skillType) {
        super(skillType);
    }

    public static Skill create(SkillType skillType) {
        return new IronWall(skillType);
    }

    @Override
    public void applyBuff() {

    }

    @Override
    protected void use() {

    }
}
