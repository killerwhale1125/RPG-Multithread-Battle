package adventure.hero.skill.theif;

import adventure.hero.skill.BuffSkill;
import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

public class DarkSide extends Skill implements BuffSkill {

    private DarkSide(SkillType skillType) {
        super(skillType);
    }

    public static Skill create(SkillType skillType) {
        return new DarkSide(skillType);
    }

    @Override
    public void use() {

    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void applyBuff() {

    }
}
