package adventure.hero.wizard.skill;

import adventure.hero.Skill;
import adventure.hero.SkillType;

import static adventure.hero.wizard.skill.WizardSkillType.THUNDER_BOLT;

public class Thunderbolt extends Skill {

    private Thunderbolt(SkillType skillType) {
        super(skillType);
    }

    public static Skill create() {
        return new Thunderbolt(THUNDER_BOLT);
    }

    @Override
    protected void use() {

    }
}
