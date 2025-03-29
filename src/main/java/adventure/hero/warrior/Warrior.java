package adventure.hero.warrior;

import adventure.hero.DefaultHeroType;
import adventure.hero.Hero;
import adventure.hero.Skill;
import adventure.hero.warrior.skill.IronWall;
import adventure.hero.warrior.skill.PowerStrike;

import java.util.List;

import static adventure.hero.DefaultHeroType.WARRIOR;

public class Warrior extends Hero {

    private Warrior(DefaultHeroType heroType, List<Skill> skills) {
        super(heroType, skills);
    }

    public static Hero create() {
        return new Warrior(WARRIOR, createDefaultSkills());
    }

    private static List<Skill> createDefaultSkills() {
        Skill powerStrike = PowerStrike.create();
        Skill ironWall = IronWall.create();
        return List.of(powerStrike, ironWall);
    }

    @Override
    protected void useSkill() {

    }
}
