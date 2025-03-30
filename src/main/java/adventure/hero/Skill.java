package adventure.hero;

import lombok.Getter;

@Getter
public abstract class Skill {
    private final String name;
    private final int power;
    private final int manaCost;
    private final boolean basic;

    public Skill(SkillType skillType) {
        this.name = skillType.getName();
        this.power = skillType.getPower();
        this.manaCost = skillType.getManaCost();
        this.basic = skillType.isBasic();
    }

    protected abstract void use();
}
