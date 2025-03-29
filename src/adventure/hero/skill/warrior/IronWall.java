package adventure.hero.skill.warrior;

import adventure.hero.skill.BuffSkill;
import adventure.hero.skill.Skill;
import adventure.hero.skill.SkillType;

import static adventure.hero.skill.warrior.WarriorSkillType.IRON_WALL;

/**
 * 파티원의 방어력이 증가함
 */
public class IronWall extends Skill implements BuffSkill {

    private IronWall(SkillType skillType) {
        super(skillType);
    }

    public static Skill create() {
        return new IronWall(IRON_WALL);
    }

    @Override
    public void applyBuff() {

    }

    @Override
    protected void use() {

    }
}
