package adventure.hero.archer.skill;

import adventure.hero.Skill;
import adventure.hero.SkillType;

import static adventure.hero.archer.skill.ArcherSkillType.CRITICAL_SHOT;

public class CriticalShot extends Skill {

    private CriticalShot(SkillType skillType) {
        super(skillType);
    }

    public static Skill create() {
        return new CriticalShot(CRITICAL_SHOT);
    }

    @Override
    protected void use() {

    }
}
