package adventure.hero.warrior;

import adventure.hero.Hero;
import adventure.hero.HeroType;
import adventure.hero.Skill;
import adventure.hero.warrior.skill.IronWall;
import adventure.hero.warrior.skill.PowerStrike;

import java.util.List;

public class Warrior extends Hero {

    private Warrior(List<Skill> skills) {
        super(HeroType.WARRIOR, skills);
    }

    public static Hero create() {
        return new Warrior(createDefaultSkills());
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
