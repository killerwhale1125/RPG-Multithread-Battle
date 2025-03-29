package adventure.hero.job;

import adventure.hero.Hero;
import adventure.hero.DefaultHeroType;
import adventure.hero.skill.Skill;
import adventure.hero.skill.archer.CriticalShot;
import adventure.hero.skill.archer.Focus;

import java.util.List;

import static adventure.hero.skill.archer.ArcherSkillType.CRITICAL_SHOT;
import static adventure.hero.skill.archer.ArcherSkillType.FOCUS;

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
