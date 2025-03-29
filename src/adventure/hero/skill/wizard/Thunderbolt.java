package adventure.hero.skill.wizard;

import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

import static adventure.hero.skill.wizard.WizardSkillType.THUNDER_BOLT;

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
