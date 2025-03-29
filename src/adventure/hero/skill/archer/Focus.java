package adventure.hero.skill.archer;

import adventure.hero.skill.BuffSkill;
import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

import static adventure.hero.skill.archer.ArcherSkillType.FOCUS;

public class Focus extends Skill implements BuffSkill {

    private Focus(SkillType skillType) {
        super(skillType);
    }

    public static Skill create() {
        return new Focus(FOCUS);
    }

    @Override
    public void applyBuff() {

    }

    @Override
    protected void use() {

    }
}
