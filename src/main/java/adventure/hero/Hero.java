package adventure.hero;

import lombok.Getter;

import java.util.List;

import static adventure.hero.DefaultAbility.DEFAULT;
import static adventure.hero.DefaultAbility.getAbility;

@Getter
public abstract class Hero {

    private String name;
    private int hp;
    private final int strong;    // 힘
    private final int intelligence; // 지능
    private final int dexterity;    // 명중률
    private final int lucky;    // 운
    private HeroType heroType;
    private List<Skill> skills;

    protected Hero(HeroType heroType, List<Skill> skills) {
        DefaultAbility ability = getAbility(heroType);
        this.hp = ability.getHp();
        this.name = ability.getName();
        this.strong = ability.getStrong();
        this.intelligence = ability.getIntelligence();
        this.dexterity = ability.getDexterity();
        this.lucky = ability.getLucky();
        this.heroType = heroType;
        this.skills = skills;
    }

    public boolean isDefault() {
        return name.equals(DEFAULT.getName());
    }

    protected abstract void useSkill();
}
