package adventure.hero.warrior.skill;

import adventure.hero.BuffSkill;
import adventure.hero.Skill;
import adventure.hero.SkillType;

import static adventure.hero.warrior.skill.WarriorSkillType.IRON_WALL;

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
