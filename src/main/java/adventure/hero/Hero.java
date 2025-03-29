package adventure.hero;

import java.util.List;

import static adventure.hero.DefaultHeroType.*;

public abstract class Hero {

    protected String name;
    protected int hp;
    protected int power;
    protected List<Skill> skills;

    protected Hero(DefaultHeroType heroType, List<Skill> skills) {
        this.hp = heroType.getHp();
        this.name = heroType.getName();
        this.power = heroType.getPower();
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public boolean isDefault() {
        return name.equals(DEFAULT.getName());
    }

    protected abstract void useSkill();
}
