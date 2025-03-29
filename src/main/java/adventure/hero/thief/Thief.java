package adventure.hero.thief;

import adventure.hero.Hero;
import adventure.hero.DefaultHeroType;
import adventure.hero.Skill;
import adventure.hero.thief.skill.DarkSide;
import adventure.hero.thief.skill.TripleThrow;

import java.util.List;

import static adventure.hero.DefaultHeroType.THIEF;

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
