package adventure.hero;

import java.util.List;

import static adventure.hero.DefaultHeroType.*;

public class Default extends Hero {

    private Default(DefaultHeroType defaultHeroType, List<Skill> skills) {
        super(defaultHeroType, skills);
    }

    public static Hero create() {
        return new Default(DEFAULT, List.of());
    }

    @Override
    protected void useSkill() {

    }
}
