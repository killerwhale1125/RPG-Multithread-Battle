package adventure.hero.warrior.skill;

import adventure.hero.Skill;
import adventure.hero.SkillType;

import static adventure.hero.warrior.skill.WarriorSkillType.POWER_STRIKE;

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
