package adventure.hero;

import adventure.hero.skill.Skill;

import java.util.List;

import static adventure.hero.DefaultHeroType.*;

public abstract class Hero {

    protected String name;
    protected int hp;
    protected int power;
    protected List<Skill> skills;

    protected Hero(int hp, String name, int power, List<Skill> skills) {
        this.hp = hp;
        this.name = name;
        this.power = power;
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
