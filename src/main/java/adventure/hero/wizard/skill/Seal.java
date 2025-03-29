package adventure.hero.wizard.skill;

import adventure.hero.BuffSkill;
import adventure.hero.Skill;
import adventure.hero.SkillType;

import static adventure.hero.wizard.skill.WizardSkillType.SEAL;

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
