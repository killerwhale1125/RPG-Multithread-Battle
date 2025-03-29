package adventure.hero.wizard;

import adventure.hero.DefaultHeroType;
import adventure.hero.Hero;
import adventure.hero.Skill;
import adventure.hero.wizard.skill.Seal;
import adventure.hero.wizard.skill.Thunderbolt;

import java.util.List;

import static adventure.hero.DefaultHeroType.WIZARD;

public class Wizard extends Hero {

    private Wizard(DefaultHeroType heroType, List<Skill> skills) {
        super(heroType, skills);
    }

    public static Hero create() {
        return new Wizard(WIZARD, createDefaultSkills());
    }

    private static List<Skill> createDefaultSkills() {
        Skill thunderBolt = Thunderbolt.create();
        Skill seal = Seal.create();
        return List.of(thunderBolt, seal);
    }

    @Override
    protected void useSkill() {

    }
}
