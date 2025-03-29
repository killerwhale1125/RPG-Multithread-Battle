package adventure.hero.job;

import adventure.hero.Hero;
import adventure.hero.DefaultHeroType;
import adventure.hero.skill.Skill;
import adventure.hero.skill.theif.DarkSide;
import adventure.hero.skill.theif.TripleThrow;

import java.util.List;

import static adventure.hero.DefaultHeroType.THIEF;
import static adventure.hero.skill.theif.ThiefSkillType.DARK_SIDE;
import static adventure.hero.skill.theif.ThiefSkillType.TRIPLE_THROW;

public class Thief extends Hero {

    private Thief(DefaultHeroType defaultHeroType, List<Skill> skills) {
        super(defaultHeroType, skills);
    }

    public static Hero create() {
        return new Thief(THIEF, createDefaultSkills());
    }


    private static List<Skill> createDefaultSkills() {
        Skill tripleThrow = TripleThrow.create();
        Skill darkSide = DarkSide.create();
        return List.of(tripleThrow, darkSide);
    }

    @Override
    protected void useSkill() {

    }

}
