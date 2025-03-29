package adventure.hero.skill.theif;

import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

public class TripleThrow extends Skill {
    private TripleThrow(SkillType skillType) {
        super(skillType);
    }

    public static Skill create(SkillType skillType) {
        return new TripleThrow(skillType);
    }

    @Override
    protected void use() {

    }
}
