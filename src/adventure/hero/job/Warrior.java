package adventure.hero.job;

import adventure.hero.DefaultHeroType;
import adventure.hero.Hero;
import adventure.hero.skill.Skill;
import adventure.hero.skill.warrior.IronWall;
import adventure.hero.skill.warrior.PowerStrike;

import java.util.List;

import static adventure.hero.DefaultHeroType.WARRIOR;
import static adventure.hero.skill.warrior.WarriorSkillType.*;

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
