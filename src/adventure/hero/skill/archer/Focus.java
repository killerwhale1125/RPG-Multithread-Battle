package adventure.hero.skill.archer;

import adventure.hero.skill.BuffSkill;
import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

public class Focus extends Skill implements BuffSkill {

    private Focus(SkillType skillType) {
        super(skillType);
    }

    public static Skill create(SkillType skillType) {
        return new Focus(skillType);
    }

    @Override
    public void applyBuff() {

    }

    @Override
    protected void use() {

    }
}
