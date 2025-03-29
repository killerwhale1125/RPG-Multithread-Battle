package adventure.hero.job;

import adventure.hero.Hero;
import adventure.hero.DefaultHeroType;
import adventure.hero.skill.Skill;

import java.util.List;

public class Archer extends Hero {

    private Archer(DefaultHeroType defaultHeroType, List<Skill> skills) {
        super(defaultHeroType.getHp(), defaultHeroType.getName(), defaultHeroType.getPower(), skills);
    }

    public static Hero create() {
        return new Archer(DefaultHeroType.ARCHER, createDefaultSkills());
    }

    private static List<Skill> createDefaultSkills() {
        return List.of();
    }

    @Override
    protected void useSkill() {

    }
}
