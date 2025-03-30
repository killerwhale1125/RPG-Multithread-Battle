package adventure.hero.wizard;

import adventure.hero.Hero;
import adventure.hero.Skill;
import adventure.hero.wizard.skill.Seal;
import adventure.hero.wizard.skill.Thunderbolt;

import java.util.List;

import static adventure.hero.HeroType.WIZARD;

public class Wizard extends Hero {

    private Wizard(List<Skill> skills) {
        super(WIZARD, skills);
    }

    public static Hero create() {
        return new Wizard(createDefaultSkills());
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
