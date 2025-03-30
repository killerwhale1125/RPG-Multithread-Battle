package adventure.hero.thief;

import adventure.hero.Hero;
import adventure.hero.DefaultAbility;
import adventure.hero.HeroType;
import adventure.hero.Skill;
import adventure.hero.thief.skill.DarkSide;
import adventure.hero.thief.skill.TripleThrow;

import java.util.List;

import static adventure.hero.DefaultAbility.THIEF;
import static adventure.hero.HeroType.*;

public class Thief extends Hero {

    private Thief(List<Skill> skills) {
        super(HeroType.THIEF, skills);
    }

    public static Hero create() {
        return new Thief(createDefaultSkills());
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
