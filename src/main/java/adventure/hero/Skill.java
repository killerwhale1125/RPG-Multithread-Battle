package adventure.hero;

public abstract class Skill {
    protected final String name;
    protected final int power;
    protected final int manaCost;
    protected final boolean basic;

    public Skill(SkillType skillType) {
        this.name = skillType.getName();
        this.power = skillType.getPower();
        this.manaCost = skillType.getManaCost();
        this.basic = skillType.isBasic();
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getManaCost() {
        return manaCost;
    }

    protected abstract void use();
}
