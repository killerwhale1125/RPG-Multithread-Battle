package adventure.hero.skill.archer;

import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

public class CriticalShot extends Skill {

    private CriticalShot(SkillType skillType) {
        super(skillType);
    }

    public static Skill create(SkillType skillType) {
        return new CriticalShot(skillType);
    }

    @Override
    protected void use() {

    }
}
