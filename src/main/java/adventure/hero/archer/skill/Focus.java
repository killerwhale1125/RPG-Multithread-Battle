package adventure.hero.archer.skill;

import adventure.hero.BuffSkill;
import adventure.hero.Skill;
import adventure.hero.SkillType;

import static adventure.hero.archer.skill.ArcherSkillType.FOCUS;

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
