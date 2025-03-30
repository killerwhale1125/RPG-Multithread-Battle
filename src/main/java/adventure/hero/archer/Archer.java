package adventure.hero.archer;

import adventure.hero.Hero;
import adventure.hero.Skill;
import adventure.hero.archer.skill.CriticalShot;
import adventure.hero.archer.skill.Focus;

import java.util.List;

import static adventure.hero.HeroType.ARCHER;

public class Archer extends Hero {

    private Archer(List<Skill> skills) {
        super(ARCHER, skills);
    }

    public static Hero create() {
        return new Archer(createDefaultSkills());
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
