package adventure.hero.thief.skill;

import adventure.hero.Skill;
import adventure.hero.SkillType;

import static adventure.hero.thief.skill.ThiefSkillType.TRIPLE_THROW;

public class TripleThrow extends Skill {
    private TripleThrow(SkillType skillType) {
        super(skillType);
    }

    public static Skill create() {
        return new TripleThrow(TRIPLE_THROW);
    }

    @Override
    protected void use() {

    }
}
