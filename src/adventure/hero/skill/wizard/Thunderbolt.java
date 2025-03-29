package adventure.hero.skill.wizard;

import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

public class Thunderbolt extends Skill {

    private Thunderbolt(SkillType skillType) {
        super(skillType);
    }

    public static Skill create(SkillType skillType) {
        return new Thunderbolt(skillType);
    }

    @Override
    protected void use() {

    }
}
