package adventure.hero.skill.theif;

import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

import static adventure.hero.skill.theif.ThiefSkillType.TRIPLE_THROW;

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
