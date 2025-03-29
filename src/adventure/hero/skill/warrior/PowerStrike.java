package adventure.hero.skill.warrior;

import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

public class PowerStrike extends Skill {

    private PowerStrike(SkillType skillType) {
        super(skillType);
    }

    public static Skill create(SkillType skillType) {
        return new PowerStrike(skillType);
    }

    @Override
    protected void use() {

    }
}
