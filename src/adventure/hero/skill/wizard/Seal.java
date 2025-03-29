package adventure.hero.skill.wizard;

import adventure.hero.skill.BuffSkill;
import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

import static adventure.hero.skill.wizard.WizardSkillType.SEAL;

/**
 * 보스가 일정 시간 동안 공격할 수 없음
 */
public class Seal extends Skill implements BuffSkill {

    private Seal(SkillType skillType) {
        super(skillType);
    }

    public static Skill create() {
        return new Seal(SEAL);
    }

    @Override
    public void applyBuff() {

    }

    @Override
    protected void use() {

    }
}
