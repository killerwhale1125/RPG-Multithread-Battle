package adventure.hero.skill.theif;

import adventure.hero.skill.BuffSkill;
import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

import static adventure.hero.skill.theif.ThiefSkillType.DARK_SIDE;

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
