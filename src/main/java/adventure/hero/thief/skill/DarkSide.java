package adventure.hero.thief.skill;

import adventure.hero.BuffSkill;
import adventure.hero.Skill;
import adventure.hero.SkillType;

import static adventure.hero.thief.skill.ThiefSkillType.DARK_SIDE;

public class DarkSide extends Skill implements BuffSkill {

    private DarkSide(SkillType skillType) {
        super(skillType);
    }

    public static Skill create() {
        return new DarkSide(DARK_SIDE);
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
