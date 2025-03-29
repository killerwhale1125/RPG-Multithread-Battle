package adventure.hero.skill.archer;

import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

import static adventure.hero.skill.archer.ArcherSkillType.CRITICAL_SHOT;

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
