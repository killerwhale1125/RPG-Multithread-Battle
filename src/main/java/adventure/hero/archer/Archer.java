package adventure.hero.archer;

import adventure.hero.Hero;
import adventure.hero.DefaultHeroType;
import adventure.hero.Skill;
import adventure.hero.archer.skill.CriticalShot;
import adventure.hero.archer.skill.Focus;

import java.util.List;

public class Archer extends Hero {

    private Archer(DefaultHeroType defaultHeroType, List<Skill> skills) {
        super(defaultHeroType, skills);
    }

    public static Hero create() {
        return new Archer(DefaultHeroType.ARCHER, createDefaultSkills());
    }

    private static List<Skill> createDefaultSkills() {
        Skill criticalShot = CriticalShot.create();
        Skill focus = Focus.create();
        return List.of(criticalShot, focus);
    }

    @Override
    protected void useSkill() {

    }
}
