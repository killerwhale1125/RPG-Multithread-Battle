package adventure.hero.skill.warrior;

import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

import static adventure.hero.skill.warrior.WarriorSkillType.POWER_STRIKE;

public class PowerStrike extends Skill {

    private PowerStrike(SkillType skillType) {
        super(skillType);
    }

    public static Skill create() {
        return new PowerStrike(POWER_STRIKE);
    }

    @Override
    protected void use() {

    }
}
